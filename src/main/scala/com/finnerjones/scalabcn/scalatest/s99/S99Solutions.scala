package com.finnerjones.scalabcn.scalatest.s99

object S99Solutions {

  type ??? = Nothing
  
  /*
	 * Example 1
	 * 
	 *  P01 (*) Find the last element of a list.
     *
     *    scala> last(List(1, 1, 2, 3, 5, 8))
     *    res0: Int = 8
	 */
  def last(l: List[Int]): Int =
    8
  // Hey!, I hope you were not expecting to see the solutions here !!!

  /*
   *  
   *  Example 2
   *  
   *  P23 (**) Extract a given number of randomly selected elements �
   *           from a list.
   *
   *    scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
   *    res0: List[Symbol] = List('e, 'd, 'a)
   */
  def randomSelect(n:Int, l:List[Char]):List[Char] =
    List('a')	// <-  this obviously should be random :o)
    
    
  /*
   * Example 3
   * 
   * P04 (*) Find the number of elements of a list.
   *
   *    scala> length(List(1, 1, 2, 3, 5, 8))
   *    res0: Int = 6
   */
  def listLength(l:List[Int]):Int = l.length  
}