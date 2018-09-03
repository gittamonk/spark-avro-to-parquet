package com.technogeeks.scala.oo.m3

object FunctionVsNormalWithout extends App{
  def sumInts(a: Int, b: Int): Int =
			if(a > b) 0 else a + sumInts(a + 1, b)
			
	
			//-----------------------------------------

	def cube(x: Int): Int= x * x * x

	def sumCubes(a: Int, b: Int): Int=
		if (a > b) 0 else cube(a) + sumCubes(a + 1, b)
		
		//----------------------------------
		
	def square(x: Int): Int=x*x
	
	def sumSquares(a:Int,b:Int):Int = 
	  		if (a > b) 0 else square(a) + sumSquares(a + 1, b)

		
		
    println(sumInts(1,5))
    
    
}