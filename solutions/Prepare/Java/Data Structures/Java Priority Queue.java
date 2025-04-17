//https://www.hackerrank.com/challenges/java-priority-queue

import java.util.*;

class Priorities{ 
    private PriorityQueue<Student> queue = new PriorityQueue<>();
    
    public List<Student> getStudents(List<String> events) {
        for(String event: events) {
            String[] s = event.split(" ");
            if(s[0].equals("ENTER")) {
                String name = s[1];
                double cgpa = Double.parseDouble(s[2]);
                int id = Integer.parseInt(s[3]);
                Student newStudent = new Student(id, name, cgpa);
                queue.add(newStudent);
            } else if(s[0].equals("SERVED")) {
                queue.poll();
            } 
        }
        
        List<Student> remainingStudents = new ArrayList<>();
        while(!queue.isEmpty())
            remainingStudents.add(queue.poll());
        
        return remainingStudents;
    }
}

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double cgpa;
    
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    public int getID() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getCGPA() {
        return this.cgpa;
    }

    @Override
    public int compareTo(Student student) {
        if(this.cgpa != student.cgpa)
            return Double.compare(student.cgpa, this.cgpa);   
        else if(!this.name.equals(student.name))
            return this.name.compareTo(student.name);
        else
            return Integer.compare(this.id, student.id);
    }
}