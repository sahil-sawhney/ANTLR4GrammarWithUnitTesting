package com.knoldus

import java.io.{BufferedReader, StringReader, PrintStream, ByteArrayOutputStream}
import com.knoldus.ArithmaticGrammarParser.StartRuleContext
import org.antlr.v4.runtime.{CommonTokenStream, ANTLRFileStream}

/**
  * Created by sahil on 5/29/16.
  */
class CustomArithmetic extends App {


  def computeArithmeticResult(filePath: String): Either[Int, String] = {

    //setting the output stream to read the error message on the console
    val out: ByteArrayOutputStream = new ByteArrayOutputStream
    out.reset()
    System.setErr(new PrintStream(out))

    // Create an input character stream from standard in
    val input: ANTLRFileStream = new ANTLRFileStream(filePath)
    // Create an ExprLexer that feeds from that stream
    val lexer: ArithmaticGrammarLexer = new ArithmaticGrammarLexer(input)
    // Create a stream of tokens fed by the lexer
    val tokens: CommonTokenStream = new CommonTokenStream(lexer)
    // Create a parser that feeds off the token stream
    val parser: ArithmaticGrammarParser = new ArithmaticGrammarParser(tokens)
    // Begin parsing at rule startRule
    val ctx: StartRuleContext = parser.startRule

    val parsingOutput: String = getTestOutput(out.toString.trim.stripLineEnd).trim.stripLineEnd
    System.setOut(null)
    if (parsingOutput == "") {
      //the grammar is correct
      val result: Int = (new CustomVisitor).visitStartRule(ctx)
      Left(result)
    }
    else {
      //the grammar is incorrect
      Right(parsingOutput)
    }
  }

  private def getTestOutput(s: String): String = {
    val sb: StringBuilder = new StringBuilder
    val reader: BufferedReader = new BufferedReader(new StringReader(s))
    var line: String = ""
    while ( {
      line = reader.readLine
      line
    } != null) {
      sb.append(line)
      sb.append("\n")
    }
    sb.toString
  }

}
