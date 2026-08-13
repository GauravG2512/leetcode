# Write your MySQL query statement below
Select class from Courses
GROUP by class having COUNT(student)>4