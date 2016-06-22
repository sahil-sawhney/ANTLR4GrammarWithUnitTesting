package com.knoldus

import com.knoldus.util.TestHelper._
import org.scalatest.FunSuite

class ComputeArithmeticResultSpec extends FunSuite {

  test("Addition expression should parse correctly") {

    val res: Boolean = testCustomArithmetic("/home/sahil/blogs/blog 2/ANTLRBlog2/src/test/resources", "expression", "addition",164)
    assert(res === true)
  }

  test("Invalid expression 1 should not parse correctly") {

    val res: Boolean = testCustomArithmetic("/home/sahil/blogs/blog 2/ANTLRBlog2/src/test/resources", "expression", "invalid1",-1)
    assert(res === true)
  }

  test("Invalid expression 2 should not parse correctly") {

    val res: Boolean = testCustomArithmetic("/home/sahil/blogs/blog 2/ANTLRBlog2/src/test/resources", "expression", "invalid1",-1)
    assert(res === true)
  }

  test("Invalid expression 3 should not parse correctly") {

    val res: Boolean = testCustomArithmetic("/home/sahil/blogs/blog 2/ANTLRBlog2/src/test/resources", "expression", "invalid1",-1)
    assert(res === true)
  }

  test("Addition should give correct output") {

    val res: Int = testCustomVisitor("/home/sahil/blogs/blog 2/ANTLRBlog2/src/test/resources", "expression", "addition")
    assert(res === 164)
  }

  test("Subtraction should give correct output") {

    val res: Int = testCustomVisitor("/home/sahil/blogs/blog 2/ANTLRBlog2/src/test/resources", "expression", "subtraction")
    assert(res === 78)
  }

  test("Multiplication should give correct output") {

    val res: Int = testCustomVisitor("/home/sahil/blogs/blog 2/ANTLRBlog2/src/test/resources", "expression", "multiplication")
    assert(res === 5203)
  }

  test("Division should give correct output") {

    val res: Int = testCustomVisitor("/home/sahil/blogs/blog 2/ANTLRBlog2/src/test/resources", "expression", "division")
    assert(res === 2)
  }
}
