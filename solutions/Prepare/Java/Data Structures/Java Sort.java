//https://www.hackerrank.com/challenges/java-sort

import java.util.*;

class Student implements Comparable<Student> {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}

	@Override
	public int compareTo(Student b) {
		if (this.cgpa < b.cgpa)
			return 1;
		else if (this.cgpa > b.cgpa)
			return -1;
		else {
			int nameCompare = this.fname.compareTo(b.fname);
			if (nameCompare != 0)
				return nameCompare;
			else //in case of draw
				return this.id - b.id;
		}
	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		Collections.sort(studentList);

		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}
}
