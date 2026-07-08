public class charClass {
    public static void main(String[] args) {
        // ! Valueof(char only no string) for autoboxing, charValue() for autoUnboxing
        Character c = 'A';
        Character ch = Character.valueOf('e');
        char ch1 = c.charValue();

        // ! Utility methods (VERY important)

        boolean b = Character.isDigit('5');
        System.out.println(b);

        b = Character.isLetter('a');
        System.out.println(b);

        b = Character.isUpperCase('A');
        System.out.println(b);

        b = Character.isLowerCase('a');
        System.out.println(b);

        char c1 = Character.toUpperCase('a');
        System.out.println(c1);

        c1 = Character.toLowerCase('A');
        System.out.println(c1);

    }
}
