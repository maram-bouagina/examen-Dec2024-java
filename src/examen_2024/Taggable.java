package examen_2024;

public interface Taggable {
		void ajoutTag(String tag);
		void supprimeTag(String tag); 
		int nombreTags();
		int rechercheTag(String tag);
}
