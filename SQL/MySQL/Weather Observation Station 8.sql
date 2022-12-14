/* Link: https://www.hackerrank.com/challenges/weather-observation-station-8/problem */

select distinct(CITY) from STATION where right(CITY, 1) IN ('A','E','I','O','U') AND left(CITY, 1) IN ('A','E','I','O','U');

/* 3 WAYS: 
    - Using "LIKE" -> Problem: query too long
    - Using REGEX 
    - Using functions like left and right, checking the firsts and lasts elements
    */