package com.example.nesto.farmaciasdegijon;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Nestor on 04/04/2017.
 */

public class Farmacia implements Parcelable{

    private String nombre;
    private String direccion;
    private int telefono;
    private String correo;
    private String descripcion;
    private String horario;

    public Farmacia(String nombre, String direccion, int telefono, String correo, String descripcion, String horario) {
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
        this.correo=correo;
        this.descripcion=descripcion;
        this.horario=horario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getHorario() {
        return horario;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
