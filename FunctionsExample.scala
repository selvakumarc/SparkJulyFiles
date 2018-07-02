package com.scala.teach

object FunctionsExample {

  // Function Exmaple

  def main(args: Array[String]) {
    functionExample() // Calling function

    val result = functionExample(10, 20)
    println("result : " + result)
    val result1 = functionExample1(10, 20)
    println("result1 without = : " + result1)
    val result2 = functionExample2(10, 20)
    println("result2 with return type = : " + result2)
    var sum = add(1);
    println("The Sum is "+sum);

  }
  
  def add(a:Int,b:Int)={
    println("calling this method")
    a+b
  }

  // Defining a function
  def functionExample() {
    println("This is a simple function")
  }
  
   

  // Function with Parameters

  def functionExample(a: Int, b: Int) = {
    var c = a + b
    c
  }
  
   
  // without =
  def functionExample1(a: Int, b: Int) {
    var c = a + b
    c
  }
  // with return type
  def functionExample2(a: Int, b: Int): Integer = {
    var c = a + b
     c
  }

 // Function with variable length param
  def add(args: Int *)  = {
    var sum  = 0;
    for (a <- args) sum += a 
    sum
  }
}