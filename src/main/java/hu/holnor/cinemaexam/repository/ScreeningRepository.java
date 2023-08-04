package hu.holnor.cinemaexam.repository;

import hu.holnor.cinemaexam.domain.Screening;
import hu.holnor.cinemaexam.dto.incomming.ScreeningListItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScreeningRepository extends JpaRepository<Screening, Long> {
    List<Screening> findAllByOrderByScreeningDateTimeDesc();
}
