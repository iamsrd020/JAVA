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

// We cant use resreverd words as identifiers in JAVA.
// int x = 10; // this can be used as an identifier because x is not a reserved
// word in JAVA
// int if = 20; // invalid identifier because if is a reserved word in JAVA

class test3 {
    public static void main(String[] args) {
        int String = 8888;
        System.out.println(String);

        int Runnable = 999;
        System.out.println(Runnable);
    }
}

/*
 * The above example class test3 shud not be used, because it goes against the
 * naming conventions and can lead to confusion.
 */

/*
 * 1) total_number = valid identifier because it is a combination of letters,
 * digits and underscore ✅
 * 2) total# = not valid because it contains # which is not allowed in
 * identifiers ❌
 * 3) 123total = not valid because it starts with a digit ✅
 * 4) total123 = valid identifier because it is a combination of letters and
 * digits ✅
 * 5) ca$h = valid identifier because it is a combination of letters and dollar
 * sign ✅
 * 6)_$_$_$_$_$ = valid identifier because it is a combination of underscore and
 * dollar ✅
 * 7) all@darshan = not valid because it contains @ which is not allowed in
 * identifiers ❌
 * 8) Java2share = valid identifier because it is a combination of letters and
 * digits ✅
 * 9) Interger = valid identifier because it is a combination of letters ✅
 * 10) Int = valid identifier because it is a combination of letters ✅
 * 11) int = not valid because it is a reserved word in JAVA ❌
 */

/*------------------------------------------------------------ 🔴🔴END OF IDENTIFIERS 🔴🔴-------------------------------------------*/