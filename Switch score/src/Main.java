import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int score =0;

        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요: ");
        score = sc.nextInt();

        if (score <= 100 && score >= 0) {
            switch (score/10) {
                case 10:
                case 9:
                    System.out.printf("A학점.");
                    break;
                case 8:
                    System.out.printf("B학점.");
                    break;
                case 7:
                    System.out.printf("C학점");
                    break;
                case 6:
                    System.out.printf("D학점");
                    break;
                default:
                    System.out.printf("F학점");
                    break;

            }
        }else{
            System.out.println("잘못 입력하셨습니다.");

        }

    }
}