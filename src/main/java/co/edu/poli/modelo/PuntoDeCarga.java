package co.edu.poli.modelo;

import java.io.*;
import java.util.*;

/**
 * Clase que representa un punto de carga para vehículos eléctricos.
 */
public class PuntoDeCarga {

    /**
     * Identificador único del punto de carga.
     */
    private String idPdC;

    /**
     * Indica si el punto de carga está disponible para uso.
     */
    private boolean esDisponible;

    /**
     * Equipo asociado al punto de carga.
     */
    private Equipo  equipo;

    /**
     * Tipo de conector del punto de carga.
     */
    private String conector;

    /**
     * Estado actual del equipo asociado al punto de carga.
     */
    private String estadoEquipo;

    /**
     * Constructor para crear una nueva instancia de PuntoDeCarga.
     *
     * @param idPdC        Identificador único del punto de carga.
     * @param esDisponible Indica si el punto de carga está disponible.
     * @param equipo       Equipo asociado al punto de carga.
     * @param conector     Tipo de conector del punto de carga.
     * @param estadoEquipo Estado actual del equipo asociado.
     */
    public PuntoDeCarga(String idPdC, boolean esDisponible, Equipo equipo, String conector, String estadoEquipo) {
        this.idPdC = idPdC;
        this.esDisponible = esDisponible;
        this.equipo = equipo;
        this.conector = conector;
        this.estadoEquipo = estadoEquipo;
    }

    /**
     * Obtiene el identificador único del punto de carga.
     *
     * @return Identificador del punto de carga.
     */
    public String getIdPdC() {
        return idPdC;
    }

    /**
     * Establece el identificador único del punto de carga.
     *
     * @param idPdC Identificador del punto de carga.
     */
    public void setIdPdC(String idPdC) {
        this.idPdC = idPdC;
    }

    /**
     * Indica si el punto de carga está disponible.
     *
     * @return {@code true} si el punto de carga está disponible, {@code false} de lo contrario.
     */
    public boolean isEsDisponible() {
        return esDisponible;
    }

    /**
     * Establece si el punto de carga está disponible.
     *
     * @param esDisponible {@code true} si el punto de carga está disponible, {@code false} de lo contrario.
     */
    public void setEsDisponible(boolean esDisponible) {
        this.esDisponible = esDisponible;
    }

    /**
     * Obtiene el equipo asociado al punto de carga.
     *
     * @return Equipo asociado.
     */
    public Equipo getEquipo() {
        return equipo;
    }

    /**
     * Establece el equipo asociado al punto de carga.
     *
     * @param equipo Equipo asociado.
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    /**
     * Obtiene el tipo de conector del punto de carga.
     *
     * @return Tipo de conector.
     */
    public String getConector() {
        return conector;
    }

    /**
     * Establece el tipo de conector del punto de carga.
     *
     * @param conector Tipo de conector.
     */
    public void setConector(String conector) {
        this.conector = conector;
    }

    /**
     * Obtiene el estado actual del equipo asociado.
     *
     * @return Estado del equipo.
     */
    public String getEstadoEquipo() {
        return estadoEquipo;
    }

    /**
     * Establece el estado actual del equipo asociado.
     *
     * @param estadoEquipo Estado del equipo.
     */
    public void setEstadoEquipo(String estadoEquipo) {
        this.estadoEquipo = estadoEquipo;
    }

    /**
     * Devuelve una representación en formato String del objeto PuntoDeCarga.
     *
     * @return String con los detalles del punto de carga.
     */
    @Override
    public String toString() {
        return "PuntoDeCarga{" +
                "idPdC='" + idPdC + '\'' +
                ", esDisponible=" + esDisponible +
                ", equipo=" + equipo +
                ", conector='" + conector + '\'' +
                ", estadoEquipo='" + estadoEquipo + '\'' +
                '}';
    }

    /**
     * Verifica si un vehículo está actualmente cargando en el punto de carga.
     *
     * @return {@code true} si un vehículo está cargando, {@code false} de lo contrario.
     */
    public boolean vehiculoCargando() {
        // TODO implement here
        return false;
    }

}