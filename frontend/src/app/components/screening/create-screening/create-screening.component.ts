import {Component} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ScreeningService} from "../../../service/screening.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-screening',
  templateUrl: './create-screening.component.html',
  styleUrls: ['./create-screening.component.css']
})
export class CreateScreeningComponent {
  createScreeningForm: FormGroup;
  isSubmitted = false;


  constructor(private formBuilder: FormBuilder, private screeningService: ScreeningService, private router:Router) {
    this.createScreeningForm = this.formBuilder.group({
      movieTitle: ['', [Validators.required, Validators.minLength(3)]],
      screeningDateTime: ['', Validators.required],
      totalSeats: [0, Validators.required],
      imgUrl: ['']
    })
  }

  onSubmit() {
    this.screeningService.createScreening(this.createScreeningForm.value).subscribe({
      error: value => {
      },
      complete: () => {
        this.createScreeningForm.reset();
        this.isSubmitted = true;
        this.router.navigate(['list-screenings'])
      }
    })
  }
}
