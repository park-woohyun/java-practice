import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kor =0 , eng =0 , mat =0 , sci =0, sum =0, intAVg =0;
        double doubleAvg = 0.0;
        boolean boolRslt = false;

        System.out.print("국어점수를 입력하세요: ");
        kor = sc.nextInt();
        System.out.print("영어 점수를 입력하세요: ");
        eng = sc.nextInt();
        System.out.print("수학 점수를 입력하세요: ");
        mat = sc.nextInt();
        System.out.print("과학 점수를 입력하세요: ");
        sci = sc.nextInt();

        sum = kor + eng + mat + sci;
        intAVg = sum/4;
        doubleAvg = (double)sum/4;

        boolRslt = intAVg == doubleAvg;

        System.out.println("총점: " + sum);
        System.out.println("평균: " + intAVg);
        System.out.println("실수평균: " + doubleAvg);
        System.out.printf("정수형평균: %d, 실수형평균: %.2f, 평균 비교: %s ", intAVg, doubleAvg , boolRslt);
    }
}