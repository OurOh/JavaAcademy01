package E_loop05;

public class Break01 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true) {
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i= " + i + ", sum =" + sum);
                break;
            }
            i++;
        }
    }
}
