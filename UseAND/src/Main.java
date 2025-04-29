import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x;

        Scanner sc = new Scanner(System.in);
        System.out.printf("하나의 정수 입력: ");
        x = sc.nextInt();

        if (x >= 1 && x <=100){
            System.out.println("1에서 100사이의 값입니다.");
        }else{
            System.out.println("1에서 100사이의 값이 아닙니다.");
        }
    }
}