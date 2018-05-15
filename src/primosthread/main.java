package primosthread;

public class main {

    public static void main(String[] args) {
        ThreadPrimo threadPrimo1 = new ThreadPrimo("Thread 1", 1, 20000);
        threadPrimo1.start();
        
        ThreadPrimo threadPrimo2 = new ThreadPrimo("Thread 2", 20000, 40000);
        threadPrimo2.start();
        
        ThreadPrimo threadPrimo3 = new ThreadPrimo("Thread 3", 40000, 60000);
        threadPrimo3.start();
        
        ThreadPrimo threadPrimo4 = new ThreadPrimo("Thread 4", 60000, 80000);
        threadPrimo4.start();
        
        ThreadPrimo threadPrimo5 = new ThreadPrimo("Thread 5", 80000, 99999);
        threadPrimo5.start();
    }
    
}
