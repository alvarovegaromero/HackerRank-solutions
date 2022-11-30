/*Link: https://www.hackerrank.com/challenges/what-type-of-triangle/problem */

/*
    Enter your query here and follow these instructions:
    1. Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
    2. The AS keyword causes errors, so follow this convention: "Select t.Field From table1 t" instead of "select t.Field From table1 AS t"
    3. Type your code immediately after comment. Don't leave any blank line.
*/
select case
    when A = B AND B = C then 'Equilateral' /* 3 sides equal*/
    when (A + B) <= C OR (B + C) <= A OR (A + C) <= B then 'Not A Triangle' /*sum of two sides should be bigger than the other for being a triangle*/
    when (A = B OR B = C OR A = C) then 'Isosceles' /* ONLY 2 sides are equal */
    else 'Scalene' /*no equal sides*/
    end
from TRIANGLES;  