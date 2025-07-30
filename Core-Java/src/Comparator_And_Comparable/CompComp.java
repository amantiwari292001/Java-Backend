package Comparator_And_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompComp {
    public static void main(String[] args) {
        Students s1 = new Students("A", 10);
        Students s2 = new Students("Z", 5);
        Students s3 = new Students("U", 64);
        ArrayList<Students> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list); //Can use list.sort()
        System.out.println(list);

        Comparator<Students> comp = (o1, o2) -> {return o2.roll-o1.roll;};
        //Comparator is another thing same as comparable, but gives us differnt logics to sort a list. It can be written in lambda function.
        //Or has a method compare(Obj 1, Obj 2), It compares two objects.
        Collections.sort(list, comp); //It requires the instance of comparator to sort.
        System.out.println(list);

        Comparator<Students> sortByName = (o1, o2) ->{return o1.name.compareTo(o2.name);};
        Collections.sort(list, sortByName);
        System.out.println(list);

    }
}

class Students implements Comparable<Students>{
    //Comparable is an interface which gives a compareTo methods, Here sorting can be done with single logic. It works only with class.
    String name;
    int roll;
    public Students(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    public int compareTo(Students s){
        return this.roll - s.roll;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }
}

