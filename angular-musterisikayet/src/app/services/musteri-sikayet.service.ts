import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { MusteriSikayet } from '../common/musteri-sikayet';

@Injectable({
  providedIn: 'root'
})
export class MusteriSikayetService {

  private baseUrl = "http://localhost:8080/api/v1/musteri-sikayet"

  constructor(private httpClient: HttpClient) { }

  getMusteriSikayets(): Observable<MusteriSikayet[]>{
    return this.httpClient.get<GetResponseMusteriSikayet>(this.baseUrl).pipe(
      map(response => response._embedded.musteriSikayet)
    )
  }

}

interface GetResponseMusteriSikayet{
  _embedded:{
    musteriSikayet: MusteriSikayet[];
  }
}
