package com.bus.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "movies_details")
public class MovieDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="movie_id")
	private long movieId;
	
	@Column(nullable = false)
	private String movieName;
	
	@Column(nullable = false)
	private String image;
	
	@Column(columnDefinition = "varchar(1000) ", nullable = false)
	private String movieDetails;
	
	@ManyToMany(mappedBy = "movies")
    private Set<Seat> seats = new HashSet<>();

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getMovieDetails() {
		return movieDetails;
	}

	public void setMovieDetails(String movieDetails) {
		this.movieDetails = movieDetails;
	}
	
	

	public Set<Seat> getSeats() {
		return seats;
	}

	public void setSeats(Set<Seat> seats) {
		this.seats = seats;
	}

	public MovieDetails(long movieId, String movieName, String image, String movieDetails) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.image = image;
		this.movieDetails = movieDetails;
	}

	public MovieDetails(String movieName, String image, String movieDetails) {
		super();
		this.movieName = movieName;
		this.image = image;
		this.movieDetails = movieDetails;
	}

	public MovieDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MovieDetails [movieId=" + movieId + ", movieName=" + movieName + ", image=" + image + ", movieDetails="
				+ movieDetails + "]";
	}
	
	
	


}
