package in.com.cg.movie;
import java.util.*;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
//class movie details which contains methods
public class MovieDetailsList 
{
	Set<MovieDetails> movie= new LinkedHashSet<>();//collection declaration
	
	public void addMovie(MovieDetails movieName)//add movie function
	{
		movie.add(movieName);//add movie to collection
		System.out.println(movieName.getMovieName() +" Added");//display movie added
	}
	
	public void removeMovie(String movieName)//function to remove movie
	{
		Predicate<MovieDetails> delmovie = MovieDetails -> MovieDetails.getMovieName().equals(movieName);//search for movie that must be deleted
		movie.removeIf(delmovie);//remove that file
	}
	public void removeAll()//function to remove all movie
	{
		movie.clear();//clear all the movie in the collections
		System.out.println("All movies are deleted.");//display all the movies are deleted
	}
	
	public boolean findByName(String movieName)//function to search movie by name
	{
		Predicate<MovieDetails> checkMovieByName= MovieDetails -> (MovieDetails.getMovieName().equals(movieName));//search for entered movie
		return movie.stream().anyMatch(checkMovieByName);//return movie if found
	}
	
	public boolean findByGenre(String genre)//function to search movie by genre
	{
		Predicate<MovieDetails> checkMovieByGenre= MovieDetails -> (MovieDetails.getMovieName().equals(genre));//search movie by genre
		return movie.stream().anyMatch(checkMovieByGenre);//return movie if found
	}
	public void display()//function to display
	{
		Consumer<MovieDetails> disp = MovieDetails -> System.out.println(MovieDetails);
		movie.stream().forEach(disp);//display all elements of collection
	}	

}
