/* 🟢🟢Reserved Words in JAVA 🟢🟢 */

/*
 * In JAVA some words are rerserved to represnt some meaning and funactionlaty
 * such type of worsd are caleld Reserved words
 */

/*
 * There are 53 reserved words in JAVA , where 50 are keywords and 3 are
 * Reserved literals (eg: true, false, null)
 */

/*
 * In 50 keywords 48 are used keywords and 2 are not used keywords(eg: const,
 * goto)
 * eg: for used keywords: if, else, while, do, switch, case, break, continue,
 * return, try, catch, finally, throw, throws, synchronized, volatile,
 * transient,
 * native, strictfp, assert, instanceof, new, this, super, class, interface,
 * extends, implements, package, import, public, private, protected, static 🚀🚀
 */

/* keywords for Data types */
public class ReservedWords {
    public static void main(String[] args) {
        int x = 10; // int is a reserved word for integer data type
        float y = 10.5f; // float is a reserved word for floating-point data type
        double z = 10.5; // double is a reserved word for double-precision floating-point data type
        char c = 'A'; // char is a reserved word for character data type
        boolean b = true; // boolean is a reserved word for boolean data type
        byte bt = 100; // byte is a reserved word for byte data type
        short s = 1000; // short is a reserved word for short data type
        long l = 100000; // long is a reserved word for long data type
        char ch = 'B'; // char is a reserved word for character data type
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(c);
        System.out.println(b);
        System.out.println(bt);
        System.out.println(s);
        System.out.println(l);
        System.out.println(ch); // these above listed are 8 keywords for data types in JAVA
    }
}

/*
 * Keywords for Flow Control Eg: if, else, switch, case, default, while, do,
 * for, break, continue, return i.e., there are 11 keywords for flow control in
 * JAVA
 */

/*
 * keywords for modifiers eg: public, private, protected, static, final,
 * abstract, synchronized, volatile, transient, native, strictfp(introduced in
 * JAVA 1.2), assert(introduced in JAVA 1.4) i.e., there are 12 keywords for
 * modifiers in JAVA
 */

/*
 * Keywords for Exception Handling eg: try, catch, finally, throw, throws,
 * assert(inroduced in JAVA 1.4) i.e., there are 6 keywords for exception
 * handling in JAVA
 */

/*
 * Class related key words eg: class, interface, extends, implements , package,
 * import
 */

/* Object related keywords eg: instanceof, new, super, and this */

/* Void return type keyword eg: void */
/*
 * In java return type is mandatory, if a method wont return anything then we
 * have to decalre that method with void return type
 */

/*
 * Unused keywords eg: const, goto
 * therefore, goto created several problems in the past or older languaged so,
 * it was decided to remove it from the language JAVA.
 * 
 * &&
 * 
 * Insted of const, we can use final keyword.
 */

/*
 * Reserved Literals eg: true, false, null
 * 
 * true and false are used for boolean data type
 * null is used to represent the null value or it is a default value for object
 * reference variable
 */

/* Enum keyword: We can use enum to define a group of named constants */

enum Color {
    RED, GREEN, BLUE
}

enum months {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

enum Beer {
    KINGFISHER, BIRA, BUDWEISER, HEINEKEN, CORONA
}

/*
 * CONCLUSION🔴🔴🔴
 * 1) All 53 reserved words are case sensitive, so we have to use them in lower
 * case only
 * 2) In java we have only new keyword, and there is no delete keyword, so we
 * can use new keyword to create an object and to delete that object we can use
 * null value
 * 3) In java we have only new keyword, and there is no delete keyword,because
 * destruction of useless objects is handled by Garbage Collector(GC) in JAVA.
 * 4) the following 3 are the new keywords introduced in JAVA 1.2, 1.4, and 1.5
 * respectively they are strictfp(1.2), assert(1.4), and enum(1.5) keywords.
 * 
 * 
 * a) strictfp butnot strictFp.
 * b) assert but not Assert.
 * c) enum but not Enum.
 * d) instanceof but not instanceOf, etc, etc .........
 */