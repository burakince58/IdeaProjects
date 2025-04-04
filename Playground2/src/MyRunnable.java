public class MyRunnable implements Runnable{

    public void hello(String str) {
        System.out.println(str);
    }
    @Override
    public void run() {
        hello("I'm running ...");
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        System.out.println("Thread has been started ...");
    }

}
