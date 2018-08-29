import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;

public class People {
	
	private ArrayList<Person> peopleRead = new ArrayList<Person>();
	private ArrayList<Person> people = new ArrayList<Person>();
	
	public void addToPeople(Person person) {
		
		people.add(person);
	
	}
	
	public ArrayList<Person> getPeopleRead() {
		return peopleRead;
	}

	public void filesCreator() {
		for (Person i : people) {
			BufferedWriter bw = null;
			try {
				File file = new File("C:/Users/Admin/Documents/COOPER/FileCreations/" + i.getName() + ".txt");
				
				file.createNewFile();
				
				FileWriter fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				
				bw.write(i.toString());
				
			} catch (IOException ioe) {
				ioe.toString();
			}
			finally
			{
				try {
					if(bw!=null)
						bw.close();
				} catch (Exception ex) {
					System.out.println("Error closing buffer" + ex);
				}
			}
			
		}
	}
	
	public void filesReader() {
		BufferedReader reader = null;
		for (Person i : people) {
			try {
				File file = new File("C:/Users/Admin/Documents/COOPER/FileCreations/" + i.getName() + ".txt");
				reader = new BufferedReader(new FileReader(file));
				String line = reader.readLine();
				String[] str = line.split(",",3);
				String a = str[0];
				String b = str[1];
				int c = Integer.parseInt(str[2]);
				peopleRead.add(new Person(a,b,c));
			} catch (IOException ioe) {
				ioe.toString();
			} finally {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
