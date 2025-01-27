
public class Competition {
	
	String Name;
	Organizer organizer;
	int MaxParticipants;
	Athlete [] listAthlete = new Athlete [10];
	public Competition(String name, Organizer organizer, int maxParticipants, Athlete[] listAthlete) {
		super();
		Name = name;
		this.organizer = organizer;
		MaxParticipants = maxParticipants;
		this.listAthlete = listAthlete;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Organizer getOrganizer() {
		return organizer;
	}
	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
	}
	public int getMaxParticipants() {
		return MaxParticipants;
	}
	public void setMaxParticipants(int maxParticipants) {
		MaxParticipants = maxParticipants;
	}
	public Athlete[] getListAthlete() {
		return listAthlete;
	}
	public void setListAthlete(Athlete[] listAthlete) {
		this.listAthlete = listAthlete;
	}
	
	
	
}
