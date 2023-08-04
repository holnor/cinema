package hu.holnor.cinemaexam.repository;

import hu.holnor.cinemaexam.domain.Screening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScreeningRepository extends JpaRepository<Screening, Long> {

}
