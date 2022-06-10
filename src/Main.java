public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte x = 10;
        short y = 8;
        int z = 7;
        long box = 100L;
        float square = 8.4f;
        double t = 75.6;
        int age = 23;
        boolean isAdult = age >= 16;
        char c = 36;
        //  Задание 2
        double weight1 = 78.2;
        double weight2 = 82.7;
        double weightBoth = weight1 + weight2;
        System.out.println("Общий вес бойцов " + weightBoth);
        double difference = weight2 - weight1;
        System.out.println("Разница веса " + difference);
        byte banana1 = 80;
        byte milk1 = 105;
        byte iceCream1 = 100;
        byte egg = 70;
        double weightBreakfast = (banana1 * 5) + (milk1 * 2) + (iceCream1 * 2) + (egg * 4);
        System.out.println("Общий вес завтрака " + weightBreakfast);
        double weightBreakfast1 = weightBreakfast / 1000;
        System.out.println("Общий вес завтрака " + weightBreakfast1 + "кг");
        // Задание 4
        double weightToLose = 7;
        double weight1day1 = 0.5;
        double weight1day2 = 0.25;
        double days1 = weightToLose / weight1day1;
        double days2 = weightToLose / weight1day2;
        double days3 = weightToLose / ((weight1day1 + weight1day2) / 2);
        System.out.println(" По 250 гр необходимо " + days1 + "дней;" + " по 500 гр " + days2 + " в среднем -" + days3 );
        // Задание 5
        int mashaYear = 12 * 67760;
        int denisYear = 12 * 83690;
        int kristinaYear = 12 * 76230;
        double mashaYear2 = mashaYear * 1.1;
        double denisYear2 = denisYear * 1.1;
        double kristinaYear2 = kristinaYear * 1.1;
        double differenceMasha = mashaYear2 - mashaYear;
        double differenceDenis = denisYear2 - denisYear;
        double differenceKristina = kristinaYear2 - kristinaYear;
        System.out.println("Маша теперь получает " + mashaYear2 +  "рублей. Годовой доход вырос на " + differenceMasha + " рублей. Денис теперь получает " + denisYear2 + " рублей. Годовой доход вырос на " + differenceDenis + " рублей. “ Кристина теперь получает " + kristinaYear2 + " рублей. Годовой доход вырос на " + differenceKristina + " рублей ");




        {
        }





    }
}