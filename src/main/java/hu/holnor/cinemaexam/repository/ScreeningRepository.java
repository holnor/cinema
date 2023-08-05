package hu.holnor.cinemaexam.repository;

import hu.holnor.cinemaexam.domain.Screening;
import hu.holnor.cinemaexam.dto.incomming.ScreeningListItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ScreeningRepository extends JpaRepository<Screening, Long> {
    List<Screening> findAllByOrderByScreeningDateTimeDesc();

    @Query("SELECT sum(r.seatsReserved) from Reservation r WHERE r.screening.id = :id")
    Optional<Integer> countReservedSeats(@Param("id") Long screeningId);
}
