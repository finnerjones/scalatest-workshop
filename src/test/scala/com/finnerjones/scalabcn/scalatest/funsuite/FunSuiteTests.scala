package com.finnerjones.scalabcn.scalatest.funsuite

import org.scalatest.FunSuite

import com.finnerjones.scalabcn.scalatest.s99.S99Solutions._

/**
 *      FunSuite
 *
 * For teams coming from xUnit,
 * FunSuite feels comfortable and familiar while still giving some of the benefits of BDD:
 * FunSuite makes it easy to write descriptive test names,
 * natural to write focused tests,
 * and generates specification-like output that can facilitate communication among stakeholders.
 * http://www.scalatest.org/user_guide/selecting_a_style
 */
class FunSuiteTests extends FunSuite {

  /*
   *  Coursera like tests 
   * 
   */

  /*
   * Example 1 
   * '==' gives some info, but not useful
   */
  test("1 == 1") {
    assert(1 == 2)
  }

  /*
   * Example 2
   * '===' gives more info
   * 1 did not equal 2
   */
  test("1 === 1") {
    assert(1 === 2)
  }

  /* Example 3
   * 
   * Let's try this from S99
   * 
   * P01 (*) Find the last element of a list.
   *
   *    scala> last(List(1, 1, 2, 3, 5, 8))
   *    res0: Int = 8
   *    
   * The test is for information   
   */
  test("Scala BCN is the puta madre!!!  --  Rule#1 & Rule#2  :)") {
    assert(last(List(1, 1, 2, 3, 5, 8)) === 8)	// what when not 8?
  }

}