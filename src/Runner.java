
public class Runner {
	
	public static void main(String[] args) {
		//DO SOMETHING!!
		
		Person geoff = new Person("Geoff","Mountain Guide",26);
		Person mark = new Person("Mark","Finance Director",52);
		Person tuna = new Person("Tuna","Biomedical Engineer",22);
		Person steve = new Person("Steve","Science Technician",34);
		Person tiffany = new Person("Tiffany","CEO",34);
		
		People people = new People();
		people.addToPeople(tiffany);
		people.addToPeople(steve);
		people.addToPeople(tuna);
		people.addToPeople(mark);
		people.addToPeople(geoff);
		
		people.filesCreator();
		
		people.filesReader();

		for (Person i : people.getPeopleRead()) {
			
			System.out.println(i.toString());
			
		}
	}

}
