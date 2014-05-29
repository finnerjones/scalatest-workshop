package com.finnerjones.scalabcn.scalatest.featurespec

import org.scalatest.FeatureSpec
import org.scalatest.Matchers

import com.finnerjones.scalabcn.scalatest.s99.S99Solutions._

/**
 * http://www.scalatest.org/getting_started_with_feature_spec
 * 
 * In a FeatureSpec, you describe scenarios of features.
 * 
 */
class FeatureSpecTests extends FeatureSpec with Matchers {

  feature("a function which returns the length of a list") {
    
    info("As a programmer I need a way to find the length of a list")
    info("the function listLength(aList) will return the length of a list")
    
    scenario("passing a list with elements to listLength will return the length of the list") {
        val result = listLength(List(6,8,7,9)) 
        result should be (4)
    }
    
    scenario("passing an empty list to listLength will return 0") {
      val result = listLength(List())
      result should equal (0)
    }
    
  }
  
}