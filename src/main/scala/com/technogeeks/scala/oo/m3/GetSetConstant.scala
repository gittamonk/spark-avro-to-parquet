package com.technogeeks.scala.oo.m3



class ReadOnlyCounter1
{
private var value = 0
val myPiValue = 3.14
def incr() { value +=1 }
def current= value

}


object GetSetConstant extends App {
  var f = new ReadOnlyCounter1
  f.incr
println(f.current)
  
  println(f.incr)
  println(f.current)

  println(f.myPiValue)
  
  var mytest = f.myPiValue
  println(mytest)
  
  
  
}