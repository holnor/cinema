package hu.holnor.cinemaexam.validator;

import hu.holnor.cinemaexam.dto.outgoing.CreateScreeningCommand;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


import java.util.Set;

@Component
public class CreateScreeningCommandValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return CreateScreeningCommand.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        if (o != null) {
            CreateScreeningCommand createCommand = (CreateScreeningCommand) o;

            if (createCommand.getMovieTitle() == null || createCommand.getMovieTitle().isBlank()){
                errors.rejectValue("movieTitle", "create.screening.title.empty");
            }
        }
    }
}
