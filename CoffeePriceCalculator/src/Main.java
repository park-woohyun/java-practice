import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int A =0, S = 0, O = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("음료수 를 선택해 주세요 -1.아메리카노(3000), 2.카페라떼(3500), 3.카푸치노(4000): ");
        int chois = sc.nextInt();
        System.out.print("음료 크기를 선택하세요. - 1.Small(0), 2.Medium(500), 3.Large(1000): ");
        int Size = sc.nextInt();
        System.out.print("음료 추가 옵션를 선택하세요. - 1.샷추가(500), 2.시럽추가(300), 3.샷+시럽추가(800): ");
        int Option = sc.nextInt();

        switch (chois) {
            case 1:
                A = 3000;
                break;
            case 2:
                A = 3500;
                break;
            case 3:
                A = 4000;
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                return;

        }

        switch (Size) {
            case 1:
                S = 0;
                break;
            case 2:
                S = 500;
                break;
            case 3:
                S = 1000;
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                return;

        }



        switch (Option) {
            case 1:
                O = 500;
                break;
            case 2:
                O = 300;
                break;
            case 3:
                O = 800;
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                return;
        }

        System.out.printf("최종 가격은 %d 입니다.", A+S+O);

    }
}