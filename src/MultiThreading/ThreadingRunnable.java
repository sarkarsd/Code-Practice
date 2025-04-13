package multithreading;
import java.lang.Runnable;

public class ThreadingRunnable implements Runnable{
    
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Number : " + (i+1) + " " +Thread.currentThread().getName());
        }
    }
    
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadingRunnable());
        t1.start();
        System.out.println("...............T1 started");
        
        
        /*We cannot create an object of Runnable as it is an interface. 
         * Runnable t2 = new Runnnable(); -----WRONG
         * Though we can use lamda or anonymous classes to achieve the same.
         * --------------ANONYMOUS CLASS ----------
         * Thread t2 = new Thread(new Runnable() {
                public void run() {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Anonymous Thread : " + (i+1));
                    }
                }
            });
            t2.start();
            ------------------------
         */

         /*............BEST PRACTICE............... */
        Thread t2 = new Thread(new ThreadingRunnable());
        t2.start();
        System.out.println("...............T2 started");
        System.out.println("..............End of main.................");
        
    }

}
