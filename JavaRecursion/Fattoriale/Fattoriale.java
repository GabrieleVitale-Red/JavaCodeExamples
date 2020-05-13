package Fattoriale;

import java.util.Scanner;

public class Fattoriale {

	/**
	 * Qui verra calcolato il fattoriale di un numero inserito da riga di comando
	 * @param args
	 */
	public static void main(String[] args){
		int x = 0;
		do {
			x = insertValue();
			System.out.printf("Verrà calcolato: %d!\n", x);
			System.out.println("Risultato: "+fattoriale(x));
		}while(repeater());		
		System.out.println("Fine esecuzione programma.");
	}
	/**
	 * Metodo per l'inserimento del parametro da Calcolare
	 * @return Ritorna un intero che verrà poi usato per il calcolo del fattoriale
	 */
	private static int insertValue(){
		System.out.print("Inserire il valore da fattorizzare: ");
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	/**
	 * n! ==> n(n-1)(n-2)(n-3)(n-m)....(1)
	 * @param n
	 * @return Ritorna il risultato del fattoriale  
	 */
	private static int fattoriale(int n){
		int m = n-1;
		if(n == 0) {
			return 0;
		}else {
			if(n-1 == 0) {
				return n;
			}else {
				return n * fattoriale(n-1);				
			}
		}
	}
	/**
	 * Chiede di se ripetere o meno la fuzione di calcolo del fattoriale
	 * @return flag ripetizione o meno
	 */
	private static boolean repeater(){
		System.out.print("Ripetere il programma? Y/N : " );
		Scanner s = new Scanner(System.in);
		return  s.next().toLowerCase().equals("y") ? true : false;
	}
}
