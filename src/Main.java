public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        //task4();
        //task5();
        //task6();
        //task7();
        //task8();
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

}

