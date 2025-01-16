/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Convert;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author PC
 */
@Entity
public class Tarea implements Serializable {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombreTarea;
    @Column(name = "fecha")
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime fecha;
    private String estado;

    public Tarea() {
    }

    public Tarea(Integer id, String nombreTarea, LocalDateTime fecha) {
        this.id = id;
        this.nombreTarea = nombreTarea;
        this.fecha = fecha;
        this.estado="Pendiente";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarea)) {
            return false;
        }
        Tarea other = (Tarea) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return estado+"|"+nombreTarea+" fecha:"+fecha.getDayOfMonth()+"/"+fecha.getMonthValue()+"/"+fecha.getYear()+" Hora:"+fecha.getHour()+":"+fecha.getMinute()+" "+fecha.getSecond();
    }
    
}
