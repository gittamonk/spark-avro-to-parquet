package com.technogeeks.scala.oo.m3

object CaseClassCompanion2 extends App{
  
  case class Rectangle(length: Int = 0, width: Int = 0)
 
object Rectangle {
  def square(rectangle: Rectangle) = rectangle.length * rectangle.width
}
 
val r1 = Rectangle(5, 4)
 
println(Rectangle.square(r1))

}

