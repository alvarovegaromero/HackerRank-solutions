//https://www.hackerrank.com/challenges/java-abstract-class/problem

import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}

class MyBook extends Book {
    void setTitle(String title){
        this.title = title;
    }
}

