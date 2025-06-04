import com.google.gson.Gson;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        boolean loop = true;
        while (loop) {
            System.out.println("#####################################################################");
            System.out.println("Seja bem-vindo/a ao Conversor de Moedas   =]");
            System.out.println("");
            System.out.println("");
            System.out.println("1) Real =>> Dolar ");
            System.out.println("2) Real =>> Euro ");
            System.out.println("3) Real =>> Iene Japonês ");
            System.out.println("4) Iene Japonês =>> Euro");
            System.out.println("5) Euro =>> Real ");
            System.out.println("6) Libra Egípcia =>> Real ");
            System.out.println("7) Sair");
            System.out.println("Escolha uma opçao válida: ");
            System.out.println("");
            System.out.println("#####################################################################");
            Scanner entrada = new Scanner(System.in);
            int teste = entrada.nextInt();
            entrada.nextLine();
            switch (teste) {
                case  1: RequestApiMoedas.converterMoeda("BRL","USD");
                    break;
                case  2: RequestApiMoedas.converterMoeda("BRL","EUR");
                    break;
                case  3: RequestApiMoedas.converterMoeda("BRL","JPY");
                    break;
                case  4: RequestApiMoedas.converterMoeda("JPY","EUR");
                    break;
                case  5: RequestApiMoedas.converterMoeda("EUR","BRL");
                    break;
                case  6: RequestApiMoedas.converterMoeda("EGP","BRL");
                    break;
                case  7: loop = false;


            }
        }
        System.out.println("Você saiu do programa!");
    }
}



