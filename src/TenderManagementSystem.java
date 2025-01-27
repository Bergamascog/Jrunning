
public class TenderManagementSystem {

	public static void main(String[] args) {
		
		
		Athlete a1 = new Athlete ("Fabio", "Zeta", "Salti", 7.9);
		Athlete a2 = new Athlete ("Carlo", "Tetti", "Salti", 7.6);
		Athlete a3 = new Athlete ("Luigi", "Rossi", "Salti", 6.4 );
		
		Athlete[] list1 = new Athlete[3];
		list1[0] =a1;
		list1[1] =a2;
		list1[2] =a3;

		Athlete a4 = new Athlete ("Mario", "Bianchi", "Corsa", 7.9);
		Athlete a5 = new Athlete ("Riccardo", "Andrei", "Corsa", 8.3);
		Athlete a6 = new Athlete ("Simone", "Lini", "Corsa", 7.1 );
		
		Athlete[] list2 = new Athlete[3];
		list2[0] =a4;
		list2[1] =a5;
		list2[2] =a6;

		Organizer o1 = new Organizer("Gino", "Forchi");
		Organizer o2 = new Organizer("Sebastiano", "Chiarini");

		Competition c1 = new Competition ("Gara Sicilia", o1, 3, list1 );
		Competition c2 = new Competition ("Gara Sardegna", o2, 3, list2 );

		System.out.println("Prima gara:");
		int cont=1;
		for (int i=0;i<list1.length;i++)
		{
			System.out.println("il partecipante numero " + cont + " nella gara " + c1.getName() + " si chiama "+  list1[i].getFirstName() +" "+ list1[i].getLastName()+ ", partecipa alla categoria " + list1[i].getCategory() + " e il suo tempo è di " + list1[i].getTime()+ " secondi.");
			cont++;
		}
		
		double TimeWinner =list1[0].getTime();
		Athlete winner=list1[0];
		
		for (int i=0;i<list1.length;i++)
		{
			if (list1[i].getTime()<TimeWinner);
			{
				TimeWinner=list1[i].getTime();
				winner= list1[i];
			}
		}
		System.out.println(" ");
		System.out.println("Il vincitore della " + c1.getName() + " è " + winner.getFirstName() + " "+ winner.getLastName()); 
		
		System.out.println("");

		System.out.println("Seconda gara:");
		
		int cont2=1;
		for (int i=0;i<list2.length;i++)
		{
			System.out.println("il partecipante numero " + cont2 + " nella gara " + c2.getName() + " si chiama "+  list2[i].getFirstName() +" "+ list2[i].getLastName()+ ", partecipa alla categoria " + list2[i].getCategory() + " e il suo tempo è di " + list2[i].getTime()+ " secondi.");
			cont2++;
		}
		
		double TimeWinner2 =list2[0].getTime();
		Athlete winner2=list2[0];
		
		for (int i=0;i<list2.length;i++)
		{
			if (list2[i].getTime()<TimeWinner2);
			{
				TimeWinner2=list2[i].getTime();
				winner2= list2[i];
			}
		}
		System.out.println(" ");
		System.out.println("Il vincitore della " + c2.getName() + " è " + winner2.getFirstName() + " "+ winner2.getLastName()); 		
}
}

