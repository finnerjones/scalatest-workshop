package com.finnerjones.scalabcn.scalatest.funspec

import org.scalatest.FunSpec

import com.finnerjones.scalabcn.scalatest.s99.S99JavaSolutions
import scala.collection.JavaConversions._
import scala.collection.mutable.ListBuffer

/**
 * 
 * http://www.scalatest.org/getting_started_with_fun_spec
 * 
 * In a FunSpec, you combine tests with text that specifies 
 * the behavior being tested. 
 * You can describe the subject being specified and tested 
 * with describe clauses and place text that describes the 
 * behavior expected of the subject in it clauses. 
 * The code of the test appears in curly braces after 
 * the it and its text. 
 * 
 * 
 */


class FunSpecTests extends FunSpec {

  /*
   * A good first step for teams 
   * wishing to move from xUnit to BDD
   * 
   */
  /*
   * Example 1
   * 
   * Integrating wit Java
   */
  describe("the nth java method") {
    
    it("should be able to make coffee") (pending)	// <- new word
    
    it("is green") (pending)
    
    it ("returns the nth indexed element of a list of Integers") {
      val l: java.util.List[Integer] = ListBuffer(List(new java.lang.Integer(1),new java.lang.Integer(3),new java.lang.Integer(7)): _*)
      val jSolutions = new S99JavaSolutions();
      val result = jSolutions.nth(2, l)
      assert(result == 7)
    }
  }
  
  
  
}