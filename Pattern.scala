package com.selva.example

object Pattern {
  def main(String: Array[String])
  {
    /* var a = 1  
        a match{  
            case 1 => println("One")  
            case 2 => println("Two")  
            case _ => println("No")  
        }*/  
     
     
      var result = search (1) 

     
  }
  
  def search (a:Any):Any = a match{  
        case 1  => println("1")  
        case "Two" => println("Two")  
        case "Hello" => println("Hello")  
        case _ => println("No")  
              
        } 
}