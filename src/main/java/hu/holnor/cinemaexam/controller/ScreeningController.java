package hu.holnor.cinemaexam.controller;

import hu.holnor.cinemaexam.dto.outgoing.CreateScreeningCommand;
import hu.holnor.cinemaexam.service.ScreeningService;
import hu.holnor.cinemaexam.validator.CreateScreeningCommandValidator;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/screenings")
public class ScreeningController {
    private ScreeningService screeningService;
    private CreateScreeningCommandValidator validator;

    @InitBinder("createScreeningCommand")
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(validator);
    }


    public ScreeningController(ScreeningService screeningService, CreateScreeningCommandValidator validator) {
        this.screeningService = screeningService;
        this.validator = validator;
    }

    @PostMapping
    public ResponseEntity<Void> createScreening(@RequestBody @Valid CreateScreeningCommand command) {
        screeningService.createScreening(command);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}

