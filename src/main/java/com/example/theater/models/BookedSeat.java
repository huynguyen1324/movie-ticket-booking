package com.example.theater.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class BookedSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String movieTitle;

    @Column(nullable = false)
    private String time;

    @Column(nullable = false)
    private String date;

    @Column(nullable = false)
    private int seatNo;

    public BookedSeat(String movieTitle, String time, String date, int seatNo) {
        this.movieTitle = movieTitle;
        this.time = time;
        this.date = date;
        this.seatNo = seatNo;
    }
}
