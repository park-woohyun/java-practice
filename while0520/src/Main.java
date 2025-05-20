import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0, a = 0;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("점수를 입력하세요(종료하려면 음수를 입력): ");
            a = sc.nextInt();


            if(a >= 0){
                sum = sum + a;

            }else{
                System.out.println("점수의 총합은: " + sum);
                break;
            }
        }
    }
}