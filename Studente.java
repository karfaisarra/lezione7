package lezione7;

public class Studente {
	
	private String nome;
	private String cognome;
	private String indirizzo;
	private int matricola;
	private static int contatoreMatricola=0;
	
	private int generaMatricola() {
        contatoreMatricola++;
        return 50130 + contatoreMatricola;
	}
	
	
	public Studente(String nome, String cognome, String indirizzo) {
		this.nome=nome;
		this.cognome=cognome;
		this.indirizzo=indirizzo;
		this.matricola=generaMatricola();
	}
	
	public String getNome() {
		return this.nome;
	}
	public String getCognome() {
		return this.cognome;
	}
	public String getIndirizzo() {
		return this.indirizzo;
	}
	public int getMatricola() {
		return this.matricola;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	public void setCognome(String cognome) {
		this.cognome=cognome;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo=indirizzo;
	}
}
