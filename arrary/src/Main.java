import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int studentCount = 0, subjectCount = 0;

        Scanner sc = new Scanner(System.in);

        ArrayList<int[][]> scores = new ArrayList<>();

        System.out.print("학생수를 입력하세요: ");
        studentCount = sc.nextInt();

        System.out.print("과목수를 입력하세요: ");
        subjectCount = sc.nextInt();

        int[][] scores1 = new int[studentCount][subjectCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.println("\n[" + (i + 1) + "번 학생의 성적 입력]");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print("과목 " + (j + 1) + " 점수: ");
                scores1[i][j] = sc.nextInt();
            }
        }

        System.out.println("--- 성적표 ---");
        for (int i = 0; i < studentCount; i++) {
            System.out.print((i + 1) + "번 학생: ");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print(scores1[i][j] + " ");
            }
            System.out.println();


        }
    }
}
