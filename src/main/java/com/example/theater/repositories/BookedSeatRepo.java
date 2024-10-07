package com.example.theater.repositories;

import com.example.theater.models.BookedSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface BookedSeatRepo extends JpaRepository<BookedSeat, Long> {

    @Query(value = "select seat_no from booked_seat " +
            "where movie_title = ? and time = ? and date = ?", nativeQuery = true)
    public List<Integer> findAllSeatNoBy(String movieTitle, String time, String date);
}
