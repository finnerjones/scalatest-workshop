package com.finnerjones.scalabcn.scalatest.flatspec

import org.scalatest.Matchers
import org.scalatest.FlatSpec
import com.finnerjones.scalabcn.scalatest.custom.matchers.SortedBeMatcher

/**
 * http://www.scalatest.org/quick_start
 * 
 * create a base class and use it to write your tests
 * 
 */
abstract class FlatSpecBase extends FlatSpec with Matchers with SortedBeMatcher {

}