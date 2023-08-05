package hu.holnor.cinemaexam.controller;

import hu.holnor.cinemaexam.dto.incomming.ScreeningListOptions;
import hu.holnor.cinemaexam.service.ReservationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
    private ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("options")
    public ResponseEntity<List<ScreeningListOptions>> getScreeningListOptions(){
       return new ResponseEntity<>(reservationService.getScreeningListOptions(), HttpStatus.OK);
    }
}
