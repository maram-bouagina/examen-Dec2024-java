package examen_2024;
import java.time.LocalDate;
public  abstract class Message extends Billet {
			private  String cmessage;

			public Message(LocalDate datePub,String auteur,String cmessage) {
				super(datePub, auteur);
				this.cmessage = cmessage;
			}

			public String getCmessage() {
				return cmessage;
			}

			
						
}
