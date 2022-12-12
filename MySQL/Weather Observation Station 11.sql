/* Link: https://www.hackerrank.com/challenges/weather-observation-station-11/problem */

select distinct(CITY) from STATION where CITY not in(
    select distinct(CITY) from STATION where right(CITY, 1) in ('A','E','I','O','U') AND        
    left(CITY, 1) in ('A','E','I','O','U')
)