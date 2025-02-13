/* Link: https://www.hackerrank.com/challenges/weather-observation-station-7/problem */

select distinct(CITY) from STATION where (CITY LIKE '%A') OR (CITY LIKE '%E') OR (CITY LIKE '%I') OR (CITY LIKE '%O') OR (CITY LIKE '%U');