/* Link: https://www.hackerrank.com/challenges/weather-observation-station-20/problem */

select round(S.LAT_N, 4) from STATION S where 
    (select round(count(S.ID)/2)-1 from STATION) 
    = 
    (select count(S1.ID) from STATION S1 where S1.LAT_N > S.LAT_N);

/* Explanation:
    - Subquery to count (using the ids bc are unique) lower half of the entries. 
    - Subquery to count the upper half of the entries. 
        As we have the size of each half, we can "discard" the half with the largest elements and         the next one, would be the median. We use S1 for discarding
    - The entry that have the same amount of queries under and above it, is the median
*/
