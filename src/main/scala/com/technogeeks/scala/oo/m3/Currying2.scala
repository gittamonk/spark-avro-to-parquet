package com.technogeeks.scala.oo.m3

object Currying2 extends App{
  def isInRange(left: Int, n: Int, right: Int): Boolean = {
    if (left < n && n < right) true else false
}
val a = (isInRange _).curried
println(a(-10)(3)(10)) //
val b = a(10)
println(b(5)(15))

 println(a(3)) //
println(a(5))
println(a(0))
}