public class Day4 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile(); //After new, it is constructor, which instanciate an object.
        m1.model = "S20 FE";
        m1.price = 41000;
        m1.mobileDetails();
        Mobile.brand = "Apple";
        m1.mobileDetails();

        Encapsulation e1 = new Encapsulation();
        e1.setName("My Name");
        String name1 = e1.getName();
        System.out.println(name1);

        Encapsulation e2 = new Encapsulation("A Name");
        String name2 = e2.getName();
        System.out.println(name2);

        String name3 = new Encapsulation("Anonymous Object").getName();//This object doesn't have any reference variable,
        System.out.println(name3);
        new Encapsulation(); //We can't use anonymous object second time.
    }
}

class Mobile{
    static String brand; //Static keyword makes a property or a behaviour commonly shared by all the objects.
    //We call static things with class name, e.g. Mobile.brand.
    String model;
    int price;

    static {
        brand = "Samsung"; //We use static block to initialize a static variable.
        // This block will be called once in an execution that too first when class loads.
    }

    public void mobileDetails(){
        System.out.printf("Brand: %s, Model: %s, Price: %d\n", brand, model, price);
    }

    public static void mobileCalled(){
//        System.out.println(this.price); We can use static variable inside non-static methods but not vice versa.
        System.out.println("Static Mobile Method.");
    }
}

class Encapsulation{ // Encapsulation is the concept of restricting direct access to some components of an object,
    private String name; //private keyword make the varibale not accessable outside this class.

    public Encapsulation(){//Constructor without parameter, default.
        System.out.println("No-Parameter or default parameter.");
    }

    public Encapsulation(String name){ //We create parameters using class name
        this.name = name;
    }

    public void setName(String name){
        this.name = name; //this keyword helps to point out the instance variable.
    }

    String getName(){
        return this.name;
    }
}

//Use camelCasing for java.
//class and interface should start from capital letter, others with small letter.
//constants should be uppercase, e.g. PIE.