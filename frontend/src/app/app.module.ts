import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { CreateScreeningComponent } from './components/screening/create-screening/create-screening.component';
import {HttpClientModule} from "@angular/common/http";
import {ReactiveFormsModule} from "@angular/forms";
import { ListScreeningComponent } from './components/screening/list-screening/list-screening/list-screening.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    CreateScreeningComponent,
    ListScreeningComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
