package models;

public class Students {
    String name;
    int age;
    float[] marks;
    int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Students(String name, int age, float[] marks, int grade) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }

    public void result(){
        float sum = 0;
        for(int i =0; i< marks.length;i++){
            sum +=marks[i];
        }
        float percentage = (sum/300)*100;
        System.out.print(name + ", Age "+ age+", studying in grade "+ grade+" got "+ percentage+"%. ");

        if (percentage > 90) {
            System.out.println("A+");
        } else if (percentage > 85) {
            System.out.println("A");
        } else if (percentage > 70) {
            System.out.println("B+");
        } else if (percentage > 55) {
            System.out.println("B");
        } else if (percentage > 40) {
            System.out.println("C+");
        }
    }
}
