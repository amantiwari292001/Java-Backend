public class Day7 {
    public static void main(String[] args) {
        Virtus v =  new Virtus();
        v.drive();

        v = new Virtus(){
            public void drive(){ //After () we are creating a class, an anonymous inner class.
                System.out.println("Driving anonymous class");
            }
        };

        Car c = new Car(){
            @Override //An annotation, shows intention/metadata.
            public void drive(){ //Abstract class doesn't allow us to create an object of it, but with anonymous inner class we caan achieve it.
                System.out.println("Object of Abstract class.");
            }
        };

        Outer o = new Outer();
        o.call();
        Outer.Inner i =  o.new Inner(); //Just like methods needs class obj to get called.
        //If class was static we would do 'new Outer.Inner();'

        Interface l = new ImplementationOfInterface();
        l.two();
        System.out.println(Interface.one);

        Status en = Status.CHARGED; //Using enums
        System.out.println(en);

        Actions act = Actions.CANCELED;
        System.out.println(act.getAction());
    }
}
//The idea behind abstract method is that different child classes requires different implementations, that can be achieved by abstract methods.
abstract class Car{ //Abstract class doesn't need abstract methods to work.
    abstract public void drive(); //Abstract method needs abstract class to work.
}

class Virtus extends Car{
    public void drive(){ //Classes which extends abstract classes need to implement/override all the abstract methods present in parent class.
        System.out.println("Driving Virtus");
    }
}

class Outer{
    public void call(){
        System.out.println("Calling Outer");
    }
    class Inner{ //To get called, It needs to be  static.
        public void call(){
            System.out.println("Calling Inner");
        }
    }
}

//Interface is a way to achieve 100% abstraction.
interface Interface{
    int one = 1; //Variables in interface are final and static by default.

    public void two(); //Every method is abstract bydefault
}

class ImplementationOfInterface implements Interface{ //To use interface we use implements instead of extends.
    // But to use an interface with another interface we use extends keyword.
    public void two(){
        System.out.println("Method in implementation.");
    }
}

interface one extends Interface{
    // But to use an interface with another interface we use extends keyword without overriding the methods.
}

enum Status{ //A special type of class used to represent a fixed set of constants.
    CHARGED, REFUNDED, CANCELED, PARTIALLY_CHARGED, PARTIALLY_REFUNDED, SUBSCRIPTION;
}

enum Actions{
    //enum constants must be declared before any fields or constructors.
    CHARGE("Charge"),
    REFUND("Refund"),
    CANCELED("Canceled");

    private String action;

    Actions(String action) { //Constructor for enums just uses its name.
        this.action = action;
    }

    public String getAction(){
        return action;
    }
}