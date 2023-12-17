import models.Students;
public class Main {
    public static void main(String[] args) {
        float[] mark1={75,80,85};
        Students std1 = new Students("Sita",17,mark1,12);

        float[] mark2 = {80,65,72};
        Students std2 = new Students("Ramita",17,mark2,12);

        float[] mark3 = {92,80,85};
        Students std3 = new Students("Manita",17,mark3,12);

        std3.result();
        std2.result();
        std1.result();
    }
}