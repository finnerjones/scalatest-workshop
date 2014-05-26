package com.finnerjones.scalabcn.scalatest.flatspec

import org.scalatest.FlatSpec
import org.scalatest.Matchers

import com.finnerjones.scalabcn.scalatest.s99.S99Solutions.last

/**
 * FlatSpec
 * A good first step for teams wishing to move from xUnit to BDD, 
 * FlatSpec's structure is flat like xUnit, so simple and familiar, 
 * but the test names must be written in a specification style: 
 * "X should Y," "A must B," etc.
 */

class FlatSpecTests extends FlatSpec with Matchers {

  /*
   * See also Getting Started
   * 
   * http://www.scalatest.org/quick_start
   * 
   * "... we recommend starting with FlatSpec for unit testing. 
   * We think FlatSpec is a good default choice because 
   * it has a flat structure, 
   * similar to the XUnit-style tests familiar to most users, 
   * but encourages a BDD-style of using descriptive 
   * specifications of behavior for test names. "
   * 
   */
  
  /*
   *  introducing Matchers ...
   *  
   *  http://www.scalatest.org/user_guide/using_matchers
   *  
   */
  
  
  /*
   * Example 1
   * 
   * 
   */
  "The value 1" should "equal value 1" in {
    assert(1 == 2)		// compare == with ===
  }
  
  
  /*
   * Example 2
   * 
   * Taken from S99 Scala problems, but it doesn't compile...
   * The syntax should be comes form a Matcher
   * 
   * add with Matchers to class definition
   */

  "last(List(1,2,3,4,5,6,7,8))" should "result in 8" in {
    val l = List(1, 2, 3, 4, 5, 6, 7, 8)
    last(l) should be(8)		// equality Matcher
  }
  
  
  
  /*
   * Example 3
   * 
   * Let's have a look at Matchers
   * 
   * This example is loosely taken from the book "Testing in Scala"
   */
  	"All these string matchers" should
	"be valid syntax" in {
		val lyrics = """I fell into a burning ring of fire. 
		I went down, down, down and the flames went higher"""
		lyrics should startWith("I fell")
		lyrics should endWith("higher")
		lyrics should not endWith "My favorite friend, the end"  // parens?
		lyrics should include ("down, down, down")
		lyrics should not include ("Great balls of fire")
		// using regex 
		lyrics should startWith regex ("I.fel+")
		lyrics should endWith regex ("h.{4}r")
		lyrics should not endWith regex ("\\d{5}")
		lyrics should include regex ("flames?")
		lyrics should fullyMatch regex ("""I(.|\n|\S)*higher""")
		
		// Can I create a custom Matcher ?
		//lyrics should be from a Johnny Cash song
	}
}