package H_array08;

public class ArrayDi04 {

    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[4][5];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++)
                arr[row][col] = i++;
        }

        for (int row = 0; row < arr.length; row ++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " "); //0열 출력
            }
            System.out.println(); // 한 행이 끝나면 라인을 변경한다.
        }

    }
}
