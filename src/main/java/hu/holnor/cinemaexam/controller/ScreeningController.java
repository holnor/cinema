package hu.holnor.cinemaexam.controller;

import hu.holnor.cinemaexam.dto.outgoing.CreateScreeningCommand;
import hu.holnor.cinemaexam.service.ScreeningService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.HttpAccessor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/screenings")
public class ScreeningController {
    private ScreeningService screeningService;

    public ScreeningController(ScreeningService screeningService) {
        this.screeningService = screeningService;
    }

    @PostMapping
    public ResponseEntity<Void> createScreening(@RequestBody CreateScreeningCommand command) {
        try {
            screeningService.createScreening(command);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (NullPointerException e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
