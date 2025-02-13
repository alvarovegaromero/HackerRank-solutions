/* Link: https://www.hackerrank.com/challenges/weather-observation-station-9/problem */

select distinct(CITY) from STATION where CITY not in(
    select distinct(CITY) from STATION where left(CITY, 1) in ('A','E','I','O','U')
)