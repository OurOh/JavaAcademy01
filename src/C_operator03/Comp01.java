package C_operator03;

public class Comp01 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b); //false
        System.out.println(a != b); //true
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //결과를 boolean 변수에 담을 수 있다.
        boolean result = a == b;
        System.out.println(result); //false


    }
}
