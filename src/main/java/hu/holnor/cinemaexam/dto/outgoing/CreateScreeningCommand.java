package hu.holnor.cinemaexam.dto.outgoing;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class CreateScreeningCommand {
    private String movieTitle;
    private String screeningDateTime;
    private Integer totalSeats;
    private String imgUrl;
}
