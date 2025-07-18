public class Day6 {
    public static void main(String[] args) {
        Integer i = 10; //Auto-Boxing, Storing primitive to Object.
        int j = i; //Un-Boxing, Storing Wrapper class object into primitive.
        String num = "10";
        j = Integer.parseInt(num); //Useful for parsing, formatting, and converting between data types.
        Integer k = null; //Can store null, unlike primitive.
        String num2String = i.toString(); //Converting number to string.
        System.out.println(j);

        double l = 159.369d;
        int m = (int) l; //Downcasting/casting, putting big datatype into smaller type. Opposite is by-default.

    }
}

//You can't cast a superclass object to a subclass, unless the object was originally created as an instance of the subclass.