package homework10;

public class Main {
    public static void main(String[] args) {
        System.out.println("______task1______");
        String str = "1234-AbC-5678-dEf-R2D2";
        String str2="Hello";
        System.out.println(str);
        StringDoc.getFirstEightNumber(str);
        System.out.println();
        StringDoc.getReplaceWord(str);
        StringDoc.getLetter(str.toLowerCase());
        System.out.println();
        StringDoc.stringBuilderLetters(str);
        System.out.println();
        StringDoc.ABC(str);
        StringDoc.startWith555(str);
        StringDoc.endWith1a2b(str);
        System.out.println("______task2______");
        StringDoc.doubleLetter(str2);
    }
}
