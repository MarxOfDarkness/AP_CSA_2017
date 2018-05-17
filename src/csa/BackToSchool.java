package csa;

public class BackToSchool {
    public static void main(String[] args){
        Person bob = new Person("Bob", 37, "M");
        System.out.println(bob);
        Student matt = new Student("Matt", 14, "M", "123456", 4.27);
        System.out.println(matt);
        Teacher mrJava = new Teacher("Prince Java", 32, "M", "Computer Science", 50000);
        System.out.println(mrJava);
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123",
                4.0,  "English", 1);
        System.out.println(ima);
    }
}
