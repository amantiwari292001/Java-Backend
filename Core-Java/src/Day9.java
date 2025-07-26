public class Day9 {
    //Note on Interface: We can implement more than one interfaces in a class unlike inheritance.
    public static void main(String[] args) throws Exception {
        //"throw" keyword actually throws exception, "throws" is to declare the exception.
        A a = new A();
        B b = new B();//Everything called in between will run 1st.
        a.setPriority(Thread.MAX_PRIORITY);//To set the priority of a thread, we can do like this.(Any number b/w 1-10)
        //Java's thread scheduler uses these priorities as a hint to decide the order of execution,
        // but it’s not guaranteed—it depends on the JVM and OS.
        a.start(); //To make the thread work we use start() to run run().
        System.out.println("In between");
        b.start();
        try{
            Thread.sleep(5000);//We can pause the program for some time with sleep. Needs to be written under try catch.
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        Runnable c = new C(); //To run a runnable, we need to create its object,
        Thread c2 = new Thread(c); //and the pass it into an object of thread.
        c2.start();

        //In lambda function, it would be written as,
        Runnable c3 = () -> {
            for(int i = 0;i<150;i++){
                System.out.println("C3");
            }
        };
        Thread c4 = new Thread(c3);
        c4.start();

        System.out.println("Run Condition");
        Counter counter = new Counter();
        Runnable c5 = () -> {
            for(int i = 1;i<10000;i++){
                counter.count();
            }
        };
        Runnable c6 = () -> {
            for(int i = 1;i<10000;i++){
                counter.count();
            }
        };
        Thread t1 = new Thread(c5, "Thread C5"); //We can add names also to the threads. Can call it as Thread.currentThread().getName();
        Thread t2 = new Thread(c6, "Thread C6");
        t1.start();
        t2.start();
        t1.join();
        t2.join(); //it orders main thread to wait for other threads to complete. The results won't be consistent with this.
        System.out.println("Count is " + counter.count);
        System.out.println("Thread ran");


    }
}

//Threads: They allow us to do multiple things at the same time, way to achieve concurrency in programming.
class A extends Thread{ //To achieve concurrency we need to extend thread in our class.
    public void run(){ //The task we are supposed to run, the method should be named run();
        for(int i = 0;i<500;i++){
            System.out.println("A");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 500;i<1000;i++){
            System.out.println("B");
        }
    }
}

//Another way to create thread is runnable, Thread itself implements Runnable.
class C implements Runnable{ //Runnable is a Functional Interface which works when we implement it and override run() method.
    public void run(){
        for(int i = 0;i<50;i++){
            System.out.println("C");
        }
    }
}
//Always make sure to work with immutable data with threads.

//Synchronization: Allow only one method or thread to work on something.
class Counter{
    int count = 0;
    public synchronized void count(){ //Sometimes two iterations gives us the same increment, to avoid it we use synchronized keyword.
        //Now only one thread will work on it at a time.
        count++;
    }
}

//States/Life of Thread: New Thread >> Runnable >> Running(run()) >> Dead, Waiting(sleep() could be anywhere).