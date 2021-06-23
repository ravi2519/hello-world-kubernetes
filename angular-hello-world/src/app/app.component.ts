import { Component, OnInit } from '@angular/core';
import { HelloworldService } from './helloworld.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent implements OnInit {
  title = 'angular-hello-world';
  message = '';
  name = "";
  company = "";

  constructor(private service: HelloworldService) {}

  ngOnInit() {
    
  }

  callBackend(event:any) {
    this.service.getResponse(this.name, this.company).subscribe((data) => {
      console.log(data);
      this.message = data.text;
    });
  }
}
