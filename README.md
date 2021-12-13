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


![alt text](https://github.com/luisdlo/SimpleInterestMS/blob/main/images/swagger.PNG?raw=true)
