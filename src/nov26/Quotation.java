package nov26;

public class Quotation {
	/*Questa classe la creo per avere un testo utilizzabile in maniera "public"
	cioè altre classi potranno accedere alla variabile quote, in modo che sia
	indipendente dalla classe test e possa essere usata da più programmi */
	
	public String quote = "-descrizione mancante-"; // variabile globale
	
	//metodo
	public void display() {
		System.out.println(""+ quote);
	}
}
