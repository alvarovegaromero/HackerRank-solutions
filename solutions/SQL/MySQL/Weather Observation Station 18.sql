/* Link: https://www.hackerrank.com/challenges/weather-observation-station-18/problem */

select round((abs(min(LAT_N) - max(LAT_N)) + abs(min(LONG_W) - max(LONG_W))), 4) from STATION;
