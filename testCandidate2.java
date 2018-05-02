import java.util.ArrayList;
public class testCandidate2{

	static ArrayList<candidate> c = new ArrayList<candidate>();

	public static void main(String args[]){
		c.add( new candidate("Michael Duffy", 6000) );
		c.add( new candidate("Tim Robinson", 2500) );
		c.add( new candidate("Joe Ashtony", 1800) );
		c.add( new candidate("John Smith", 5000) );
		c.add( new candidate("Mary Miller", 4000) );

		printVotes();
		System.out.printf("There is A total of %d Votes%n",getTotal());
		printResults();
	}

	public static void printVotes(){
		for(candidate i : c){
			System.out.println(i);
		}
	}
	public static int getTotal(){
		int tot = 0;
		for(candidate i : c){
			tot += i.getVotes();
		}	
		return tot;
	}	
	public static void printResults(){
		int tot = getTotal();
		for(candidate i : c){
			System.out.printf("%-15s%15s%15.1f%%%n",i.getName(),i.getVotes(),(float)i.getVotes()/tot*100);
		}
	}
}
