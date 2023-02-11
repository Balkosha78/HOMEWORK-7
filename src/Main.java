public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int amountOfSaving = 0;
        int stash = 15_000;
        int desiredSavings = 2_459_000;
        int months = 0;
        while (amountOfSaving <= desiredSavings) {
            amountOfSaving = amountOfSaving + stash;
            System.out.println("Месяц " + months + " сумма накоплений равна " + amountOfSaving);
            months++;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(" " + i);
            i++;
        }
        System.out.println();
        for (int number = 10; number >= 1; number--) {
            System.out.print(" " + number);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int populationOfTheContry = 12_000_000;
        int years = 10;
        int birthRate = 17;
        int mortality = 8;
        for (int i = 1; i <= years; i++) {
            populationOfTheContry += (populationOfTheContry / 1000 * (birthRate - mortality));
            System.out.println("Год " + i + " численность населения составляет " + populationOfTheContry);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double depositAmount = 15_000;
        int totalMoney = 12_000_000;
        double rate = 0.07;
        int currentMonths = 1;
        while (depositAmount <= totalMoney) {
            depositAmount *= (1 + rate);
            System.out.println("Месяц " + currentMonths + " накопления " + depositAmount);
            currentMonths++;
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double depositAmount = 15_000;
        int totalMoney = 12_000_000;
        double ratePerMonth = 0.07;
        int currentMonths = 1;
        while (depositAmount <= totalMoney) {
            depositAmount *= (1 + ratePerMonth);
            if (currentMonths % 6 == 0) {
                System.out.println("Месяц " + currentMonths + " накопления " + depositAmount);
            }
            currentMonths++;
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double depositAmount = 15_000;
        double ratePerMonth = 0.07;
        int years = 9;

        for (int currentMonths = 1; currentMonths < years * 12; currentMonths++) {
            depositAmount *= (1 + ratePerMonth);
            if (currentMonths % 6 == 0) {
                System.out.println("Месяц " + currentMonths + " накопления " + depositAmount);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 5;
        int month = 31;
        for (int i = friday; i < month; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + " -е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int recentYears = currentYear - 200;
        int commingYear = currentYear + 100;
        for (int i = recentYears; i <= commingYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}

