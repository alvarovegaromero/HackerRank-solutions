/* Link: https://www.hackerrank.com/challenges/weather-observation-station-17/problem */

select round(LONG_W, 4) from STATION where LAT_N > 38.778 order by LAT_N limit 1;