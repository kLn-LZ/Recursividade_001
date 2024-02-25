package View;

import Controller.Somatorio;

public class Principal {

    public static void main(String[] args) {

        Somatorio sum = new Somatorio();

        int a = 2;
        int result = 0;


        result = sum.somFunc(a);

        System.out.println(result);






    }

}
