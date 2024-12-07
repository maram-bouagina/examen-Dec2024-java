package examen_2024;
import java.time.LocalDate;

	public abstract class Image extends Billet_Taggable{
		private String url;
	
		public Image(LocalDate datePub, String auteur, int capacite, String url) {
			super(datePub, auteur, capacite);
			this.url = url;
		}
		public String getUrl() {
		return url;
		}
		@Override
		public String toString() {
		return super.toString() + ", url=" + url + "]";
		}
	}
