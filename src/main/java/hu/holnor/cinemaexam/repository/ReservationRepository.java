package hu.holnor.cinemaexam.repository;

import hu.holnor.cinemaexam.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
