class Mythread extends Thread{
    public void run(){
        System.out.println("Hello from thread");
    }
}


public class Threading {
    public static void main(String[] args){
        Mythread obj = new Mythread();
        obj.start(); 
        System.out.println("Hello from main");

    }

}
