import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 , num2, num3;

        System.out.print("첫번째 숫자를 입력하세요: ");
        num1 = sc.nextInt();
        System.out.print("두번째 숫자를 입력하세요: ");
        num2 = sc.nextInt();
        System.out.print("세번째 숫자를 입력하세요: ");
        num3 = sc.nextInt();




        System.out.println(num1-num2-num3);
    }
}
