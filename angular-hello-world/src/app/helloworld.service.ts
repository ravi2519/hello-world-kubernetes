import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class HelloworldService {

  constructor(
    private http: HttpClient
  ) { }

  getResponse(): Observable<any> {
    return this.http.get( `${environment.baseUrl}` + "/hello-world/from/ravi/of/ats");
  }
  
}
