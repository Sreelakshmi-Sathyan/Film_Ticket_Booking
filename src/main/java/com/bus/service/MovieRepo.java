package com.bus.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bus.beans.MovieDetails;
import com.bus.beans.Seat;

@Repository
public interface MovieRepo extends JpaRepository<MovieDetails, Long> {

	@Query(value = "select * from movies_details where movie_name=?", nativeQuery = true)
	public MovieDetails getMovieByName(String name);
}
