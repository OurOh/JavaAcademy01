package D_cond04;

public class Switch02 {

    public static void main(String[] args) {

        int grade = 2;

        int coupon;
        switch(grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰:" + coupon);
    }
}
// if문의 변형 느낌