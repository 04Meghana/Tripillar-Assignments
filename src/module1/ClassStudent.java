package module1;

public class ClassStudent {
    String name;
    int marks;
    void evaluateMarks(){
        if (marks < 45) {
            System.out.println(name + " has FAILED");
        }else {
            System.out.println(name + " has PASSED");
        }
    }
    public static void main(String[] args) {
        ClassStudent s1 = new ClassStudent();
        s1.name = "Meghana";
        s1.marks = 40;
        ClassStudent s2 = new ClassStudent();
        s2.name = "Gowrika";
        s2.marks = 60;
        s1.evaluateMarks();
        s2.evaluateMarks();
    }
}
