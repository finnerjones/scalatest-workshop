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
//  
//  before {
//    println("something happened before")
//  }
//  after {
//    println("something happened after")
//  }

class FunSuiteTests extends FunSuite with BeforeAndAfter {

  /*
   *  Coursera like tests 
   *  
   *  FunSuite =>  Function Suite
   *  
   *  http://www.scalatest.org/getting_started_with_fun_suite
   *  
   */
  before {
    println("something happened before")
  }

  after {
    println("something happened after")
  }
  
  
  /*
   * Example 1 
   * '==' gives some info, but not useful
   */
  this.test("1 == 1") {
    assert(1 == 1)
  }

  /*
   * Example 2
   * '===' gives more info
   * 1 did not equal 2
   */
  test("1 === 1") {
    assert(1 === 1)
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
   *  - show import S99Solutions
   *  - open S99Solutions
   */
  test("Scala BCN es la millor!!!  --  Rule#1 & Rule#2  :)") {
    assert(last(List(1, 1, 2, 3, 5, 8)) === 8) // what when not 8?
  }

  /* 
   * Example 4
   * 
   * Dealing with Exceptions
   */
  test("I am expecting an IllegalArgumentException here") {
    val e = intercept[Exception] {
     throw new IllegalArgumentException // have a look at failed test output
    
    } 
    e match {
    case _:IllegalArgumentException => println("IllegalArgException")
      case _:Exception => println("Exception")
    }
  }

  /*
   * Example 5
   * 
   * multiple lines of code with a function and an assert
   * 
   * I'm sooo brave! 
   * 
   * use of """ ... """
   */
  test("someFunction returns a list containing \'a\', but we are not testing any production code ") {
    val charA: Char = 'a'
    val l: List[Char] = List(charA)
    def someFunction: List[Char] = l
    assert(l === someFunction)
  }

  /*
   * with BeforeAndAfter examples
   */


  // Example 6
  ignore("""randomSelect(1, List('a', 'b', 'c', 'd')) 
        returns 1 randomly selected element from 
        List('a', 'b', 'c', 'd')""") {
    val l = List('a', 'b', 'c', 'd')
    // what do we test here ?
    assert(randomSelect(3, l) === ???)
  }

  // ignore
  // we need something more.. let's have a look at FlatSpecs
}