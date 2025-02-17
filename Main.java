import java.util.Scanner;

class Main {

    public static String flipWords(String userString) {
        String[] words = userString.split(" ");
        String reverseString = "";

        for (int i = 0; i < words.length; i++) {
            reverseString += flipString(words[i]);
            if (i < words.length - 1) {
                reverseString += " ";
            }
        }
        return reverseString;
    }

    public static String flipString(String userString) {
        String reverseString = "";

        for (int i = userString.length() - 1; i >= 0; i--) {
            reverseString += userString.charAt(i);
        }
        return reverseString;
    }

    public static boolean checkString(String userString) {
        String[] words = userString.split(" ");

        if (words.length >= 2) {
            for (String word : words) {
                if (word.length() < 3) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userString;

        while (true) {
            System.out.println("Введіть строку: ");
            userString = sc.nextLine();

            if (checkString(userString)) {
                break;
            } else {
                System.out.println("Невірно введена строка, спробуйте знову!\n");
            }
        }
        System.out.println("Строка вірна! Що робимо далі?");

        int option;
        while (true) {
            System.out.println("\n1. Перевернути всю строку\n2. Перевернути слова");
            if (sc.hasNextInt()) {
                option = sc.nextInt();

                if (option == 1) {
                    System.out.println("Перевернута строка:\n" + flipString(userString));
                    break;

                } else if (option == 2) {
                    System.out.println("Перевернуті слова в строці:\n" + flipWords(userString));
                    break;
                } else {
                    System.out.println("Невірно введена команда. Спробуйте ще раз.");
                }
            } else {
                System.out.println("Невірно введена команда. Спробуйте ще раз.");
                sc.next();
            }
        }
    }
}
