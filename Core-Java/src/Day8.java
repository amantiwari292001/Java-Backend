//Jargon: Concrete class(Methods have body)

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Function;

public class Day8 {
    public static void main(String[] args) {
        Functional f = new Functional(){
            public void show(){ //Methods inside anonymous classes need to be public.
                System.out.println("Functional Interface");
            }
        };
        //Lambda function is a way to write this thing in an easy way.
        //Here, after declaring the variable, we override the method.
        Functional f2 = () -> System.out.println("Lambda Function");
        f2.show();

        FunctionalParameter fp = (s) -> System.out.println("Functional Parameter: " + s);
        fp.show("Hey!");

        FunctionalReturn fr = (b) -> {return true;}; //It could be (b) -> true
        System.out.println(fr.show(true));

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //Exception Handling: Compile time(Handle by Editor), Runtime error, Logic error
        try{ //Normal statement
            if(num>100){
                throw new CustomException("Thrown Custom Exception"); //"throw" allows us to throw an exception explicitly, but inside try{}
            }
            System.out.println((10/num));
        } catch(ArithmeticException e){ //Critical statement, this catches the error.
            System.out.println(e.getLocalizedMessage());
        } catch(InputMismatchException e){ //We can use multiple catch blocks
            System.out.println(e.getMessage());
        } catch(CustomException e){
            System.out.println(e.getMessage());
        }
        finally { //Finally block, will run everytime, results doesn't matter.
            System.out.println("Final Block");
        }
    }
}

//Types of Interfaces->
//    Normal: Have more than one method.
//    Functional: Have only one method.
//    Marker: Have no method.

interface Functional{ //Abstract methods acts same when implement interface as same as when interface extends another interface.
    void show();
}

interface FunctionalParameter{
    void show(String s);
}

interface FunctionalReturn{
    boolean show(boolean b);
}

//Create Custom Exception
class CustomException extends Exception{ //Exception is the parent class, We need to extend it in order to create custom exception.
    public CustomException(String message){ //This is the message that we see in CLI
        super(message);
    }
}

//Object -> Throwable -> Exception(Should be handled) and Errorr(We can't)
//  -> Runtime(Arithmetic and All, Also called Un-Checked) and SQLException(IOException, also called Checked)