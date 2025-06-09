//https://www.hackerrank.com/challenges/library-fine/problem

private static final int FINE_PER_DAY_SAME_MONTH = 15;
private static final int FINE_PER_MONTH_SAME_YEAR = 500;
private static final int FINE_DIFFERENT_YEAR = 10000;

public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    if (y1 > y2) {
        // Returned in a later year
        return FINE_DIFFERENT_YEAR;
    } else if (y1 == y2) {
        if (m1 > m2) {
            // Returned in a later month but same year
            return FINE_PER_MONTH_SAME_YEAR * (m1 - m2);
        } else if (m1 == m2 && d1 > d2) {
            // Returned in a later day but same month and year
            return FINE_PER_DAY_SAME_MONTH * (d1 - d2);
        }
    }
    
    return 0; // Returned on time 
}