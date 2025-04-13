package multithreading;
import java.lang.Thread;
class Mythread extends Thread{
    public void run(){
        System.out.println("...................Hello from thread...............");
        System.out.println("Name of thread::"+ Thread.currentThread().getName());
    }
}


public class Threading {
    public static void main(String[] args){
        Mythread obj = new Mythread();
        obj.start(); 
        System.out.println("Hello from main");

    }

}
