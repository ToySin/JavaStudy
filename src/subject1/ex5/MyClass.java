package subject1.ex5;

public class MyClass {

    String name;
    int age;
    String gender;
    boolean isMarried;
    int child;

    public MyClass(String name) {
        this.name = name;
    }

    public void PrintInfo() {
        System.out.println("이름은 " + name + "이고 나이는 " +
                age + "세 입니다.");
        System.out.print("성별은 " + gender + "이며, " +
                (isMarried ? "기혼자" : "미혼자") + " 입니다. ");
        System.out.println("자녀는 " +
                child + "명이 있습니다.");
    }
}
