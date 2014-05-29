package com.finnerjones.scalabcn.scalatest.s99;

import java.util.List;

public class S99JavaSolutions {

	/* P03 (*) Find the Kth element of a list.
     *         By convention, the first element in the list 
     *         is element 0.
     *
     * Example:
     * 
     * scala> nth(2, List(1, 1, 2, 3, 5, 8))
     * res0: Int = 2
     * 
     * It looks so ugly in Java compared to Scala  !!!! :(
    */
	public Integer nth(Integer n,List<Integer> l) {
		return l.get(n.intValue());
	}
}
