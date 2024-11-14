package co.edu.poli.modelo;

import java.io.*;
import java.util.*;

/**
 * Representa un punto de carga para vehículos eléctricos en una estación,
 * que contiene información sobre el estado del equipo, los conectores disponibles,
 * y el vehículo conectado al punto de carga.
 */
public class PuntoDeCarga {

    /**
     * Identificador único del punto de carga.
     */
    private String idPdC;

    /**
     * Indica si el punto de carga está disponible para usar.
     */
    private boolean esDisponible;

    /**
     * Tipo de conector disponible en el punto de carga.
     */
    private String conector;

    /**
     * Estado actual del equipo de carga (por ejemplo, operativo o en mantenimiento).
     */
    private String estadoEquipo;

    /**
     * Objeto que representa el equipo de carga normal.
     */
    private Equipo equipo;

    /**
     * Objeto que representa el equipo de carga rápida.
     */
    private EquipoRapido equipoRapido;

    /**
     * Objeto que representa el equipo de carga ultra rápida.
     */
    private EquipoUltra equipoUltra;

    /**
     * Objeto que representa el vehículo conectado al punto de carga.
     */
    private Vehiculo vehiculo;

    /**
     * Constructor que inicializa un punto de carga con un equipo de carga normal y un vehículo.
     *
     * @param idPdC Identificador único del punto de carga.
     * @param esDisponible Indica si el punto de carga está disponible.
     * @param conector Tipo de conector disponible.
     * @param estadoEquipo Estado del equipo de carga.
     * @param equipo Equipo de carga normal.
     * @param vehiculo Vehículo conectado al punto de carga.
     */
    public PuntoDeCarga(String idPdC, boolean esDisponible, String conector, String estadoEquipo, Equipo equipo, Vehiculo vehiculo) {
        this.idPdC = idPdC;
        this.esDisponible = esDisponible;
        this.conector = conector;
        this.estadoEquipo = estadoEquipo;
        this.equipo = equipo;
        this.vehiculo = vehiculo;
    }

    /**
     * Constructor que inicializa un punto de carga con un equipo de carga rápida y un vehículo.
     *
     * @param idPdC Identificador único del punto de carga.
     * @param esDisponible Indica si el punto de carga está disponible.
     * @param conector Tipo de conector disponible.
     * @param estadoEquipo Estado del equipo de carga.
     * @param equipoRapido Equipo de carga rápida.
     * @param vehiculo Vehículo conectado al punto de carga.
     */
    public PuntoDeCarga(String idPdC, boolean esDisponible, String conector, String estadoEquipo, EquipoRapido equipoRapido, Vehiculo vehiculo) {
        this.idPdC = idPdC;
        this.esDisponible = esDisponible;
        this.conector = conector;
        this.estadoEquipo = estadoEquipo;
        this.equipoRapido = equipoRapido;
        this.vehiculo = vehiculo;
    }

    /**
     * Constructor que inicializa un punto de carga con un equipo de carga ultra rápida y un vehículo.
     *
     * @param idPdC Identificador único del punto de carga.
     * @param esDisponible Indica si el punto de carga está disponible.
     * @param conector Tipo de conector disponible.
     * @param estadoEquipo Estado del equipo de carga.
     * @param equipoUltra Equipo de carga ultra rápida.
     * @param vehiculo Vehículo conectado al punto de carga.
     */
    public PuntoDeCarga(String idPdC, boolean esDisponible, String conector, String estadoEquipo, EquipoUltra equipoUltra, Vehiculo vehiculo) {
        this.idPdC = idPdC;
        this.esDisponible = esDisponible;
        this.conector = conector;
        this.estadoEquipo = estadoEquipo;
        this.equipoUltra = equipoUltra;
        this.vehiculo = vehiculo;
    }

    /**
     * Constructor que inicializa un punto de carga con un equipo de carga normal.
     *
     * @param idPdC Identificador único del punto de carga.
     * @param esDisponible Indica si el punto de carga está disponible.
     * @param conector Tipo de conector disponible.
     * @param estadoEquipo Estado del equipo de carga.
     * @param equipo Equipo de carga normal.
     */
    public PuntoDeCarga(String idPdC, boolean esDisponible, String conector, String estadoEquipo, Equipo equipo) {
        this.idPdC = idPdC;
        this.esDisponible = esDisponible;
        this.conector = conector;
        this.estadoEquipo = estadoEquipo;
        this.equipo = equipo;
    }

