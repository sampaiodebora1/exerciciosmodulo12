package exercicio_modulo_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
    	
    	ArrayList<String> listaDeCores = new ArrayList<>();

    	Scanner leia = new Scanner(System.in);
    	
    	for(int i = 0; i <5; i++) {
    		System.out.print("Digite a cor");
			String cor = leia.nextLine();
			listaDeCores.add(cor);
        }
    		
    	 Collections.sort(listaDeCores);
    	 System.out.println("Lista de Nomes: " + listaDeCores);
    
    }	

}
