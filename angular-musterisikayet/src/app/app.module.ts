import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { MusteriSikayetService } from './services/musteri-sikayet.service';
import { MusteriSikayetListComponent } from './components/musteri-sikayet-list/musteri-sikayet-list.component';

@NgModule({
  declarations: [
    AppComponent,
    MusteriSikayetListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [
    MusteriSikayetService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
