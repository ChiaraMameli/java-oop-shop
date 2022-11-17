package generation.italy.shop;

import java.util.Random;

public class Prodotto {
//	codice - int
//	nome - String
//	descrizione - String
//	prezzo - int
//	iva - int
	
	int codice;
	int prezzo;
	int iva;
	String nome;
	String descrizione;
	
	public Prodotto(int prezzo, String nome, String descrizione) {
		this.codice = setCodice();
		this.prezzo = prezzo;
		this.iva = 20;
		this.nome = nome;
		this.descrizione = descrizione;
	}
	
	
	public int setCodice() {
		Random rnd = new Random(10000);
		int rndCodice = rnd.nextInt((100000) - 10000);
		
		return rndCodice;
	}
	
	public int setPrezzo() {
		return prezzo;
	}
	
	public int setTotalPrezzo() {
		
		int totalPrezzo = prezzo + ((prezzo * iva) / 100);
		
		return totalPrezzo;
	}
	
	
	@Override
		public String toString() {
			String ret = "Questo prodotto ha codice " + codice + 
					", prezzo " + setTotalPrezzo() 
					+ "€ e iva al " + iva + "%."
							+ " E' una " + nome + " " + descrizione + ".";
			return ret;
		}
	
}
