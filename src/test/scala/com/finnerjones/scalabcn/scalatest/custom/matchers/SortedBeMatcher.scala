package com.finnerjones.scalabcn.scalatest.custom.matchers

import org.scalatest.matchers.BeMatcher
import org.scalatest.matchers.MatchResult

trait SortedBeMatcher {
	class ScalaBcnSortedBeMatcher extends BeMatcher[List[Int]] {
	  
	  def apply(left:List[Int]):MatchResult = {
	    MatchResult(
	      left == left.sorted,
	      left.toString + "was not sorted",
	      left.toString + "was sorted"
	    )
	  }
	}
	
	def scalaBcnSorted = new ScalaBcnSortedBeMatcher
}


object ScalaBcnSortedBeMatcher extends SortedBeMatcher
