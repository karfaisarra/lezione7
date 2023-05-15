package lezione7;

import java.util.Scanner;

public class SpezzaMeta {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Inserisci una stringa: ");
		String stringa=scanner.nextLine();
		int lunghezza = stringa.length();
		
		int meta = lunghezza/2;
		if(lunghezza%2==0) {
			System.out.println(stringa.substring(0, meta));
			System.out.println(stringa.substring(meta));
		}else {
			System.out.println(stringa.substring(0, meta + 1));
            System.out.println(stringa.substring(meta + 1));
		}
		scanner.close();
	}
}
