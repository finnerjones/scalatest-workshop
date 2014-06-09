package com.finnerjones.scalabcn.scalatest.funspec

import org.scalatest.FunSpec
import com.finnerjones.scalabcn.scalatest.s99.S99JavaSolutions
import scala.collection.JavaConversions._
import scala.collection.mutable.ListBuffer
import org.scalatest.Matchers
import org.scalatest.MustMatchers
import org.scalatest.GivenWhenThen

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

// with Matchers
// with MustMatchers
// with GivenWhenThen
class FunSpecTests extends FunSpec with GivenWhenThen {

  /*
   * A good first step for teams 
   * wishing to move from xUnit to BDD
   * 
   */
  /*
   * Example 1
   * 
   * Integrating with Java
   */
  describe("the nth java method") {
    info("integrating with Java")  
    it("should be able to make coffee") (pending) 	// <- new word 
//    {
//      1 must be (1)
//    }
    
    it("is green")   (pending) 
//    {
//      val color:String = "Green"
//      color must equal ("Green")
//    }
 
    /*
     * run project -> clean if this does not pass
     */
    
    it ("returns the nth indexed element of a list of Integers") {
      val l: java.util.List[Integer] = ListBuffer(List(new java.lang.Integer(1),new java.lang.Integer(3),new java.lang.Integer(7)): _*)
      val jSolutions = new S99JavaSolutions();
      val result = jSolutions.nth(2, l)
      assert(result == 7)
    }
  }
  

  
  
  /*
   * Example 2
   * 
   * Given, When , Then
   */
  describe("""a function called makesCoffee 
      that checks a string is equal to \'coffee\'""") {
    info("going to make tea")  
    it("makesCoffee(\'tea\') returns false")  
    {
      Given ("a function to check a string for the word coffee")
      def makesCoffee(str:String):Boolean = str.equals("coffee")
      
      When ("the function is called with the string \'tea\'")
      val result = makesCoffee("tea")
      
      Then("the result should be false")
      assert(makesCoffee("tea") === false)
    }
    
  }
 
}