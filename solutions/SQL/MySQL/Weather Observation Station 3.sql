/* Link: https://www.hackerrank.com/challenges/weather-observation-station-3/problem */

select DISTINCT CITY from STATION where MOD(ID, 2) = 0;

/* Same as DB2 */