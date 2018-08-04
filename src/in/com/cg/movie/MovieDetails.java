package in.com.cg.movie;


public class MovieDetails 
{
	private String MovieName;//instance member
	private String LeadActor;
	private String LeadActress;
	private String Genre;
	
	
	
	public MovieDetails(String movieName, String leadActor, String leadActress, String genre)//Constructor 
	{
		super();
		MovieName = movieName;
		LeadActor = leadActor;
		LeadActress = leadActress;
		Genre = genre;
	}
	
	public String getMovieName()//getter 
	{
		return MovieName;
	}
	public void setMovieName(String movieName)//setter
	{
		MovieName = movieName;
	}
	public String getLeadActor()//getter 
	{
		return LeadActor;
	}
	public void setLeadActor(String leadActor)//setter 
	{
		LeadActor = leadActor;
	}
	public String getLeadActress()//getter 
	{
		return LeadActress;
	}
	public void setLeadActress(String leadActress)//setter
	{
		LeadActress = leadActress;
	}
	public String getGenre()//getter 
	{
		return Genre;
	}
	public void setGenre(String genre)//setter
	{
		Genre = genre;
	}
	
	public String toString()//function to display
	{
		return "MovieDetails :"+"\n" +"MovieName= "+getMovieName()+ "\n"+ "LeadActor= "+ getLeadActor() + "\n" + "LeadActress= "+ getLeadActress() + "\n" + "Genre= "+ getGenre() +"\n-------------------------------------";
	}
	
	
}
