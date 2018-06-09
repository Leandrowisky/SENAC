package primosthread;

//Classe de definição do objeto ThreadPrimo, responsável por realizar o calculo de números primos a partir do metodo "run"
public class ThreadPrimo extends Thread {
   private String nome;
   private int numIni;
   private int numFim;

    public ThreadPrimo(String nome, int numIni, int numFim) {
        this.nome = nome;
        this.numIni = numIni;
        this.numFim = numFim;
        //start();
    }
   
    //metodo sobescrito da classe Thread para realizar o calculo dos números primos.
    @Override
    public void run(){
        int exato = 0;
        int numAtual = numIni;
        while (numAtual < numFim) {            
            for (int i = 1; i < numAtual; i++) {
                if (numAtual % i == 0 && numAtual != 1){
                    exato += 1;
                }
            }
            if (!(exato > 1)) {
                System.out.println("(" + nome + ")" + " Numero Primo: " + numAtual);
            }
            exato = 0;
            numAtual++;
        }
    }
}
