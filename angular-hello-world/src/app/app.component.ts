import { Component, OnInit } from '@angular/core';
import { HelloworldService } from './helloworld.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'angular-hello-world';

  constructor( private service:HelloworldService) { }

  ngOnInit() {
    this.service.getResponse().subscribe( data=>{
      console.log(data);
    })
  }

}
