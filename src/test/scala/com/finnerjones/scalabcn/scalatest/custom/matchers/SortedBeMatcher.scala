package com.finnerjones.scalabcn.scalatest.custom.matchers

import org.scalatest.matchers.BeMatcher
import org.scalatest.matchers.MatchResult

trait SortedBeMatcher {
	class SortedBeMatcher extends BeMatcher[List[Int]] {
	  
	  def apply(left:List[Int]):MatchResult = {
	    MatchResult(
	      left == left.sorted,
	      left.toString + "was sorted",
	      left.toString + "was not sorted"
	    )
	  }
	  
	  val sorted = new SortedBeMatcher

	}
}

object SortedBeMatcher extends SortedBeMatcher
