package com.knoldus.util

import java.io.File
import com.knoldus.ArithmaticGrammarParser.StartRuleContext
import com.knoldus.{CustomVisitor, ArithmaticGrammarParser, ArithmaticGrammarLexer, CustomArithmetic}
import com.typesafe.scalalogging.Logger
import org.antlr.v4.runtime.{CommonTokenStream, ANTLRFileStream}
import org.apache.commons.io.FileUtils
import org.scalatest.mock.MockitoSugar
import org.slf4j.LoggerFactory
import org.mockito.Mockito._

/**
  * Created by sahil on 5/29/16.
  */
object TestHelper extends MockitoSugar {

  private def getContext(filePath: String): StartRuleContext = {

    val input: ANTLRFileStream = new ANTLRFileStream(filePath)
    val lexer: ArithmaticGrammarLexer = new ArithmaticGrammarLexer(input)
    val tokens: CommonTokenStream = new CommonTokenStream(lexer)
    val parser: ArithmaticGrammarParser = new ArithmaticGrammarParser(tokens)
    val ctx: StartRuleContext = parser.startRule
    ctx
  }

  def testCustomArithmetic(packageName: String, folderName: String, fileName: String, computedValue:Int): Boolean = {

    val customVisitorMock: CustomVisitor = mock[CustomVisitor]
    when(customVisitorMock.visitStartRule(getContext(packageName + "/" + folderName + "/" + fileName))).thenReturn(computedValue)
    val customArithmetic = new CustomArithmetic
    val parsingResult: Either[Int, String] = customArithmetic.computeArithmeticResult(packageName + "/" + folderName + "/" + fileName)
    val expectedResult: String = if (parsingResult.isLeft) parsingResult.left.get.toString else parsingResult.right.get
    val actualResult: String = FileUtils.readFileToString(new File(packageName + "/" + folderName + "_out/" + fileName + ".out"), "utf-8").trim
    val result: Boolean = expectedResult == actualResult
    if (!result) {
      val logger = Logger(LoggerFactory.getLogger("name"))
      logger.info("\n\nFor " + fileName + "\nEXPECTED RESULT : " + expectedResult + "\n\n\tis not equal to\n\n" + "ACTUAL RESULT : " + actualResult + "\n")
    }
    result
  }

  def testCustomVisitor(packageName: String, folderName: String, fileName: String): Int = {

    val context = getContext(packageName + "/" + folderName + "/" + fileName)
    val customVisitor = new CustomVisitor
    customVisitor.visitStartRule(context)
  }
}
