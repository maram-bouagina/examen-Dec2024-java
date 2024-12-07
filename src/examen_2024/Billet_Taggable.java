package examen_2024;

import java.time.LocalDate;
import java.util.Arrays;

public  abstract class Billet_Taggable  extends Billet implements Taggable{
			protected int nbTags=0;
			protected  String [] LTags;
			protected int capacite;
	
			public Billet_Taggable (LocalDate datePub, String auteur, int capacite) {
				super(datePub, auteur);
				this.capacite = capacite;
				LTags=new String[capacite];
			}

			@Override
			public String toString() {
				return  super.toString()+", nbTags= " + nbTags + ", LTags=" + Arrays.toString(LTags) ;
			}	
}
