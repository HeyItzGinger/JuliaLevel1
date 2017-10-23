
public class NetflixRunner {
	public static void main(String[] args) {
		
	
	//1. Instantiate some Movie objects (at least 5).
		//2. Use the Movie class to get the ticket price of one of your movies.

		//3. Instantiate a NetflixQueue.
		//4. Add your movies to the Netflix queue.
		//5. Print all the movies in your queue.
		
		//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
		//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 


	Movie TGTLTT = new Movie("TGTLTT", 5);
	Movie IT = new Movie("IT", 3);
	Movie TLHC = new Movie("TLHC", 4);
	Movie HPCOS = new Movie("HPCOS", 2);
	Movie HTGSC = new Movie("HTGSC", 1);

	
	System.out.println(TGTLTT.getTicketPrice());
	System.out.println(IT.getTicketPrice());
	System.out.println(TLHC.getTicketPrice());
	System.out.println(HPCOS.getTicketPrice());
	System.out.println(HTGSC.getTicketPrice());
	
	NetflixQueue nq = new NetflixQueue();
	
	nq.addMovie(TGTLTT);
	nq.addMovie(IT);
	nq.addMovie(TLHC);
	nq.addMovie(HPCOS);
	nq.addMovie(HTGSC);
	
	nq.printMovies();
	
	System.out.println("The best movie is " + nq.getBestMovie() + ".");
	System.out.println("The second best movie is " + nq.getMovie(1));

}
}