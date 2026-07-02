/**
 * JAVA Language fundamentals
 * 1) Identifiers
 * 2) Reserved words
 * 3) Data types
 * 4) Literals
 * 5) Arrays
 * 6) Types of Variables
 * 7) Var-args method
 * 8) main method
 * 9) Command line arguments
 * 10) Java Coding standards
 **/

// A name in JAVA is Called an identifier.

class test {
    public static void main(String[] args) {
        int x = 10; // x is an identifier
        System.out.println(x + " is an identifier");
    }
}

/**
 * There are 5 identifires in the above code snippet they are test, main,
 * String[], args, x. All identifiers are case sensitive and can be of any
 * length. An identifier can be a combination of letters, digits, underscore and
 * dollar sign. An identifier cannot start with a digit. An identifier cannot be
 * a reserved word
 * 
 * JAVA identifiers are case sensitive.
 * 
 * 
 * Therefore, the JAVA programming is case sensitive language.
 **/

class test1 {
    int number = 10;
    int Number = 20;
    int NUMBER = 30;

    public static void main(String[] args) {
        test1 t = new test1();
        test1 t1 = new test1();
        test1 t2 = new test1();
        System.out.println(t.number);
        System.out.println(t1.Number);
        System.out.println(t2.NUMBER);
    }
}

/**
 * the above
 * code snippet
 * is valid
 * in JAVA
 * because all
 * the identifiers
 * are different.
 * The identifiers are case
 * sensitive.The identifier
 * number is
 * different from
 * Number and NUMBER
 * .
 **/

class person {
    public static void main(String[] args) {
        var person1 = "Darshan SR";
        var person2 = "Harshitha CM";
        System.out.println(person1 + " is a BACKEND DEVELOPER 💻");
        System.out.println(person2 + " is a FRONTEND DEVELOPER 🌐");
    }
}
/*
 * there is
 * no lenght limit for
 * JAVA identifiers.
 * The identifier
 * can be
 * of any length
 * 
 * 
 * Not recommended to use long identifiers because it will reduce the
 * readability of the code.
 */
