/* Link: https://www.hackerrank.com/challenges/weather-observation-station-5/problem */

select CITY, length(CITY) from STATION order by length(CITY), CITY ASC LIMIT 1;
select CITY, length(CITY) from STATION order by length(CITY) DESC, CITY ASC LIMIT 1;

/* Same solution as DB2 */