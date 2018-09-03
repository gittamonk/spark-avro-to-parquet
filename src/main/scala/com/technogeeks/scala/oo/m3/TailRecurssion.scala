package com.technogeeks.scala.oo.m3

object TailRecurssion extends App{

  def fact(n:Int):Int = {
    if (n == 0)
      1
    else {
      n*fact(n-1)
    }
  }

  def factCase(n:Int):Int = n match {
    case 0 => 1
    case m => m*fact(m-1)
  }
/*
If  a function recursion calls itself at its last action,the function stack frame
can be reused

 */
  def factTailRecur(n:Int,acc:Int):Int = n match {
    case 0 => acc
    case m => factTailRecur(m-1,m*acc)
  }

  def factNested(m:Int):Int = {
     def factTailRecur(n:Int, acc:Int):Int = n match {
      case 0 => acc
      case m => factTailRecur(m-1,m*acc)
    }
    factTailRecur(m,1)
  }

  def revprint(low: Int, high: Int): Unit = {
    if (low <= high) {
      revprint(low+1, high)
      print(low)
    }
  }


   def revprint_tco(low: Int, high: Int): Unit = {
    if (high >= low) {
      print(high)
      revprint_tco(low, high-1)
    }
  }

  println(fact(5))
  println(factCase(3))
  println(factTailRecur(5,1))
  println(factNested(5))
  println("===========")
  revprint(1,1000)
  println()
  revprint_tco(1,10)

}
