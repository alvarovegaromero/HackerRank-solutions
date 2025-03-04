//https://www.hackerrank.com/challenges/java-singleton/problem

class Singleton{
    private static Singleton instance = new Singleton();
    public String str;

    private Singleton() {}
    
    public static Singleton getSingleInstance() {
        return instance;
    }
}