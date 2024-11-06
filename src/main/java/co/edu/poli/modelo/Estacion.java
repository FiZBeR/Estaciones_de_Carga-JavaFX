package co.edu.poli.modelo;

import java.io.*;
import java.util.*;

/**
 * Clase que representa una Estación de carga.
 */
public class Estacion {

    /**
     * Nombre de la estación.
     */
    private String nombre;

    /**
     * Identificador único de la estación.
     */
    private String idEstacion;

    /**
     * Ubicación de la estación.
     */
    private String ubicacion;

    /**
     * Estado de la estación (por ejemplo, activa o inactiva).
     */
    private String estado;

    /**
     * Capacidad máxima de la estación.
     */
    private int capacidad;

    /**
     * Array de puntos de carga asociados a la estación.
     */
    private PuntoDeCarga [ ] puntosDeCarga;

    /**
     * Constructor para crear una nueva estación.
     *
     * @param nombre        Nombre de la estación.
     * @param idEstacion    Identificador único de la estación.
     * @param ubicacion     Ubicación de la estación.
     * @param estado        Estado actual de la estación.
     * @param capacidad     Capacidad máxima de la estación.
     * @param puntosDeCarga Array de puntos de carga asociados a la estación.
     */
    public Estacion(String nombre, String idEstacion, String ubicacion, String estado, int capacidad, PuntoDeCarga[] puntosDeCarga) {
        this.nombre = nombre;
        this.idEstacion = idEstacion;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.capacidad = capacidad;
        this.puntosDeCarga = puntosDeCarga;
    }

    /**
     * Obtiene el nombre de la estación.
     *
     * @return Nombre de la estación.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la estación.
     *
     * @param nombre Nombre de la estación.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el identificador único de la estación.
     *
     * @return Identificador único de la estación.
     */
    public String getIdEstacion() {
        return idEstacion;
    }

    /**
     * Establece el identificador único de la estación.
     *
     * @param idEstacion Identificador único de la estación.
     */
    public void setIdEstacion(String idEstacion) {
        this.idEstacion = idEstacion;
    }

    /**
     * Obtiene la ubicación de la estación.
     *
     * @return Ubicación de la estación.
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Establece la ubicación de la estación.
     *
     * @param ubicacion Ubicación de la estación.
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Obtiene el estado de la estación.
     *
     * @return Estado de la estación.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la estación.
     *
     * @param estado Estado de la estación.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtiene la capacidad máxima de la estación.
     *
     * @return Capacidad máxima de la estación.
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Establece la capacidad máxima de la estación.
     *
     * @param capacidad Capacidad máxima de la estación.
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * Obtiene el array de puntos de carga asociados a la estación.
     *
     * @return Array de puntos de carga asociados a la estación.
     */
    public PuntoDeCarga[] getPuntosDeCarga() {
        return puntosDeCarga;
    }

    /**
     * Establece el array de puntos de carga asociados a la estación.
     *
     * @param puntosDeCarga Array de puntos de carga asociados a la estación.
     */
    public void setPuntosDeCarga(PuntoDeCarga[] puntosDeCarga) {
        this.puntosDeCarga = puntosDeCarga;
    }

    /**
     * Devuelve una representación en formato String del objeto Estacion.
     *
     * @return String con los atributos de la estación.
     */
    @Override
    public String toString() {
        return "Estacion{" +
                "nombre='" + nombre + '\'' +
                ", idEstacion='" + idEstacion + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", estado='" + estado + '\'' +
                ", capacidad=" + capacidad +
                ", puntosDeCarga=" + Arrays.toString(puntosDeCarga) +
                '}';
    }
}