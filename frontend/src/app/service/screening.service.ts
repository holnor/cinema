import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {CreateScreeningModel} from "../model/create-screening.model";
import {Observable} from "rxjs";

const BASE_URL = 'http://localhost:8080/api/screenings'

@Injectable({
  providedIn: 'root'
})
export class ScreeningService {

  constructor(private http: HttpClient) {
  }

  createScreening(data: CreateScreeningModel): Observable<any> {
    return this.http.post(BASE_URL, data);
  }
}
