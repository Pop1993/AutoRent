import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { InterfaceUIComponent } from './interface-ui/interface-ui.component';
import { AddressComponent } from './address/address.component';
import { ListEmployeesComponent } from './list-employees/list-employees.component';
import { CarsAvailableComponent } from './cars-available/cars-available.component';
import { EmployeeComponent } from './employee/employee.component';
import { CarComponent } from './car/car.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatTabsModule} from "@angular/material/tabs";
import {MatOptionModule} from "@angular/material/core";
import {FormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    InterfaceUIComponent,
    AddressComponent,
    ListEmployeesComponent,
    CarsAvailableComponent,
    EmployeeComponent,
    CarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatTabsModule,
    MatOptionModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
