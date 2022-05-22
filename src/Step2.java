public class Step2 {
    public static void main(String[] args) {
        int a = 100;
        int b = a + 200;
        int c = a + 1300;
        boolean thousand = true;

        int bonus;
        if (thousand) ;
        {
            bonus = 14;
        }
        if (false)
        {
            bonus = 0;
        }
        {
            System.out.println("Итог без бонуса=" + b);
        }
        {
            System.out.println("Итог с бонусом=" + (c + bonus));
        }

    }
}
