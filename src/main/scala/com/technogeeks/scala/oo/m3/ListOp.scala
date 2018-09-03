package com.technogeeks.scala.oo.m3

object ListOp {
  val nums: List[Int] = List(1, 2, 3, 4)
  val emptyList = Nil

  println("Head of nums : " + nums.head)
  println("Tail of nums : " + nums.tail)

  println("Is nums empty : " + nums.isEmpty)
  println("Is emptyLust empty : " + emptyList.isEmpty)

  println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
  println("List Concatenation")
  println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
  println(List(5, 6) :: nums)

  println(nums :: List(5, 6))

  println(nums ::: List(5, 6))

  val mynewList = nums :: List(5, 6)

  println("Size of mynewList" + mynewList.size)

  println("Sum of the list : " + sum3(nums))

  val nums1: List[Int] = List(1, 2, 3, 4)

  def sum3(myli: List[Int]): Int = {
    if (myli == Nil)
      0
    else myli.head + sum3(myli.tail)
  }


  println("The sum of " + sum3(nums1))

  // sum([1,2,3,4]) = 1 + sum([2,3,4])
  //                      2 + sum([3,4])
  //                          3 + sum([4]) 
  //                              4
}