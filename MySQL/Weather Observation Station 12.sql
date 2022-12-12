/* Link: https://www.hackerrank.com/challenges/weather-observation-station-12/problem */

select distinct(CITY) from STATION where CITY not in(
    select distinct(CITY) from STATION where right(CITY, 1) in ('A','E','I','O','U') OR        
    left(CITY, 1) in ('A','E','I','O','U')
)