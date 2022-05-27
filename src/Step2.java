public class Step2 {
    public static void main(String[] args) {
        int balance = 100;
        int refill_1 = balance + 200;
        int refill_2 = balance + 1300;

        int bonus;
        bonus = 14;
        System.out.println("Итог без бонуса=" + refill_1);
        System.out.println("Итог с бонусом=" + (refill_2 + bonus));
    }
}
