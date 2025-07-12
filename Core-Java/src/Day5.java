public class Day5 {
    public static void main(String[] args) { //Access Modifier, keyword, return type, name.
        // We can't create another method with same parameters even with different names.
        //Inheritance: Using properties and behaviour of parent class, It could be multi level, but not multiple.
        advCalc c = new advCalc(10,20);
        c.add();
        advCalc c2 = new advCalc(); //This alone calling three line, with super and this.
        calc c3 = new advCalc(); //I can keep the reference of parent class and call object of child class. Runtime polymorphism.

        System.out.println(c2.equals(c2)); //We can even compare objects/checks content. If equal, Hashcode will also be the same.
    }
}

class calc{ //Every class extends Object class.
    int a;
    int b;
    final int c = 9521; //With final variable, we can't change it, with methods we can't overload/overridden them, with class we can't inherit them.
    public calc(){
        System.out.println("Calc....");
    }
    public calc(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ran calc, " + a + " " + b);
    }
    public void add(){
        System.out.println(a+b);
    }
}

class advCalc extends calc{ //With extend, I am using everything calc has.
    public advCalc(){
        this(10,120); //To call the constructor of same class we use this(), call both super and this won't work.
        System.out.println("advCalc......");
    }
    public advCalc(int a, int b){
        super(a, b); //super is a method to call the constructor of the parent. It runs first.
        System.out.println("Ran adv-calc");
    }
    public void multiply(int a, int b){
        System.out.println(a*b);
    }
    public void add(){ //Method with same name in different classes called overriding, But both methods can't have different return type.
        //First code will look into this class for add, then go to parent.
    }
}

//Packages: Group of files.
//Access Modifiers: public(Outside the package), private(Inside a class), protected(Subclasses can use), default(Inside a package)
//Polymorphism: Overriding and Overloading are examples of polymorphism. Types: Runtime(Overriding), Compile time(Overloading).