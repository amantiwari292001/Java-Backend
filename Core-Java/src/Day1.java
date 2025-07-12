public class Day1 { //Main Class, Only one main/public class is possible in a file.
    public static void main(String[] cc) { //Main Method, Reference of point to start the program.
        System.out.print("No Next Line Output\n"); //Ways to print a value. \n gives next line.
        System.out.println("Next Line Output");

        //Variables: Helps in storing data. Also, In desired data type.
        //Data type: Primitive(Simple, Fixed Size), Non-Primitive(Can be modified).
        byte Byte = 123;
        short Short = 913;
        int Integer = 10;
        float Float = 10.14f;
        long Long = 741258963L;
        double Double = 741.852963;
        boolean Boolean = true; //or false
        char Char = 'A';
        String Char_Collection = "String: Collection of Characters";

        //Literals: Values of any variables.
        int binary = 0b101;
        int HexDecimal = 0x7E;
        int separate_Zeros = 10_00_000;
        int charToInt = 'A'; //Char can also be treated as integers.
        System.out.println(charToInt);

        //Type Conversion and Casting:
        // Conversion->Small to Big, Implicit, Keeping values with small data types in variables with big data type.
        // Casting-> Big to Small, Opposite of conversion.
        double casting = 10.741;
        float bigInSmall = (float) casting;

        //Arithmetic Operator: +, -, *, /, %(Modulus, Returns remainder).
        int num1 = 10;
        int num2 = 20;
        int add = num1 + num2;
        num2+=num1; //Short hand to use operators.
        num2*=num1;
        int rem = num2%11;
        System.out.println(rem);
        int postIncrement = 9;
        System.out.println(postIncrement++); //Post Increment makes the change in next step.
        int preIncrement = 19;
        System.out.println(++preIncrement); //Pre Increment makes the change in current step.

        //Relational Operator: >, <, >=, <=, ==, !=
        boolean isEqual = num1 == num2;
        boolean isGreater = num1 > num2;
        boolean isDifferent = num2 != num1;
        System.out.println(isDifferent);

        //Logical Operators: &&(And), ||(Or), !(Not)
        boolean useAnd = (num2>num1) && (num1>9); //And returns true when both conditions are true.
        boolean useOr = (num2>num1) || (num1==9); //Or returns true when one condition is true.
        boolean useNot = !(num2>num1); //Not returns false if condition is true and vide versa.
        System.out.println(useAnd);

        //Conditional Statements: Checking multiple conditions and returning the expected output.
        if(num1==15){
            System.out.println("Num1 is 15");
        } else if(num1==10){
            System.out.println("Num1 is 10");
        } else{
            System.out.println("It's 10");
        }

        //Ternary Operator: Condition?Then:Else; Short hand of if,else.
        boolean ternaryOperator = num1==20?true:false;
        System.out.println(ternaryOperator);

        //Switch Statements: Help to process only one variable.
        int day = 1;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("A week has 7 days.");
        }
    }
}

/*Java needs 3 things to run to work on any machine.
    JVM(Java Virtual Machine), It is platform dependent, it converts the code into machine language.
    JRE(Java Runtime Environment), It provides necessary libraries required to run the program, e.g. JVM.
    JDK(Java Development Kit), In order to write and compile our code, we need JDK, JRE comes under JDK. It is platform independent.

Flow of java program: Code>>Compiled by compiler in JDK>>Becomes byte code>>Gets Converted into machine language by JVM.*/