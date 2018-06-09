package primosthread;

public class main {

    //Metodo em que se encontra as chamadas das classe "ThreadPrimo" que foi definida.
    //Ao executar este projeto serão exibidos todos os resultados no console do Java.
    public static void main(String[] args) {
        
        //Bloco com a primeira Thread responsável por retornar os números primos de 1 a 20000
        ThreadPrimo threadPrimo1 = new ThreadPrimo("Thread 1", 1, 20000);
        threadPrimo1.start();
        
        //Bloco com a segunda Thread responsável por retornar os números primos de 20001 a 40000
        ThreadPrimo threadPrimo2 = new ThreadPrimo("Thread 2", 20001, 40000);
        threadPrimo2.start();
        
        //Bloco com a terceira Thread responsável por retornar os números primos de 40001 a 60000
        ThreadPrimo threadPrimo3 = new ThreadPrimo("Thread 3", 40001, 60000);
        threadPrimo3.start();
        
        //Bloco com a quarta Thread responsável por retornar os números primos de 60001 a 80000
        ThreadPrimo threadPrimo4 = new ThreadPrimo("Thread 4", 60001, 80000);
        threadPrimo4.start();
        
        //Bloco com a quinta Thread responsável por retornar os números primos de 80001 a 99999
        ThreadPrimo threadPrimo5 = new ThreadPrimo("Thread 5", 80001, 99999);
        threadPrimo5.start();
    }
    
}
