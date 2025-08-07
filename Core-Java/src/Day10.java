import java.util.*;

public class Day10 {
    public static void main(String[] args) {
        //Collection-API: Give us different way to store and retrieve data, Everything under Collection Interface.
        Collection arrayList = new ArrayList(); //Array list is just a dynamic list which doesn't have a specific storage limit.
        // Can hold any type of values. It stores objects.
        //This list is raw, we are not defining any type, hence we won't be abel to use and get index values.
        arrayList.add("741");
        arrayList.add(741);
        System.out.println(arrayList); //Unlike array we can print collections without conversion.
        List<Integer> myList = Arrays.asList(1,2,3,4,5,6);//We can create a list like this also.

        List<Integer> arrayList1 = new ArrayList<>();//Here we have defined the type.
        //We also have linkedlist, we use it when insertion deletion is frequent.
        arrayList1.add(12);
        arrayList1.add(123);
        arrayList1.add(1234);
        System.out.println(arrayList1.get(2));

        //Collections provides different methods to us.
        System.out.println(arrayList1.indexOf(1234));
        arrayList1.set(2,852);
        System.out.println(arrayList1);
        Collections.sort(arrayList1); //To sort a collection.
        System.out.println(arrayList1.size()); //Get the length.

        Set<Integer> set = new HashSet<>(); //Set doesn't store duplicate values.
        // Can't access index values and not sorted(Only single digit values are sorted). Also, Doesn't follow insertion order.
        set.add(12);
        set.add(21);
        set.add(33);
        System.out.println("HashSet: " + set);
        //LinkedHashSet follows insertion order.

        set = new TreeSet<Integer>(); //It returns sorted values.
        set.add(12);
        set.add(21);
        set.add(33);
        System.out.println("TreeSet: " + set);

        //Iteration of collection elemets.
        Iterator<Integer> t = set.iterator(); //It iterates over the elements of set.
        while (t.hasNext()){
            System.out.println(t.next());
        }

        //Map: It is a key and value pair.
        HashMap<Integer, String>m = new HashMap<>();
        m.put(1, "One");
        m.put(2, "Two");
        m.put(3, "Three");
        m.put(4, "Four");
        System.out.println(m.get(2)); //We can use key to get the value.
        System.out.println(m.values()); //Gives all the values.
        set = m.keySet(); //We can store all the keys in a map to set(Not in list)
        System.out.println(set);
        arrayList1.addAll(set); //We can store set into a list with addAll();
        Iterator<Integer> t1 = set.iterator(); //We can use iterator to get the values of a map.
        while (t1.hasNext()){
            System.out.println(m.get(t1.next()));
        }
        //Another way to iterate over maps is entryset.
        for(Map.Entry<Integer, String> entry: m.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //map.getOrDefault(key, 0); this methods says, if it finds the keys,
        // it will return the value, if doesn't it will return the default value which is 0 here.
    }
}


//Note: In Java, the reference type dictates which methods are accessible.