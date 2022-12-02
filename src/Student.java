public class Student {
    int age;
    int grade;
    String name;
    boolean isBorder;
    String sport;

    public void print()
    {
        System.out.println("the student " + name+" is " + age + " years old");
        System.out.println("They are in " + grade +" grade");
        System.out.println("it is " +isBorder +" that they are a border");

    }
}
