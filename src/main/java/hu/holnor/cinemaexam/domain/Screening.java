package hu.holnor.cinemaexam.domain;

import hu.holnor.cinemaexam.dto.outgoing.CreateScreeningCommand;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "screening")
@Data
@NoArgsConstructor
public class Screening {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "screening_id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private String movieTitle;
    @Column(nullable = false)
    private LocalDateTime screeningDateTime;
    @Column(nullable = false)
    private Integer totalSeats;
    private String imgUrl;

    public Screening(CreateScreeningCommand command) {
        this.movieTitle = command.getMovieTitle();
        this.screeningDateTime = LocalDateTime.parse(command.getScreeningDateTime());
        this.totalSeats = command.getTotalSeats();
        this.imgUrl = imgUrl;
    }
}
