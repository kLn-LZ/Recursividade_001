package Controller;

public class Somatorio {

    public Somatorio() {
        super();

    }


    public int somFunc (int n) {

        //Condição de parada: ser um número negativo (ou seja, menor do que zero)
        if (n < 0) {

            return 0;

        }

        // Chamada dos passos: Váriavel "n" somando com o retorno da função com o parâmetro - 1 (cujo "n", vai ser o
        // return da última função chamada na iteração
        return n + somFunc(n - 1);

    }



}
