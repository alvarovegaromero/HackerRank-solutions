/* Link: https://www.hackerrank.com/challenges/weather-observation-station-15/problem */

select round(LONG_W, 4) from STATION where LAT_N<137.2345 order by LAT_N desc limit 1;