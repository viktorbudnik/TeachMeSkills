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
            if (Character.isLetter(str.charAt(i))&& str.charAt(i) != '-')
                count += 1;
            else if (count == 3) {
                str = str.replace(str.substring(i - count, i), "***");
                count = 0;
            }
        }
        System.out.println(str);
    }
}

