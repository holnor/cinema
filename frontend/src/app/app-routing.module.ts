import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CreateScreeningComponent} from "./components/screening/create-screening/create-screening.component";
import {ListScreeningComponent} from "./components/screening/list-screening/list-screening/list-screening.component";
import {ReservationComponent} from "./components/reservation/reservation.component";

const routes: Routes = [
  {path: 'screening', component: CreateScreeningComponent},
  {path: 'list-screenings', component: ListScreeningComponent},
  {path: 'reservations', component: ReservationComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
