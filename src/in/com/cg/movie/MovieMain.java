package in.com.cg.movie;
//main function which contains objects

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class MovieMain {

	public static void main(String[] args) 
	{
		MovieDetailsList movie=new MovieDetailsList();//object declaration
				
		movie.addMovie(new MovieDetails("DDLJ","SRK","Kajol","Romantic"));//object initialization
		movie.addMovie(new MovieDetails("Krish3","Hritik","Kangna","Action"));
		movie.addMovie(new MovieDetails("Thala","Ajith","Nayan","Action"));
		movie.addMovie(new MovieDetails("Shhh","Uppi","Ramya","Horror"));
				
		//movie.display();
		
		boolean checkByName = movie.findByName("Thala");//check for movie name
		if(checkByName)
		{
			System.out.println("Movie found");
		}
		else
		{
			System.out.println("Movie not found");
		}
		boolean checkByGenre = movie.findByGenre("Action");//check for genre
		if(checkByGenre)
		{
			System.out.println("Movie found");
		}
		else
		{
			System.out.println("Movie not found");
		}
		
		//movie.removeMovie("Shhh");//remove particular movie
		//movie.removeAll();//remove all
		movie.display();//Display all the movie
		

	}

}
