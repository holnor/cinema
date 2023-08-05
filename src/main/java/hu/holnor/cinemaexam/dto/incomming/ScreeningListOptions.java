package hu.holnor.cinemaexam.dto.incomming;

import hu.holnor.cinemaexam.domain.Screening;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ScreeningListOptions {
    private Long id;
    private String movieTitle;

    public ScreeningListOptions(Screening screening) {
        this.id = screening.getId();
        this.movieTitle = screening.getMovieTitle();
    }
}
