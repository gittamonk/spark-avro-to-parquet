package com.technogeeks.scala.oo.m3


  class Bank{    
        def getRateOfInterest()={  
            0  
        }    
    }    
        
    class SBI extends Bank{    
        override def getRateOfInterest()={  
         8  
        }    
    }    
        
    class ICICI extends Bank{    
        override def getRateOfInterest()={  
            7  
        }    
    }    
      
    class AXIS extends Bank{    
        override def getRateOfInterest()={  
            9  
        }    
    } 
    
    class SUPERINVOKE extends Bank{    
        override def getRateOfInterest()={  
            super.getRateOfInterest() + 5
        }    
    }    
        
    object MethodOverridingWithInheritence {     
        def main(args:Array[String]){    
            var s=new SBI();    
            var i=new ICICI();    
            var a=new AXIS();
            var si=new SUPERINVOKE();
            println("SBI Rate of Interest: "+s.getRateOfInterest());    //8
            println("ICICI Rate of Interest: "+i.getRateOfInterest());    //7
            println("AXIS Rate of Interest: "+a.getRateOfInterest());    //9
            println("SUPER INVOKE Rate of Interest: "+si.getRateOfInterest());//5    

        }    
    }    
