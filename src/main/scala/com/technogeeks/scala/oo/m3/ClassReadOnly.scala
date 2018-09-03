package com.technogeeks.scala.oo.m3

class ReadOnlyCounter
{
private var value = 0
val myPiValue = 3.14
def incr() { value +=1 }
def current= value

}


object ReadOnlyCtr extends App {
  var f = new ReadOnlyCounter
    var f1 = new ReadOnlyCounter

  f.incr
println(f.current)
  println("----------")
  println(f.incr)
  println(f.current)

  println(f.myPiValue)
  
  var mytest = f.myPiValue
  println(mytest)

 
 //f.myPiValue_=4.4 //This is not possible
 // f.myPiValue =4.4 //This is also not possible
  
  
  
}