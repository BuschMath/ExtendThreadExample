public class Main {
    public static void main(String[] args) {
        // Create a new instance of the MyThread class
        MyThread thread1 = new MyThread(1);
        
        // Start the thread
        thread1.start();
        
        // Create another instance of the MyThread class
        MyThread thread2 = new MyThread(2);
        
        // Start the second thread
        thread2.start();
    }
}
