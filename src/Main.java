public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        byte a = 1;
        System.out.println("Значение переменной A с типом byte равно " + a);
        short b = -140;
        System.out.println("Значение переменной B с типом short равно " + b);
        int c = 123456;
        System.out.println("Значение переменной C с типом int равно " + c);
        long d = 1;
        System.out.println("Значение переменной D с типом long равно " + d);
        float e = 1.3f;
        System.out.println("Значение переменной E с типом float равно " + e);
        double f = 22.22f;
        System.out.println("Значение переменной F с типом double равно " + f);

        // Задание 2
        System.out.println("Задание 2");
        float boxWeight = 27.12f;
        System.out.println("Значение переменной boxWeight с типом float равен " + boxWeight);
        long packageWeight = 987678965549l;
        System.out.println("Значение переменной packageWeight с типом long равен " + packageWeight);
        double bagWeight = 2.786;
        System.out.println("Значение переменной bagWeight с типом double равен " + bagWeight);
        boolean bucketWeight = false;
        System.out.println("Значение переменной bucketWeight с типом boolean равен " + bucketWeight);
        short cartWeight = 569;
        System.out.println("Значение переменной cartWeight с типом short равен " + cartWeight);
        int ballWeigh = -159;
        System.out.println("Значение переменной ballWeigh с типом int равен " + ballWeigh);
        char houseWeight = 27897;
        System.out.println("Значение переменной houseWeight с типом char равен " + houseWeight);
        byte borisWeight = 67;
        System.out.println("Значение переменной borisWeight с типом byte равен " + borisWeight);

        // Задание 3
        System.out.println("Задание 3");
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        int totalStudents = firstClass + secondClass + thirdClass;
        System.out.println("Всего " + totalStudents + " учеников");
        short totalPaper = 480;
        int sheetsOfPaperToEach = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsOfPaperToEach + " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");
        byte machinePerformance = 16;
        byte time1 = 2;
        int machineCapacityPerMinute = machinePerformance / time1;
        System.out.println("За 1 минуту машина произвела бутылок " + machineCapacityPerMinute + " штук");
        byte time2 = 20;
        int machinePerformanceIn20Minutes = machineCapacityPerMinute * time2;
        System.out.println("За 20 минуту машина произвела бутылок " + machinePerformanceIn20Minutes + " штук");
        int machineCapacityPerHour = machineCapacityPerMinute * 60;
        System.out.println("За 1 час машина произвела бутылок " + machineCapacityPerHour + " штук");
        int machinePerformancePerDay = machineCapacityPerHour * 24;
        System.out.println("За 24 час машина произвела бутылок " + machinePerformancePerDay + " штук");
        int machinePerformanceIn3Days = machinePerformancePerDay * 3;
        System.out.println("За 3 дня машина произвела бутылок " + machinePerformanceIn3Days + " штук");
        int machinePerformancePerMonth = machinePerformancePerDay * 30;
        System.out.println("За месяц машина произвела бутылок " + machinePerformancePerMonth + " штук");

        // Задача 5
        System.out.println("Задача 5");
        int totalCansOfPaint = 120;
        System.out.println("Всего банок краски " + totalCansOfPaint + " штук");
        int totalClasses = totalCansOfPaint / 6;
        System.out.println("Всего " + totalClasses + " классов");
        int cansOfWhitePaint = totalClasses * 2;
        int cansOfBrownPaint = totalClasses * 4;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + cansOfWhitePaint + " банок белой краски и " + cansOfBrownPaint + " банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");
        int bananas = 5 * 80;
        int milk = 105 * 2;
        int iceCreamSundae = 100 * 2;
        int rawEggs = 4 * 70;
        long weightOfTheSportsBreakfastInGrams = bananas + milk + iceCreamSundae + rawEggs;
        System.out.println("Вес спорт-завтрака " + weightOfTheSportsBreakfastInGrams + " гр");
        float weightOfTheSportsBreakfastInKilograms = weightOfTheSportsBreakfastInGrams / 1000;
        System.out.println("Вес спорт-завтрака " + weightOfTheSportsBreakfastInKilograms + " кг");

        // Задача 7
        System.out.println("Задача 7");
        float excessWeight = 7 * 1000;
        System.out.println("Нужно сбросить " + excessWeight + " гр");
        float diet1 = excessWeight / 250;
        System.out.println( + diet1 + " дней");
        float diet2 = excessWeight / 500;
        System.out.println( + diet2 + " дней");
        double averageDiet = (diet1 + diet2) / 2;
        System.out.println("В среднем " + averageDiet + " день");

        // Задача 8
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int mashaSalaryPerYear = mashaSalary * 12;
        int denisSalaryPerYear = denisSalary * 12;
        int kristinaSalaryPerYear = kristinaSalary * 12;
        double mashaNewSalary = 67760 * 1.10;
        double denisNewSalary = 83690.0 * 1.10;
        double kristinaNewSalary = 76230 * 1.10;
        double mashaNewSalaryPerYear = mashaNewSalary * 12;
        double denisNewSalaryPerYear = denisNewSalary * 12;
        double kristinaNewSalaryPerYear = kristinaNewSalary * 12;
        double differenceMasha = mashaNewSalaryPerYear - mashaSalaryPerYear;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        double differenceDenis = denisNewSalaryPerYear - denisSalaryPerYear;
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        double differenceKristina = kristinaNewSalaryPerYear - kristinaSalaryPerYear;
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + differenceKristina + " рублей");
    }
}