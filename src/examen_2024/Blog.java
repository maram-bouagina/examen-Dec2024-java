package examen_2024;
import java.time.LocalDate;
public class Blog {
		private String titre;
		private Publiable[] LBillets;
		private int nbBillets;
		private int capacite;
		   
	    public Blog(String titre, int capacite) {
	        this.titre = titre;
	        this.capacite = capacite;
	        this.LBillets =new Publiable[capacite]; 
	    }
	    public void post(Publiable billet) throws InvalidURLException {
	    	if(billet instanceof Video) {
	    		Video v=(Video)billet;
	    		if (v.getUrl().startsWith("HTTPS")==false) {
	    			throw new InvalidURLException("l'url de la video doit utiliser le protocole HTTPS");
	    		
	    		}
	    	}
	    	
	    	
	    }
	    public int getNombreBilletsTaggables() {
	    	int n=0;
	    	for(int i=0;i<nbBillets;i++) {
	    		if(LBillets[i] instanceof  Billet_Taggable) {
	    			n++;
	    						
	    		}
	    	}
	    	return n;
	    }
	 
	    public Publiable[] RechercheBilletsTaggablesParAuteur(String auteur) {
	    	Publiable[] pub=new Publiable[getNombreBilletsTaggables()];
	    	int j=0;
	    	for(int i=0;i<getNombreBilletsTaggables();i++) {
	    		if(LBillets[i] instanceof  Billet_Taggable && LBillets[i].getAuteur().equals(auteur)) {
	    			pub[j]=LBillets[i] ;
	    			j++;
	    		}
	    	}
	    	return pub;
	    }
	    public Publiable getPlusRécentBillet() {
	    	Publiable[] pub=new Publiable[getNombreBilletsTaggables()];
	    	int j=0;
	    	while(j<getNombreBilletsTaggables() &&!(LBillets[j] instanceof  Billet)) {
	    		j++;
	    	}
	    	Billet b=(Billet) LBillets[j];
	    	for(int i=0;i<getNombreBilletsTaggables();i++) {
	    		if(LBillets[i] instanceof  Billet  ) {
	    			Billet btest=(Billet) LBillets[i];
	    			 if(btest.datePub.isAfter(b.datePub)) {
		    			 b=btest;
		    		}
	    		}
	    		}
	    	return b;
	    	}
		
	    public Publiable[] RechercheBilletsParContenu(String[] mots,int taille) {
	    	Publiable[] pub=new Publiable[getNombreBilletsTaggables()];
	    	int k=0;
	    	for(int i=0;i<getNombreBilletsTaggables();i++) {
	    		if(LBillets[i] instanceof  Message ) {
	    			Message mess=(Message)LBillets[i];
	    			for(int j=0;j<taille;j++) {
	    						if((mots[j].indexOf (mess.getCmessage())!=-1)) {
	    								pub[k]=mess;k++;	
	    						}
	    			}
	    		}
	    	}
	    	  return pub;
	    }  
	    
}
