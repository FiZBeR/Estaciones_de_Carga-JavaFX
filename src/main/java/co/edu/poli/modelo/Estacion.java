package co.edu.poli.modelo;

import java.io.*;
import java.util.*;

/**
 * Representa una estación de carga para vehículos eléctricos,
 * con atributos básicos de identificación, ubicación y capacidad de carga.
 */
public abstract class Estacion {

    /**
     * Nombre de la estación.
     */
    private String nombre;

    /**
     * Identificador único de la estación.
     */
    private String idEstacion;

    /**
     * Ubicación geográfica de la estación.
     */
    private String ubicacion;

    /**
     * Estado actual de la estación (por ejemplo, activo o inactivo).
     */
    private String estado;

    /**
     * Capacidad de la estación en términos de puntos de carga disponibles.
     */
    private int capacidad;

    /**
     * Array que contiene los puntos de carga de la estación.
     */
    private PuntoDeCarga[] puntoDeCarga;

    public Estacion() {
    }

    /**
     * Constructor que inicializa una nueva instancia de una estación con sus atributos principales.
     *
     * @param nombre Nombre de la estación.
     * @param idEstacion Identificador único de la estación.
     * @param ubicacion Ubicación geográfica de la estación.
     * @param estado Estado actual de la estación.
     * @param capacidad Capacidad de la estación en términos de puntos de carga disponibles.
     * @param puntoDeCarga Array de puntos de carga asociados a la estación.
     */

    public Estacion(String nombre, String idEstacion, String ubicacion, String estado, int capacidad, PuntoDeCarga[] puntoDeCarga) {
        this.nombre = nombre;
        this.idEstacion = idEstacion;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.capacidad = capacidad;
        this.puntoDeCarga = puntoDeCarga;
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
     * @param nombre Nuevo nombre de la estación.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el identificador de la estación.
     *
     * @return Identificador único de la estación.
     */
    public String getIdEstacion() {
        return idEstacion;
    }

    /**
     * Establece el identificador de la estación.
     *
     * @param idEstacion Nuevo identificador de la estación.
     */
    public void setIdEstacion(String idEstacion) {
        this.idEstacion = idEstacion;
    }

    /**
     * Obtiene la ubicación de la estación.
     *
     * @return Ubicación geográfica de la estación.
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Establece la ubicación de la estación.
     *
     * @param ubicacion Nueva ubicación de la estación.
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Obtiene el estado actual de la estación.
     *
     * @return Estado de la estación.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la estación.
     *
     * @param estado Nuevo estado de la estación.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtiene la capacidad de la estación en términos de puntos de carga disponibles.
     *
     * @return Capacidad de la estación.
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Establece la capacidad de la estación.
     *
     * @param capacidad Nueva capacidad de la estación.
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * Obtiene el array de puntos de carga asociados a la estación.
     *
     * @return Array de puntos de carga.
     */
    public PuntoDeCarga[] getPuntoDeCarga() {
        return puntoDeCarga;
    }

    /**
     * Establece los puntos de carga de la estación.
     *
     * @param puntoDeCarga Array de nuevos puntos de carga.
     */
    public void setPuntoDeCarga(PuntoDeCarga[] puntoDeCarga) {
        this.puntoDeCarga = puntoDeCarga;
    }

    /**
     * Proporciona una representación en cadena de la estación.
     *
     * @return Una cadena que representa la estación, incluyendo su nombre, ID, ubicación, estado, capacidad y puntos de carga.
     */
    @Override
    public String toString() {
        return "Estacion{" +
                "nombre='" + nombre + '\'' +
                ", idEstacion='" + idEstacion + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", estado='" + estado + '\'' +
                ", capacidad=" + capacidad +
                ", puntoDeCarga=" + Arrays.toString(puntoDeCarga) +
                '}';
    }

    /**
     * Método abstracto que debe ser implementado por clases derivadas.
     */
    public void abstracta() {
        // TODO implementar en subclases
    }

    /**
     * Proporciona una evaluación general del estado de la estación.
     *
     * @return Una cadena que describe el estado general de la estación.
     */
    public String estadoGeneral() {
        // TODO implementar aquí
        return "";
    }

    /**
     * Evalúa la disponibilidad de equipos que estarán disponibles próximamente.
     *
     * @return El número de equipos que estarán disponibles pronto.
     */
    protected int equiposDisponiblesProntoADisponibilidad() {
        // TODO implementar aquí
        return 0;
    }

    /**
     * Verifica si hay equipos disponibles en la estación.
     *
     * @return `true` si hay equipos disponibles, de lo contrario, `false`.
     */
    protected boolean equiposDisponibles() {
        // TODO implementar aquí
        return false;
    }

}
