package hu.holnor.cinemaexam.dto.incomming;

import hu.holnor.cinemaexam.domain.Screening;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ScreeningListItem {
    private String movieTitle;
    private String screeningDateTime;
    private Integer totalSeats;
    private Integer freeSeats;

    private String imgUrl;

    public ScreeningListItem(Screening screening) {
        this.movieTitle = screening.getMovieTitle();
        this.screeningDateTime = screening.getScreeningDateTime().toString();
        this.totalSeats = screening.getTotalSeats();
        this.freeSeats = screening.getTotalSeats();
        this.imgUrl = screening.getImgUrl();
    }
}
