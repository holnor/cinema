import {Component} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ScreeningService} from "../../../service/screening.service";

@Component({
  selector: 'app-screening',
  templateUrl: './create-screening.component.html',
  styleUrls: ['./create-screening.component.css']
})
export class CreateScreeningComponent {
  createScreeningForm: FormGroup;


  constructor(private formBuilder: FormBuilder, private screeningService: ScreeningService) {
    this.createScreeningForm = this.formBuilder.group({
      movieTitle: ['', Validators.required],
      screeningDateTime: ['', Validators.required],
      totalSeats: [0, Validators.required],
      imgUrl: ['', Validators.required]
    })
  }

  onSubmit() {
    this.screeningService.createScreening(this.createScreeningForm.value).subscribe({
      next: value => {}
    })
  }


}
