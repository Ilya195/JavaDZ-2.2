public class Step2 {
    public static void main(String[] args) {
        int balance = 100;
        int refill = balance + 1300;

        int bonus = 14;
        if (refill >= 1000)
            bonus = refill / 100;

        System.out.println("Итог с бонусом=" + (refill + bonus));
        
    }
}
