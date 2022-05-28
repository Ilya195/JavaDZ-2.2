public class Step2 {
    public static void main(String[] args) {
        int balance = 300;
        int refill = 1400;


        int bonus = refill > 1000 ? refill / 100 : 0;
        // if (refill > 1000){
        //   bonus = refill / 100;
            int total = balance + refill + bonus;


            System.out.println("Итог с бонусом=" + total);
            System.out.println("Бонус=" + bonus);
        }
    }
