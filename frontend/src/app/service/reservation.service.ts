import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ScreenListOptionsModel} from "../model/screen-list-options.model";
import {Observable} from "rxjs";

const RESERVATIONS_BASE_URL = 'http://localhost:8080/api/reservations'
const SCREENINGS_BASE_URL = 'http://localhost:8080/api/screenings'

@Injectable({
  providedIn: 'root'
})
export class ReservationService {

  constructor(private http:HttpClient) { }

  getScreeningListOptions():Observable<ScreenListOptionsModel[]>{
    return this.http.get<ScreenListOptionsModel[]>(RESERVATIONS_BASE_URL + '/options')
  }

  getAvailableSeats(id:number):Observable<number> {
    console.log(this.http.get<number>(RESERVATIONS_BASE_URL + `/${id}/seats`));
   return this.http.get<number>(RESERVATIONS_BASE_URL + `/${id}/seats`);
  }
}
