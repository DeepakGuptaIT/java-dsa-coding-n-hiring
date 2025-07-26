
## 1
A fruit has below properties:
1. Name
2. Color
3. Price

Create a collection and add below fruits to it.

Name color price
Apple Red 100
Banana Yellow 20
Strawberry Red 150
Guava Green 80
Papaya Yellow 40

1. Print names of all the red fruits
2. Sort fruits by ascending price.Then, print name and price of each fruit (such that cheapest fruit comes first)










Find most frequently occurring word(s) along with its frequency in given statement
•	Example input: "John is an employee of ABC company, JOHN is from India, JOHN! is good in java.“
•	Expected output: Words – John, is & frequency - 3


EmployeeInfo
id(PK) name dept
1 Sanjay HR
2 Ravi Admin
3 Kumar Finance
4 Neha HR
5 Sam Admin
6 Tom HR

EmployeePosition
id(FK) position salary

1 Manager 100,000
2 Executive 130,000
3 Lead 90,000
4 Member 60,000
5 Lead 100,000
6 Manager 100,000

Write a query to fetch names of all employees who have 'Manager' position .
SELECT ef
FROM EmployeeInfo ef LEFT JOIN EmployeePosition ep
ON ef.id= ep.id
WHERE ep.position = "Manager";


Write a query to get name of employee with highest salary from HR department
SELECT ef.name
FROM EmployeeInfo ef LEFT JOIN EmployeePosition ep
ON ef.id= ep.id
WHERE ep.salary = (SELECT MAX(SALARY) FROM ep);





























