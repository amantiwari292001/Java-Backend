public class Day2 {
    public static void main(String[] args) {
        //Loops: Write once, run multiple times. e.g. while, do while, for
        for(int i = 1;i<=5;i++){ //Initiation ,Condition ,Increment/Decrement
            System.out.println("For: " + i);
        }

        int i = 10; //Initiation
        while(i<=50){ //Condition, If condition is true, while becomes infinite loop.
            System.out.println("While: " + i);
            i+=10; //Increment/Decrement
        }

        //Do while is an exit loop, it checks the condition after running the logic.
        int j = 11; //Initiation
        do{
            System.out.println("Do While: " + j);
            j++; //Increment/Decrement
        } while(j <= 15); //Condition

        //Object-Oriented Programming
        //Object: Properties(Identity) and Behaviour(Work)

        //Class: Builds the properties and behaviours for an object.
        Calculator c = new Calculator(); //Creating object
        int a = 10;
        int b = 20;
        int result = c.add(a, b); //Storing return value.
        System.out.println(result);
        int anotherResult = c.add(10,20,30);
        System.out.println(anotherResult);

    }
}

        //An example of a class.
class Calculator{
    //Behaviour or what the object could do can be represented by methods.
    public int add(int a, int b){ //int is the return type of add method.
        return a+b; //If method returns something, store it somewhere.Here a and b are local variables which works under a block.
    }

    public int add(int a, int b, int c){
        //Methods with same name but different parameter type,name or return type are called method overloading.
        return a+b+c;
    }
}

//Stack Vs Heap Memory:
//variables from main method are stored in stack memory, when an outer function is called it creates another stack for itself.
//objects data gets save in heap memory. e.g. Calculator c = new Calculator(), c is a reference variable which will get store in stack,
//but everything inside it will get stored in heap. Obj will be having an address same as in heap to point out the correct values/data of the object.
