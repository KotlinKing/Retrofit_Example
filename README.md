# Retrofit_Example
Retrofit is the most seamless android library which handles all the network requests.
Retrofit is a great choice to connect your application to the remote world.

There are other alternatives to handle network requests which are as follows: 

1. OkHttps 
2. HttpURLConnection 
3. Retrofit 
4. Volley

Why not HttpURLConnection? 

* Poor Readability and less Expressive
* Lots of BoilerPlate code 
* No build-in support for parsing JSOn response
* Manage background thread manually

Retrofit vs Volley 

Advantages of volley

* Active Community 
* Expressive code and more abstraction
* Manage resources efficiently 
  * Background threads 
  * Async calls and queues 
  * Automatic JSON parsing using GSON library 
  * Automatic error handling callbacks
  * Build-in User authentication support

Disadvantages of Volley

* Limited REST specific features 
* Poor authentication layer 
* small community 
* Meagre documentation 

#HTTP Fundamentals 

* HTTP Request
* HTTP Response
* Status Code 
* How communication between client and server takes place 

What is HTTP? 

Hyper Text Transfer Protocol.

Protocol = Set of Rules.
Transfer = Transfer something over the network.
Hyper Text - Reference to some text.

HTTP Request Structure 
* Request Line : Method, URL, HTTP version 
  * Method
  * Url: to whom we want to connect which is usually the location of
    the web server 
  * HTTP version

* Request Header : Meta Data
  * Meta Data: Summary of your HTTP request 

* Request Body (Optional) : Send data to server 
 
  E.g Json Data for Student object 
    {
      "name" = "KotlinKing"
      "age" = 17
    }

##Main HTTP Methods 
* GET - You send request to get some data from the web server 
* POST - add some data to the server 
* PUT - replace some object in the server
* PATCH - update parts of Resource 
* DELETE - remove the resource.

Status Code Range - Meaning 

100's   -   Informational (Sending some informational data)
200's   -   Success
300's   -   Redirects
400's   -   Client Error (Client made some mistake e.g. Bad Formatting)
500's   -   Server Error 

##Web Service

Web service is just a program which runs on the web server 
Task is the read the request, process it, send back the response. 

What is RESTful Web Services? 
* Stateless Client-Server Relationship
  * Unaware about other HTTP requests on to the network.
* Utilize HTTP Methods (GET, PATCH, PUT, POST, DELETE)
  * Structured and Consistent URLs
      we can have the same URL but with different operations 

    HTTP Method - Consistent URL - Web Service Operation
      
    * GET - example.com/user - Fetch User 
    * POST - example.com/user - Add User
    * PUT - example.com/user - Update User
    * DELETE - example.com/user - Delete User
 
* Consistent Data Type Transfer
  * JSON Data