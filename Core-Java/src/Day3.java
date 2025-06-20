import java.util.Arrays;

public class Day3 {
    public static void main(String[] args) {
        //Array: Way to store same type of data together. It allows us to store a defined number of elemen ts.
        //Data-type[] name = new data-type[size];
        int[] arr = new int[2]; //Java is 0 indexing language.
        int[] arr2 = {1,2,3,4,5,6};
        arr[0] = 1; //We are putting 1 as the 1st value of array.
        arr[1] = 2;
        System.out.println(Arrays.toString(arr)); //This toString() method from Arrays class helps to print the array.

        for(int i = 0;i<arr.length;i++){
            System.out.println("Element: " + arr[0]);//Using loop to print array.
        }

        //Multidimensional Array: An Array of Arrays in the form of a matrix.
        //Data-type[][] name = new data-type[size of array][size of elements]; or [rows][columns];
        int[][] twoD = new int[2][3]; //This array will have two rows, and 3 columns.
        int[][] twoD1 = {//An array with two arrays as elements.
                {1,2,3},
                {4,5,6}
        };
        twoD[0][0] = 1; //Storing 0 in the first row and first column.
        System.out.println(Arrays.deepToString(twoD)); //To print 2D array we use deepToString() from Arrays class.
        for(int row = 0;row<twoD1.length;row++){ //Prinitng 2D array with loop.
            for(int col = 0;col<twoD1[row].length;col++){ //twoD1[row].length, this will help us in the case,
                                                          // when any row has different number of elements than the rest.
                System.out.println(twoD1[row][col]);
            }
        }

        //Array which holds class references.
        //Class_Name[] array-name = new Class_Name[];
        Student[] sArr = new Student[3]; //Array of Student
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        sArr[0] = s1;
        sArr[1] = s2;
        sArr[2] = s3;

        //Enhanced for loop: To iterate over array.
        //for(data-type-of-elements name: array-name){process data}
        for(int number: arr){//Assigning arr elements to number variable.
            System.out.println(number);
        }

        //String: bunch of characters.
        String str = "10";
        String str2 = new String("(●'◡'●)");
        System.out.println(str2.concat(" (┬┬﹏┬┬)"));//Concat to add another string.
        //Strings are immutable, they are objects. str2 has an address stored in stack,
        //which points out to the value with same address under under string pool under heap memory.
        //when i assign something else to str2, java checks the pool, if present, chnages the address of str2, if not then creates one.
        //If the word doesn't point by any variable, it gets removed by garbage collector.

        //To convert string into an array use .toCharArray();
        char[] strArray = str.toCharArray();
        System.out.println(Arrays.toString(strArray));

        //StringBuffer and StringBuilder mutates String.
        StringBuffer sb = new StringBuffer("Lenovo");//Gives a buffer of 16bytes, thus the capacity is 22.
        System.out.println(sb.capacity());
        sb.append(" Legion");
        System.out.println("StringBuffer: " + sb);
        System.out.println(new StringBuffer(str2).append(" Nothing"));//we can convert it to string using toString();
        //StringBbuilder is thread safe but StringBuffer is not.

    }
}

class Student{
    String name;
    int age;
    public void details(){
        System.out.printf("Name: %s, Age: %d",name,age);
        //f stands for format, in the place of variables we use %s for string, %d for int and %.NUMBERf for float.
    }
}
