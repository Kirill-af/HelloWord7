public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Task 1");

        int desiredSum = 2_459_000;
        int sum = 0;
        int amount = 15_000;
        double percent = 1D / 100;
        int mouth = 0;
        while (sum < desiredSum) {
            sum += amount;
            sum = (int) (sum * (1 + percent));
            mouth++;
            System.out.println("Месяц " + mouth + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println("Task 2");

        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Task 3");
        int population = 12_000_000;
        int fertilityPerThousand = 17;
        int mortalityPerThousand = 8;
        int currentYear = 2024;

        for (int year = currentYear; year < currentYear + 10; year++) {
            population += population * fertilityPerThousand / 1000 - population * mortalityPerThousand / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println();
        System.out.println("Task 4");
        percent = 7D / 100;
        desiredSum = 12_000_000;
        sum = amount;
        mouth = 0;

        while (sum < desiredSum) {
            sum = (int) (sum * (1 + percent));
            mouth++;
            System.out.println("Месяц " + mouth + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println();
        System.out.println("Task 5");

        sum = amount;
        mouth = 0;

        while (sum < desiredSum) {
            sum = (int) (sum * (1 + percent));
            mouth++;
            if (mouth % 6 == 0) {
                System.out.println("Месяц " + mouth + ", сумма накоплений равна " + sum + " рублей");
            }
        }

        System.out.println();
        System.out.println("Task 6");

        sum = amount;
        mouth = 0;
        int months = 12 * 9;

        while (mouth < months) {
            sum = (int) (sum * (1 + percent));
            mouth++;
            if (mouth % 6 == 0) {
                System.out.println("Месяц " + mouth + ", сумма накоплений равна " + sum + " рублей");
            }
        }

        System.out.println();
        System.out.println("Task 7");

        int firstFriday = 3;


        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + " -е число. Необходимо подготовить отчет");
        }

        System.out.println();
        System.out.println("Task 8");

        int period = 79;
        int startSeeing = 0;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = startSeeing; year < end; year += period) {
            if (year > start) {
                System.out.println(year);
            }
        }

    }
}
