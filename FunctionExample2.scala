package com.scala.teach

object FunctionExample2 {
  
   def main(args: Array[String]) = {  
        var result1 = functionExample(15,2)     // Calling with two values  
        var result2 = functionExample(15)   // Calling with one value  
        var result3 = functionExample()     // Calling without any value  
        println(result1+"\n"+result2+"\n"+result3)  
    }  
    def functionExample(a:Int =0 , b:Int =0 ):Int = {   // Parameters with default values as 0  
        val c = a+b 
        c
    }
    
  
    
}