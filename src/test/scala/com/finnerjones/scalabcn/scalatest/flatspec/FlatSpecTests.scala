package com.finnerjones.scalabcn.scalatest.flatspec

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import com.finnerjones.scalabcn.scalatest.s99.S99Solutions.last
import org.scalatest.MustMatchers
import com.finnerjones.scalabcn.scalatest.custom.matchers.SortedBeMatcher
import com.finnerjones.scalabcn.scalatest.model.ScalaBcnMeetup

/**
 * FlatSpec
 * A good first step for teams wishing to move from xUnit to BDD,
 * FlatSpec's structure is flat like xUnit, so simple and familiar,
 * but the test names must be written in a specification style:
 * "X should Y," "A must B," etc.
 */

class FlatSpecTests extends FlatSpec with Matchers with SortedBeMatcher {

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
   *  Domain Specific Language (DSL) for expressing asserts
   *  using the word 'should'
   */

  /*
   * Example 1
   * 
   * 
   */
  "The value 1" should "equal value 1" in {
    assert(1 == 1) // compare == with ===
  }

  /*
   * Example 2
   * 
   * Taken from S99 Scala problems, 
   * 
   */

  "last(List(1,2,3,4,5,6,7,8))" should "result in 8" in {
    val l = List(1, 2, 3, 4, 5, 6, 7, 8)
    // notice that now we don't use the word 'assert'
    last(l) should be(8) // equality Matcher
  }

  /*
   * Example 3
   * 
   * Some more equality matchers 
   * 
   */
  "the Int 12" should "equal 12" in {
    val twelve = 12
    twelve should equal (12)		// need brackets
    twelve should === (12)
  }
  
  
  /*
   * Example 3(a)
   * 
   * using it and ignore 
   * 
   */
  it should "equal 12" in {
    val twelve = 12
    val another12 = 12
    twelve shouldEqual another12
    twelve shouldBe another12
  }

  /*
   * Example 4
   * 
   * Some more Matchers
   * 
   * This example is loosely taken from the book "Testing in Scala"
   * 
   * and is slow !  :o(
   */
  "All these string matchers" should
    "be valid syntax" in {

      val lyrics = "I fell into a burning ring of fire"

      // checking strings
      lyrics should startWith("I fell")
      lyrics should endWith("fire")
      lyrics should not endWith "the end" 
      lyrics should include("ring")
      lyrics should not include ("Great balls of fire")

      // using regex 
      lyrics should startWith regex ("I.fel+")
      lyrics should endWith regex ("""f\w\we""")
      lyrics should not endWith regex("\\d{5}")
      lyrics should include regex ("burning?")
    }
  
  /*
   * Example 5
   * 
   * 
   */

  "<= => < >" should "result in 8" in {
    1 should be < 2
    2 should be > 1
    2 should be <= 2
    6 should be >= 5
  }
  
  /*
   * Example 6
   * 
   * Custom BeMatcher
   */
  "List(1,2,3,4,5)" should "be sorted" in {
    val l = List(1,2,3,4,5)
    l should be (sorted)
    l should have length(5)
    // show the multiple comparison version using and and braces
    // l should { be and have}
  }
  
  /*
   * Example 7
   * 
   * testing properties
   */
  
  "ScalaBcnMeetup" should "have location MOB, theme Scalatest and free beer" in {
    val meetUp = ScalaBcnMeetup("MOB","ScalaTest",true)
    meetUp should have (
      'location ("MOB"),
      'beer (true)
    )
    
  }
  
  
  // use base class
  
}