//Link: https://www.hackerrank.com/challenges/grading/problem

class Result {
    
    static final int min_rounding_grade = 38;
    
    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> final_grades = new ArrayList<Integer>();
        int current_mod;

        for(Integer i : grades){
            current_mod = i % 5;
            if(i >= min_rounding_grade && (current_mod >= 3))
                final_grades.add(i + (5 - current_mod));
            else
                final_grades.add(i);
        }

        return final_grades;
    }

}