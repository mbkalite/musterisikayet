import { Component, OnInit } from '@angular/core';
import { MusteriSikayet } from 'src/app/common/musteri-sikayet';
import { MusteriSikayetService } from 'src/app/services/musteri-sikayet.service';

@Component({
  selector: 'app-musteri-sikayet-list',
  templateUrl: './musteri-sikayet-list.component.html',
  styleUrls: ['./musteri-sikayet-list.component.css']
})
export class MusteriSikayetListComponent implements OnInit {

  musteriSikayets: MusteriSikayet[];

  constructor(private _musteriSikayetService: MusteriSikayetService) { }

  ngOnInit(){
    this.listMusteriSikayets();
  }

  listMusteriSikayets(){
    this._musteriSikayetService.getMusteriSikayets().subscribe(
      data=>{
        this.musteriSikayets = data;
      }
    )
  }

}
