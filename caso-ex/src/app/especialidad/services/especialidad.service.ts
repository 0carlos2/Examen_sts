import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { especialidad } from '../models/especialidad';

@Injectable({
  providedIn: 'root'
})
export class EspecialidadService {
  private ApiURl = "http://localhost:8080/especialidades";
  constructor(private http: HttpClient) { }

  getEspecialidad(): Observable<especialidad[]> {
    return this.http.get<especialidad[]>(this.ApiURl);
  }
  getEspecialidadbyID(id: number): Observable<especialidad> {
    return this.http.get<especialidad>(`${this.ApiURl}/${id}`);
  }
  updateEspecialidad(id: number, carrera: especialidad): Observable<especialidad> {
    return this.http.put<especialidad>(`${this.ApiURl}/${id}`, carrera);
  }
  deleteEspecialidad(id: number): Observable<especialidad> {
    return this.http.delete<especialidad>(`${this.ApiURl}/${id}`);
  }
  crearEspecialidad(carrera: especialidad): Observable<especialidad> {
    return this.http.post<especialidad>(this.ApiURl, especialidad);
  }
}
