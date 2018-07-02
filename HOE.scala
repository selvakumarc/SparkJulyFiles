package com.selva.example

object HOE {

  def main(args: Array[String]) = {
    val result = functionExample(60, multiplyBy2) // Passing a function as parameter
    println(result)

    val domainName = "www.example.com"
    def getURL :(String, String) => String  = urlBuilder(true, domainName)
    val endpoint = "users"
    val query = "id=1"
    val url = getURL(endpoint, query)
    println(url)
  }
  def functionExample(a: Int, f: Int => AnyVal): AnyVal = {
    (f(a)) // multiplyBy2(25)                                // Calling that function
  }
  def multiplyBy2(a: Int): Int = {
    a * 2
  }
  def urlBuilder(ssl: Boolean, domainName: String): 
  (String, String) => String = {
    val schema = if (ssl) "https://" else "http://"
    (endpoint: String, query: String) => 
      s"$schema$domainName/$endpoint?$query"
  }
  
  //(endpoint: String, query: String) => s"https://www.example.com/$endpoint?$query"
  //getURL("users", "1")
/* def getURL(endpoint: String, query: String)=
  {
    s"https://www.example.com/$endpoint?$query"
  }
*/
}
