package homework10;

public class StringDoc {

    public static void getFirstEightNumber(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                System.out.print(str.charAt(i));
                count += 1;
                if (count == 4)
                    System.out.print("-");
            }
            if (count == 8)
                break;
        }
    }

    public static void getReplaceWord(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) && str.charAt(i) != '-')
                count += 1;
            else if (count == 3) {
                str = str.replace(str.substring(i - count, i), "***");
                count = 0;
            }
        }
        System.out.println(str);
    }

    public static void getLetter(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                System.out.print(str.charAt(i));
            }
        }
    }

    public static void stringBuilderLetters(String str) {
        StringBuilder sb = new StringBuilder("Letters:" + str.toUpperCase());
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isLetter(sb.charAt(i)) || sb.charAt(i) == ':')
                System.out.print(sb.charAt(i));

        }
    }

    public static void ABC(String str) {
        str = str.toLowerCase();
        if (str.contains("abc")) {
            System.out.println("true");
        } else
            System.out.println("false");
    }

    public static void startWith555(String str) {
        if (str.startsWith("555", 0)) {
            System.out.println("true");
        } else
            System.out.println("false");
    }

    public static void endWith1a2b(String str) {
        if (str.endsWith("1a2b")) {
            System.out.println("true");
        } else
            System.out.println("false");
    }

    public static void doubleLetter(String str2) {
        for (int i = 0; i < str2.length(); i++) {
            System.out.print(str2.charAt(i));
            System.out.print(str2.charAt(i));
        }
    }

    public static void minMaxWords(String str3) {
        String[] strings = str3.split(" ");
        String max = strings[0];
        String min = strings[0];
        for (String string : strings)
            if (string.length() >= max.length())
                max = string;
            else if (string.length() <= min.length())
                min = string;
        System.out.println("max: " + max + "\nmin: " + min);
    }

}



