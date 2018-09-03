package com.technogeeks.scala.oo.m3

object Closure2 {
  def isInRange(left: Int, n: Int, right: Int): Boolean = {
    if (left < n && n < right) true else false
  }

  def is5InRange = isInRange(_: Int, 5, _: Int)
  println(is5InRange(0, 8))

  def between0and10 = isInRange(0, _: Int, 10)
  println(between0and10(5))
  println(between0and10(100))

}