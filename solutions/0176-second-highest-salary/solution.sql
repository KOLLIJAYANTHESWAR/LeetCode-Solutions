# Write your MySQL query statement below
select(
select DISTINCT salary
from Employee 
order by salary DESC
Limit 1 OFFSET 1
)as SecondHighestSalary;
