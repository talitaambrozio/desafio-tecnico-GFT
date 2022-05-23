package desafios;

import java.util.ArrayList;
import java.util.List;

public class Macaco {
    //atributos:
    private String nome;
    private List<String> bucho = new ArrayList<>(); //iniciar a list vazia - bucho vazio

    //métodos:
    public void comer(String comida){
        if(bucho.size() == 3){
            System.out.println(("Bucho cheio!"));
        }else{
            bucho.add(comida);
        }
        System.out.println(bucho);

    }
    public void digerir() {
        if (bucho.isEmpty()) { //se o bucho estiver vazio:
            System.out.println(("Bucho vazio!"));
        } else {
            bucho.remove(bucho.get(0)); //retorna a 1ª comida e a remove
        }
        System.out.println(bucho);
    }
}