    /**
     * Constructor que inicializa un punto de carga con un equipo de carga rápida.
     *
     * @param idPdC Identificador único del punto de carga.
     * @param esDisponible Indica si el punto de carga está disponible.
     * @param conector Tipo de conector disponible.
     * @param estadoEquipo Estado del equipo de carga.
     * @param equipoRapido Equipo de carga rápida.
     */
    public PuntoDeCarga(String idPdC, boolean esDisponible, String conector, String estadoEquipo, EquipoRapido equipoRapido) {
        this.idPdC = idPdC;
        this.esDisponible = esDisponible;
        this.conector = conector;
        this.estadoEquipo = estadoEquipo;
        this.equipoRapido = equipoRapido;
    }

    /**
     * Constructor que inicializa un punto de carga con un equipo de carga ultra rápida.
     *
     * @param idPdC Identificador único del punto de carga.
     * @param esDisponible Indica si el punto de carga está disponible.
     * @param conector Tipo de conector disponible.
     * @param estadoEquipo Estado del equipo de carga.
     * @param equipoUltra Equipo de carga ultra rápida.
     */
    public PuntoDeCarga(String idPdC, boolean esDisponible, String conector, String estadoEquipo, EquipoUltra equipoUltra) {
        this.idPdC = idPdC;
        this.esDisponible = esDisponible;
        this.conector = conector;
        this.estadoEquipo = estadoEquipo;
        this.equipoUltra = equipoUltra;
    }

    /**
     * Obtiene el identificador del punto de carga.
     *
     * @return El identificador del punto de carga.
     */
    public String getIdPdC() {
        return idPdC;
    }

    /**
     * Establece el identificador del punto de carga.
     *
     * @param idPdC El nuevo identificador del punto de carga.
     */
    public void setIdPdC(String idPdC) {
        this.idPdC = idPdC;
    }

    /**
     * Obtiene el estado de disponibilidad del punto de carga.
     *
     * @return True si el punto de carga está disponible, de lo contrario, false.
     */
    public boolean isEsDisponible() {
        return esDisponible;
    }

    /**
     * Establece el estado de disponibilidad del punto de carga.
     *
     * @param esDisponible El nuevo estado de disponibilidad del punto de carga.
     */
    public void setEsDisponible(boolean esDisponible) {
        this.esDisponible = esDisponible;
    }

    /**
     * Obtiene el tipo de conector disponible en el punto de carga.
     *
     * @return El tipo de conector como una cadena.
     */
    public String getConector() {
        return conector;
    }

    /**
     * Establece el tipo de conector disponible en el punto de carga.
     *
     * @param conector El nuevo tipo de conector.
     */
    public void setConector(String conector) {
        this.conector = conector;
    }

    /**
     * Obtiene el estado del equipo de carga en el punto de carga.
     *
     * @return El estado del equipo como una cadena.
     */
    public String getEstadoEquipo() {
        return estadoEquipo;
    }

    /**
     * Establece el estado del equipo de carga en el punto de carga.
     *
     * @param estadoEquipo El nuevo estado del equipo de carga.
     */
    public void setEstadoEquipo(String estadoEquipo) {
        this.estadoEquipo = estadoEquipo;
    }

    /**
     * Obtiene el equipo de carga normal asociado con el punto de carga.
     *
     * @return El equipo de carga normal.
     */
    public Equipo getEquipo() {
        return equipo;
    }

    /**
     * Establece el equipo de carga normal en el punto de carga.
     *
     * @param equipo El nuevo equipo de carga normal.
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    /**
     * Obtiene el equipo de carga rápida asociado con el punto de carga.
     *
     * @return El equipo de carga rápida.
     */
    public EquipoRapido getEquipoRapido() {
        return equipoRapido;
    }

    /**
     * Establece el equipo de carga rápida en el punto de carga.
     *
     * @param equipoRapido El nuevo equipo de carga rápida.
     */
    public void setEquipoRapido(EquipoRapido equipoRapido) {
        this.equipoRapido = equipoRapido;
    }

    /**
     * Obtiene el equipo de carga ultra rápida asociado con el punto de carga.
     *
     * @return El equipo de carga ultra rápida.
     */
    public EquipoUltra getEquipoUltra() {
        return equipoUltra;
    }

    /**
     * Establece el equipo de carga ultra rápida en el punto de carga.
     *
     * @param equipoUltra El nuevo equipo de carga ultra rápida.
     */
    public void setEquipoUltra(EquipoUltra equipoUltra) {
        this.equipoUltra = equipoUltra;
    }

    /**
     * Obtiene el vehículo conectado al punto de carga.
     *
     * @return El vehículo conectado.
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Establece el vehículo conectado al punto de carga.
     *
     * @param vehiculo El nuevo vehículo conectado.
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
