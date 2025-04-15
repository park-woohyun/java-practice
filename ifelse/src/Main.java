import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tem = 0;
        System.out.print("온도를 입력하세요: ");
        tem = sc.nextInt();

        if (tem <= 18){
            System.out.println("두꺼운 옷을 입으세요!");
        }else{
            System.out.println("얇은 옷을 입으세요!");
        }


    }
}