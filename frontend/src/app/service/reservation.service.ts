import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ScreenListOptionsModel} from "../model/screen-list-options.model";
import {Observable} from "rxjs";

const BASE_URL = 'http://localhost:8080/api/reservations'

@Injectable({
  providedIn: 'root'
})
export class ReservationService {

  constructor(private http:HttpClient) { }

  getScreeningListOptions():Observable<ScreenListOptionsModel[]>{
    return this.http.get<ScreenListOptionsModel[]>(BASE_URL + '/options')
  }
}
