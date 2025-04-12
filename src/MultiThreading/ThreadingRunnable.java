package MultiThreading;
public class ThreadingRunnable implements Runnable{
    
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Number : " + (i+1));
        }
    }
    
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadingRunnable());
        t1.start();
        System.out.println("End of main.................");
        
    }

}
