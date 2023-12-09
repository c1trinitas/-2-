public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int apples = 112;
        byte watermelons = 17;
        short pears = 226;
        long oranges = 138543;
        float sugar = 12f;
        double shrimps = 145.6589;
        System.out.println("Значение переменной apples с типом int равно =" + apples );
        System.out.println("Значение переменной watermelons с типом byte равно =" + watermelons );
        System.out.println("Значение переменной pears с типом short равно =" + pears );
        System.out.println("Значение переменной oranges с типом long равно =" + oranges );
        System.out.println("Значение переменной sugar с типом float равно =" + sugar );
        System.out.println("Значение переменной shrimps с типом double равно =" + shrimps );
        System.out.println("Задача 2");
        float xp = 21.12F;
        long xc = 987678965549l;
        double rt = 2.786;
        char ty = 569;
        int pi = -159;
        short tq = 27897;
        byte tz = 67;
        System.out.println(xp);
        System.out.println(xc);
        System.out.println(rt);
        System.out.println(ty);
        System.out.println(pi);
        System.out.println(tq);
        System.out.println(tz);
        System.out.println("Задача 3");
        int LyudmilaPavlovna = 23;
        int AnnSergeevna = 27;
        int EkaterinaAndreevna = 30;
        int paper = 480;
        int totalStud = (LyudmilaPavlovna + AnnSergeevna + EkaterinaAndreevna);
        System.out.println(totalStud);
        int paperTostud = (480 / totalStud);
        System.out.println("На каждого ученика рассчитано" + paperTostud + "листов бумаги");
        System.out.println("Задача 4");
        int boutle = 16;
        int min = 2;
        int oneMin = 16 / 2;
        int twentyMin = oneMin * 20;
        int dayTime = oneMin * 1140;
        int oneMonth = oneMin * 43800;
        System.out.println(oneMin);
        System.out.println(twentyMin);
        System.out.println(dayTime);
        System.out.println(oneMonth);
        System.out.println("Задача 5");
        int totalColours = 120;
        int oneBrown = 4;
        int oneWhite = 2;
        int oneClass = (oneBrown + oneWhite);
        System.out.println(oneClass);
        int totalClasses = (totalColours / oneClass);
        System.out.println(totalClasses);
        int brownPaint = (totalClasses * oneBrown);
        System.out.println(brownPaint);
        int whitePaint = (totalClasses * oneWhite);
        System.out.println(whitePaint);
        System.out.println("В школе где" + totalClasses + "нужно" + brownPaint + "банок коричневой краски" + whitePaint +"банок белой краски");
        System.out.println("Задача 6");
        int banana = 80;
        int bananas = (banana * 5);
        System.out.println(bananas);
        int milk = 105;
        int milkTwo = (milk * 2);
        System.out.println(milkTwo);
        int iceCream = 100;
        int doubleIce = (iceCream * 2);
        System.out.println(doubleIce);
        int egg = 70;
        int eggs = (egg * 4);
        System.out.println(eggs);
        int totalMass = (milkTwo + doubleIce + bananas + eggs);
        System.out.println(totalMass);
        float kgMass = (totalMass / 1000f);
        System.out.println(kgMass);
        System.out.println("Вес такого завтрака составляет" + totalMass + "грамм" + "в килограммах это будет" + kgMass + "кг");
        System.out.println("Задача 7");
        int requiredWeight = 7000;
        int dailyMass = 250;
        int everydayVarOne = (requiredWeight / dailyMass);
        System.out.println("Чтобы потерять 7 кг веса, теряя в день" + dailyMass + "грамм" + "спортсмен должен заниматься" + everydayVarOne + "дней");
        int dailyMassVarTwo = 500;
        int everydayVarTwo = (requiredWeight / dailyMassVarTwo);
        System.out.println("Чтобы потерять 7 кг веса, теряя в день" + dailyMassVarTwo + "грамм" + "спортсмен должен заниматься" + everydayVarTwo + "дней");
        System.out.println("Задача 8");
        int maria = 67760;
        int denis = 83690;
        int kristina = 76230;
        int partFromSalaryMaria = (maria / 10);
        int partFromSalaryDenis = (denis / 10);
        int partFromSalaryKristina = (kristina / 10);
        System.out.println("Часть от зарплаты Маши составляет" + partFromSalaryMaria);
        System.out.println("Часть от зарплаты Дениса составляет" + partFromSalaryDenis);
        System.out.println("Часть от зарплаты Кристины составляет" + partFromSalaryKristina);
        int salaryAfterPromotionMaria = (maria + partFromSalaryMaria);
        int salaryAfterPromotionDenis = (denis + partFromSalaryDenis);
        int salaryAfterPromotionKristina = (kristina + partFromSalaryKristina);
        System.out.println("Зарплата Маши после поднятия будет составлять" + salaryAfterPromotionMaria + "рублей в месяц");
        System.out.println("Зарплата Дениса после поднятия будет составлять" + salaryAfterPromotionDenis + "рублей в месяц");
        System.out.println("Зарплата Кристины после поднятия будет составлять" + salaryAfterPromotionKristina + "рублей в месяц");
        System.out.println("Годовой доход Маши вырос на" + partFromSalaryMaria + "рублей");
        System.out.println("Годовой доход Дениса вырос на" + partFromSalaryDenis + "рублей");
        System.out.println("Годовой доход Кристины вырос на" + partFromSalaryKristina + "рублей");







    }
}