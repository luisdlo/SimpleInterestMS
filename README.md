# Getting Started

### Exercise

Simple Interest microservice:
Create a microservice with spring-boot that calculate and generates the list of payments of the simple interest of a credit that must be paid in n terms and in weekly form:
Input:  {
"amount": Double,
"terms":Integer,
"rate":Double
}
Output: {
[
{
"payment_number":Integer,
"amount": Double,
"payment_date":Date
}
…
]
}

Must Be:
- Containerized with docker.
- storing the data [request and response] in a h2 database.
  It's a Plus:
- having /health endpoint.
- at least 50% coverage
  To complete the exam you must send a GitHub repository link with the code



### Swagger Documentation
This image shows the endpoints that can be used in this exercise, documented in a swagger.
![alt text](https://github.com/luisdlo/SimpleInterestMS/blob/main/images/swagger.PNG?raw=false)


### Simple interest exercise
This image shows an exercise with the required requirements. **It does not contain any validation on any field.**
![alt text](https://github.com/luisdlo/SimpleInterestMS/blob/main/images/interest.png?raw=false)


### Storing Data
Exercises were done to show how the data is being stored in H2 in memory.
![alt text](https://github.com/luisdlo/SimpleInterestMS/blob/main/images/db1.png?raw=false)
![alt text](https://github.com/luisdlo/SimpleInterestMS/blob/main/images/db2.png?raw=false)


### Code Coverage
A 94% coverage with JUnit and Mockito was done with the help of Jacoco.
![alt text](https://github.com/luisdlo/SimpleInterestMS/blob/main/images/jacoco.png?raw=false)


### Docker
A docker file was created to dockerize the application.
https://github.com/luisdlo/SimpleInterestMS/blob/main/Dockerfile



