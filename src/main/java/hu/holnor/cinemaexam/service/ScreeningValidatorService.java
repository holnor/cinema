package hu.holnor.cinemaexam.service;

import org.springframework.stereotype.Service;

@Service
public class ScreeningValidatorService {
    private ScreeningService screeningService;

    public ScreeningValidatorService(ScreeningService screeningService) {
        this.screeningService = screeningService;
    }


}
