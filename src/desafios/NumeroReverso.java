package desafios;

import java.util.Scanner;

public class NumeroReverso {

    public static void numeroReverso(){ //método numero reverso
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Informe um valor inteiro e positivo que contenha 4 dígitos: ");
            int numeroInformado = scan.nextInt();
            String numeroInformadoString = String.valueOf(numeroInformado); //transformando int em string
            if(numeroInformado>=1000 && numeroInformado<=9999){
                StringBuilder stringBuilder = new StringBuilder(numeroInformadoString);
                System.out.println(stringBuilder.reverse());
                break;
            }else if(numeroInformadoString.length()<4) { //verifica se o nº informa é menor q 4 dígitos
                System.out.println("O número informado deverá conter 4 dígitos!");
            }
        }while(true);
    }
}
