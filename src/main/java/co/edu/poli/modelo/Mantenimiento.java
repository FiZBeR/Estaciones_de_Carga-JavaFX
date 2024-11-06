package co.edu.poli.modelo;

import java.io.*;
import java.util.*;

/**
 * Clase que representa un Mantenimiento realizado en un equipo.
 */
public class Mantenimiento {
    /**
     * Fecha en la que se realizó el mantenimiento.
     */
    private String fecha;

    /**
     * Identificador del técnico que realizó el mantenimiento.
     */
    private String idTecnico;

    /**
     * Nombre del técnico que realizó el mantenimiento.
     */
    private String tecnico;

    /**
     * Observaciones realizadas durante el mantenimiento.
     */
    private String observaciones;

    /**
     * Constructor para crear una nueva instancia de Mantenimiento.
     *
     * @param fecha         Fecha en la que se realizó el mantenimiento.
     * @param idTecnico     Identificador del técnico.
     * @param tecnico       Nombre del técnico.
     * @param observaciones Observaciones realizadas durante el mantenimiento.
     */
    public Mantenimiento(String fecha, String idTecnico, String tecnico, String observaciones) {
        this.fecha = fecha;
        this.idTecnico = idTecnico;
        this.tecnico = tecnico;
        this.observaciones = observaciones;
    }

    /**
     * Obtiene la fecha en la que se realizó el mantenimiento.
     *
     * @return Fecha del mantenimiento.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha del mantenimiento.
     *
     * @param fecha Fecha del mantenimiento.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el identificador del técnico que realizó el mantenimiento.
     *
     * @return Identificador del técnico.
     */
    public String getIdTecnico() {
        return idTecnico;
    }

    /**
     * Establece el identificador del técnico.
     *
     * @param idTecnico Identificador del técnico.
     */
    public void setIdTecnico(String idTecnico) {
        this.idTecnico = idTecnico;
    }

    /**
     * Obtiene el nombre del técnico que realizó el mantenimiento.
     *
     * @return Nombre del técnico.
     */
    public String getTecnico() {
        return tecnico;
    }

    /**
     * Establece el nombre del técnico.
     *
     * @param tecnico Nombre del técnico.
     */
    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    /**
     * Obtiene las observaciones realizadas durante el mantenimiento.
     *
     * @return Observaciones del mantenimiento.
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Establece las observaciones del mantenimiento.
     *
     * @param observaciones Observaciones del mantenimiento.
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     * Devuelve una representación en formato String del objeto Mantenimiento.
     *
     * @return String con los detalles del mantenimiento.
     */
    @Override
    public String toString() {
        return "Mantenimiento{" +
                "fecha='" + fecha + '\'' +
                ", idTecnico='" + idTecnico + '\'' +
                ", tecnico='" + tecnico + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }

    /**
     * Calcula el costo del mantenimiento basado en los minutos empleados.
     *
     * @param minutos Cantidad de minutos que duró el mantenimiento.
     * @return Costo del mantenimiento.
     */
    public double costoMantenimiento(int minutos) {
        // TODO implement here
        return 0.0d;
    }

    /**
     * Obtiene la fecha y hora actual como un String.
     *
     * @return Fecha y hora actual.
     */
    public String ahora() {
        // TODO implement here
        return "";
    }

}