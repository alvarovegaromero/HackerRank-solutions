/*Link: https://www.hackerrank.com/challenges/weather-observation-station-5/problem */

/*
    Enter your query here and follow these instructions:
    1. Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
    2. The AS keyword causes errors, so follow this convention: "Select t.Field From table1 t" instead of "select t.Field From table1 AS t"
    3. Type your code immediately after comment. Don't leave any blank line.
*/
select CITY, length(CITY) from STATION order by length(CITY), CITY ASC LIMIT 1;
select CITY, length(CITY) from STATION order by length(CITY) DESC, CITY ASC LIMIT 1;

/*LIMIT 1 -> 1st result*/
/* ORDER BY length(CITY), CITY -> ordering with lengths, in case of a draw, we consider the field "CITY"*/
/* ASC -> from the lowest length to the biggest - DESC -> reverse */