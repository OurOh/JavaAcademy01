package H_array08.ex;

import java.util.Scanner;

public class ArrayEx07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "수학", "영어"};

        for (int i = 0;  i < 4; i++ ) {
            System.out.println((i + 1) + " 번 학생의 성적을 입력하세요");
            for (int j = 0; j < 3; j ++) {
                System.out.println(subjects[j] + "점수 : ");
                scores [i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            System.out.println((i+1) + " 번 학생의 총점 : " + total + " , 평균: " + average);
        }

    }
}
