public class testCandidate{

	static candidate c[] = {
		new candidate("Michael Duffy", 6000),
		new candidate("Tim Robinson", 2500),
		new candidate("Joe Ashtony", 1800),
		new candidate("John Smith", 5000),
		new candidate("Mary Miller", 4000)
	};
	public static void main(String args[]){
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
