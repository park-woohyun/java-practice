import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade; int score=0;

        System.out.print("점수를 입력하세요: ");
        score = sc.nextInt();


        if (score <= 100 && score >= 90) {
            grade = "A";
        }else if (score < 90 && score >= 80) {
            grade = "B";
        }else if (score < 80 && score >= 70) {
            grade = "C";
        }else if (score < 70 && score >= 60) {
            grade = "D";
        }else if (score < 60 && score >= 0) {
            grade = "F";
        }else{
            grade = "Error";
        }

        System.out.println("학점: " + grade);
    }
}