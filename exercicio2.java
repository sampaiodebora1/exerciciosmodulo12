package exercicio_modulo_12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class exercicio2 {
    public static void main(String[] args) {
        Set<Integer> conjuntodeNumeros = new HashSet<>();

        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um valor não repetido");
            int valor = scanner.nextInt();
            conjuntodeNumeros.add(valor);

        }
        
        Iterator<Integer> iterator = conjuntodeNumeros.iterator();
        
        while (iterator.hasNext()) {
            int elemento = iterator.next();
            System.out.println(elemento);
        }
        

    }

}
