import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CreateScreeningComponent} from "./components/screening/create-screening/create-screening.component";

const routes: Routes = [
  {path: 'screening', component: CreateScreeningComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
