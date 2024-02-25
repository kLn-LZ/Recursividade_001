package Controller;

public class Somatorio {

    public Somatorio() {
        super();

    }


  public int somFunc (int n) {

        if (n < 0) {

            return 0;

        }

        return n + somFunc(n - 1);

    }


}
