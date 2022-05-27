public class Step2 {
    public static void main(String[] args) {
        int balance = 100;
        int refill = balance + 1300;

        int bonus = 0;
        if (refill >= 1000){
            bonus = refill / 100;
        }else {
            bonus = 0;
        }

        System.out.println("Итог с бонусом=" + (refill + bonus));

    }
}
