import {Component, OnInit} from '@angular/core';
import {ReservationService} from "../../service/reservation.service";
import {ScreenListOptionsModel} from "../../model/screen-list-options.model";

@Component({
  selector: 'app-reservation',
  templateUrl: './reservation.component.html',
  styleUrls: ['./reservation.component.css']
})
export class ReservationComponent implements OnInit{

  screeningListOptions: ScreenListOptionsModel[] = [];
  selectedScreeningId:number;
  availableSeats:number;

  constructor(private reservationService:ReservationService) {
  }

  ngOnInit(): void {
    this.reservationService.getScreeningListOptions().subscribe({
      next: value => this.screeningListOptions = value
    })
  }

  onOptionSelected(event:any) {
    this.selectedScreeningId = event.target.value;
    this.reservationService.getAvailableSeats(this.selectedScreeningId).subscribe({
      next: value => this.availableSeats = value
    })
  }
}
