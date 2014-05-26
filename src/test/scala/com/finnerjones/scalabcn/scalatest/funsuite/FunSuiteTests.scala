package com.finnerjones.scalabcn.scalatest.funsuite

import org.scalatest.FunSuite
import com.finnerjones.scalabcn.scalatest.s99.S99Solutions._
import org.scalatest.Matchers
import org.scalatest.BeforeAndAfter

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
// BeforeAndAfter is a trait 
//
// with BeforeAndAfter
//  var x:Int = _
//  
//  before {
//    x = 1
//  }
//  after {
//    println("something happened after")
//  }

class FunSuiteTests extends FunSuite {

  /*
   *  Coursera like tests 
   *  
   *  FunSuite =>  Function Suite
   *  
   *  http://www.scalatest.org/getting_started_with_fun_suite
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
  test("Scala BCN és la millor!!!  --  Rule#1 & Rule#2  :)") {
    assert(last(List(1, 1, 2, 3, 5, 8)) === 8) // what when not 8?
  }

  /* 
   * Example 4
   * 
   * Dealing with Exceptions
   */
  test("I am expecting an IllegalArgumentException here") {
    intercept[IllegalArgumentException] {
      throw new Exception // have a look at failed test output
    }
  }

  /*
   * Example 5
   * 
   * multiple lines of code with a function and an assert
   */
  test("someFunction returns a list containing \'a\' ") {
    val a: Char = 'a'
    val l: List[Char] = List(a)
    def someFunction: List[Char] = l
    assert(l === someFunction)
  }

  /*
   * with BeforeAndAfter examples
   */

  // Example 5
  test("""randomSelect(1, List('a', 'b', 'c', 'd')) 
      returns 1 randomly selected element from 
      List('a', 'b', 'c', 'd')""") {
      val l = List('a', 'b', 'c', 'd')
      // what do we test here ?
      assert(randomSelect(3, l) === ???)
  }

  // we need something more.. let's have a look at FlatSpecs
}