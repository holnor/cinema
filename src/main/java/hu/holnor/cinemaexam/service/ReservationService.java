package hu.holnor.cinemaexam.service;

import hu.holnor.cinemaexam.domain.Screening;
import hu.holnor.cinemaexam.dto.incomming.ScreeningListOptions;
import hu.holnor.cinemaexam.repository.ReservationRepository;
import hu.holnor.cinemaexam.repository.ScreeningRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ReservationService {
    private ReservationRepository reservationRepository;
    private ScreeningRepository screeningRepository;

    public ReservationService(ReservationRepository reservationRepository, ScreeningRepository screeningRepository) {
        this.reservationRepository = reservationRepository;
        this.screeningRepository = screeningRepository;
    }

    public List<ScreeningListOptions> getScreeningListOptions() {
        List<Screening> screenings = screeningRepository.findAll();
        return screenings.stream()
                .map(ScreeningListOptions::new).toList();
    }
}
