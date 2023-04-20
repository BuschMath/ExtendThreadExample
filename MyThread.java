public class MyThread extends Thread {
    
    private int threadId;
    
    public MyThread(int threadId) {
        this.threadId = threadId;
    }
    
    @Override
    public void run() {
        // Define the code that the thread will execute
        System.out.println("Thread " + threadId + " is running.");
    }
}