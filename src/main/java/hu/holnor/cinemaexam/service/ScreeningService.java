package hu.holnor.cinemaexam.service;

import hu.holnor.cinemaexam.domain.Screening;
import hu.holnor.cinemaexam.dto.outgoing.CreateScreeningCommand;
import hu.holnor.cinemaexam.repository.ScreeningRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ScreeningService {
    private ScreeningRepository screeningRepository;

    public ScreeningService(ScreeningRepository screeningRepository) {
        this.screeningRepository = screeningRepository;
    }

    public void createScreening(CreateScreeningCommand command) throws NullPointerException {
        Screening screening = new Screening(command);
        if (
                screening.getMovieTitle() == null
                || screening.getScreeningDateTime() == null
                || screening.getTotalSeats() == null
        ) {
            System.out.println(screening);
            throw new NullPointerException("A required field is null");
        } else {
            screeningRepository.save(screening);
        }
    }
}
