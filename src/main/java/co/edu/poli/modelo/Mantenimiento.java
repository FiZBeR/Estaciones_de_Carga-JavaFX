package co.edu.poli.modelo;

import java.io.*;
import java.util.*;

/**
 * Representa un registro de mantenimiento en una estación de carga,
 * con detalles sobre el técnico, la fecha y observaciones del mantenimiento.
 */
public class Mantenimiento {

    /**
     * Fecha en que se realizó el mantenimiento.
     */
    private String fecha;

    /**
     * Identificador único del técnico que realizó el mantenimiento.
     */
    private String idTecnico;

    /**
     * Nombre del técnico que realizó el mantenimiento.
     */
    private String nombreTecnico;

    /**
     * Observaciones sobre el mantenimiento realizado.
     */
    private String observaciones;

    /**
     * Constructor para inicializar una instancia de Mantenimiento con los atributos especificados.
     *
     * @param fecha Fecha del mantenimiento.
     * @param idTecnico ID del técnico encargado del mantenimiento.
     * @param nombreTecnico Nombre del técnico encargado del mantenimiento.
     * @param observaciones Observaciones sobre el mantenimiento realizado.
     */
    public Mantenimiento(String fecha, String idTecnico, String nombreTecnico, String observaciones) {
        this.fecha = fecha;
        this.idTecnico = idTecnico;
        this.nombreTecnico = nombreTecnico;
        this.observaciones = observaciones;
    }

    /**
     * Obtiene la fecha del mantenimiento.
     *
     * @return La fecha del mantenimiento en formato de cadena.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha del mantenimiento.
     *
     * @param fecha Nueva fecha del mantenimiento.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el ID del técnico.
     *
     * @return El ID del técnico como cadena.
     */
    public String getIdTecnico() {
        return idTecnico;
    }

    /**
     * Establece el ID del técnico.
     *
     * @param idTecnico Nuevo ID del técnico.
     */
    public void setIdTecnico(String idTecnico) {
        this.idTecnico = idTecnico;
    }

    /**
     * Obtiene el nombre del técnico.
     *
     * @return El nombre del técnico como cadena.
     */
    public String getNombreTecnico() {
        return nombreTecnico;
    }

    /**
     * Establece el nombre del técnico.
     *
     * @param nombreTecnico Nuevo nombre del técnico.
     */
    public void setNombreTecnico(String nombreTecnico) {
        this.nombreTecnico = nombreTecnico;
    }

    /**
     * Obtiene las observaciones del mantenimiento.
     *
     * @return Las observaciones como cadena.
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Establece las observaciones del mantenimiento.
     *
     * @param observaciones Nuevas observaciones del mantenimiento.
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     * Proporciona una representación en cadena del objeto Mantenimiento.
     *
     * @return Una cadena que representa los detalles del mantenimiento.
     */
    @Override
    public String toString() {
        return "Mantenimiento{" +
                "fecha='" + fecha + '\'' +
                ", idTecnico='" + idTecnico + '\'' +
                ", nombreTecnico='" + nombreTecnico + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }

    /**
     * Calcula el costo del mantenimiento basado en el tiempo dedicado.
     *
     * @param minutos La cantidad de minutos dedicados al mantenimiento.
     * @return El costo calculado del mantenimiento.
     */
    public double costoMantenimiento(int minutos) {
        // TODO implementar aquí
        return 0.0;
    }

    /**
     * Obtiene la hora en la que se realizó el mantenimiento.
     *
     * @return La hora del mantenimiento en formato de cadena.
     */
    public String hora() {
        // TODO implementar aquí
        return "";
    }

}
