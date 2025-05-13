import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int sum =0, a = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        a = sc.nextInt();


        for(int i = 1; i <= a; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("계산 결과: " + sum);
    }

}