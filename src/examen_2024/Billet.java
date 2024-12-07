package examen_2024;
import java.time.LocalDate;
public abstract class Billet implements Publiable  {
	 		private String auteur;
	 		protected LocalDate datePub;
	 		public Billet (LocalDate datePub,String auteur) {
	 			this.datePub=datePub;
	 			this.auteur=auteur;
	 		}
	 		
	 		public String getAuteur() {
				return auteur;
			
	 		}
			public String toString() {
	 			return "datePub "+datePub+" auteur "+auteur;
	 		}
}

