package G_scanner07.Ex;

import java.util.Scanner;

public class ScannerWhileEx07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 :  (종료를 입력하면 종료)");
            String name = input.nextLine();

            //체크하기
            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요 : ");
            int age = input.nextInt();
            input.nextLine();

            System.out.println("입력한 이름: " + name + ", 입력한 나이: "+ age);

        }
    }
}
