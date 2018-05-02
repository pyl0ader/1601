public class candidate{
	private String name;
	private int numVotes;
	
	public candidate(String name, int n){
		this.name = name;
		numVotes = n;
	}

	public String toString(){
		return String.format("%s:\t%d Votes",name,numVotes);
	}

	public String getName(){
		return name;
	}
	public int getVotes(){
		return numVotes;
	}
}
