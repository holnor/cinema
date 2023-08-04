import {Component, OnInit} from '@angular/core';
import {ScreeningService} from "../../../../service/screening.service";
import {ScreeningListItemModel} from "../../../../model/screening-list-item.model";

@Component({
  selector: 'app-list-screening',
  templateUrl: './list-screening.component.html',
  styleUrls: ['./list-screening.component.css']
})
export class ListScreeningComponent implements OnInit{

screenings:ScreeningListItemModel[] = [];
  constructor(private screeningService:ScreeningService) {}

  ngOnInit(): void {
    this.screeningService.getAllScreenings().subscribe({
      next: value => this.screenings = value
    })
  }


}
