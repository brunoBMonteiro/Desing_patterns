package comportamentais.iterator2;

import java.util.Iterator;

public class IteratorApplication {
    public static void main(String... args){
        String[] nomes = new String[4];
        nomes[0] = "Bruno Monteiro";
        nomes[1] = "Daniel Zancheta";
        nomes[2] = "Pedro Hubner";
        nomes[3] = "Giovane Garcia";


        ListaDeNomes listaDeNomes = new ListaDeNomes(nomes);

        Iterator<String> iterator = listaDeNomes.iterator();

        iterator.hasNext();

        iterator.remove();

        while(iterator.hasNext()){
            String nome = iterator.next();
            System.out.println(nome);
        }

        System.out.println("----------");
        System.out.println("Testando o foreach");
        for (String nome : listaDeNomes){
            System.out.println(nome);
        }
    }
}
