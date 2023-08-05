package hu.holnor.cinemaexam.dto.incomming;

import hu.holnor.cinemaexam.domain.Screening;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ScreeningListOptions {
    private String movieTitle;

    public ScreeningListOptions(Screening screening) {
        this.movieTitle = screening.getMovieTitle();
    }
}
