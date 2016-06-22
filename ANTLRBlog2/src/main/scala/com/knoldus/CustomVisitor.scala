package com.knoldus

import scala.collection.JavaConversions._

/**
  * Created by sahil on 5/29/16.
  */

class CustomVisitor extends ArithmaticGrammarBaseVisitor[Int] {

  private def notEqualsNull(ref: AnyRef): Boolean = Option(ref).isDefined

  override def visitStartRule(ctx: ArithmaticGrammarParser.StartRuleContext): Int = {

    val result: Int = if (notEqualsNull(ctx.operation.add)) {
      val operand1: Int = ctx.operand(0).DIGIT.toList.mkString.toInt
      val operand2: Int = ctx.operand(1).DIGIT.toList.mkString.toInt
      operand1 + operand2
    }
    else if (notEqualsNull(ctx.operation.sub)) {
      val operand1: Int = ctx.operand(0).DIGIT.toList.mkString.toInt
      val operand2: Int = ctx.operand(1).DIGIT.toList.mkString.toInt
      operand1 - operand2
    }
    else if (notEqualsNull(ctx.operation.mul)) {
      val operand1: Int = ctx.operand(0).DIGIT.toList.mkString.toInt
      val operand2: Int = ctx.operand(1).DIGIT.toList.mkString.toInt
      operand1 * operand2
    }
    else {
      val operand1: Int = ctx.operand(0).DIGIT.toList.mkString.toInt
      val operand2: Int = ctx.operand(1).DIGIT.toList.mkString.toInt
      operand1 / operand2
    }
    result
  }
}
