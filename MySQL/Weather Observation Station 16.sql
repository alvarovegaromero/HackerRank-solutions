/* Link: https://www.hackerrank.com/challenges/weather-observation-station-16/problem */

select round(min(LAT_N), 4) from STATION where LAT_N > 38.7780;
/*also work -> order by LAT_N limit 1; */