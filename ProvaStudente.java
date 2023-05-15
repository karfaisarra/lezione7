package lezione7;

public class ProvaStudente {

	public static void main(String[] args) {
		
		Studente student = new Studente("Sarra", "Karfai", "Informatica");

		System.out.println("Nome: " + student.getNome());
		System.out.println("Cognome: " + student.getCognome());
		System.out.println("Indirizzo: " + student.getIndirizzo());
		System.out.println("Matricola: " + student.getMatricola());
		
		student.setNome("Sarra1");
		student.setCognome("Karfai1");
		student.setIndirizzo("Informatica1");
		System.out.println("Nome: " + student.getNome());
		System.out.println("Cognome: " + student.getCognome());
		System.out.println("Indirizzo: " + student.getIndirizzo());
		System.out.println("Matricola: " + student.getMatricola());
		
		Studente student2 = new Studente("Sarra2", "Karfai2", "Informatica2");
		
		System.out.println("Nome: " + student2.getNome());
		System.out.println("Cognome: " + student2.getCognome());
		System.out.println("Indirizzo: " + student2.getIndirizzo());
		System.out.println("Matricola: " + student2.getMatricola());
	}
}
