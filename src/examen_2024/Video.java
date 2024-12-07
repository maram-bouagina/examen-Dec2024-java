package examen_2024;
import java.time.LocalDate;
public abstract class Video extends Billet_Taggable{
	private String url;
	public Video(LocalDate datePub, String auteur, int capacité, String url) {
	super(datePub, auteur, capacité);
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