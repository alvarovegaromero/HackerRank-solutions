/* Link: https://www.hackerrank.com/challenges/earnings-of-employees/problem */

select (SALARY*MONTHS) as EARNINGS, count(*) from EMPLOYEE 
group by EARNINGS order by EARNINGS desc limit 1;
/* 
LIMIT -> used to specify the number of records to return.
GROUP BY -> groups rows that have the same values into summary rows
*/