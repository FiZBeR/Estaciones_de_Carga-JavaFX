package co.edu.poli.vista;

import co.edu.poli.modelo.Estacion;
import co.edu.poli.modelo.PuntoDeCarga;

import java.io.*;
import java.util.*;

/**
 * Representa una estación de carga de tipo "Normal" que extiende la clase {@link Estacion}.
 * Esta clase incluye información sobre el tiempo promedio de carga, el costo por hora y
 * el nivel máximo de carga de las estaciones de carga normal.
 */
public class Estacion_E_Normal extends Estacion {

    /**
     * Tiempo promedio de carga (en horas) para los vehículos en esta estación.
     */
    private int tiempoCargaPromedio;

    /**
     * Costo por hora de uso de la estación de carga.
     */
    private double costoPorHora;

    /**
     * Nivel máximo de carga que puede alcanzar la estación de carga normal (en kWh).
     */
    private double nivelCargaMax;

    /**
     * Constructor que inicializa una estación de carga normal con los parámetros proporcionados.
     *
     * @param nombre El nombre de la estación de carga.
     * @param idEstacion El identificador único de la estación de carga.
     * @param ubicacion La ubicación de la estación de carga.
     * @param estado El estado de la estación de carga (por ejemplo, "activa" o "inactiva").
     * @param capacidad La capacidad total de la estación de carga (número de puntos de carga).
     * @param puntoDeCarga El arreglo de puntos de carga disponibles en la estación.
     * @param tiempoCargaPromedio El tiempo promedio de carga para los vehículos.
     * @param costoPorHora El costo por hora de uso de la estación de carga.
     * @param nivelCargaMax El nivel máximo de carga que puede soportar la estación (en kWh).
     */
    public Estacion_E_Normal(String nombre, String idEstacion, String ubicacion, String estado, int capacidad, PuntoDeCarga[] puntoDeCarga, int tiempoCargaPromedio, double costoPorHora, double nivelCargaMax) {
        super(nombre, idEstacion, ubicacion, estado, capacidad, puntoDeCarga);
        this.tiempoCargaPromedio = tiempoCargaPromedio;
        this.costoPorHora = costoPorHora;
        this.nivelCargaMax = nivelCargaMax;
    }

    /**
     * Obtiene el tiempo promedio de carga de la estación.
     *
     * @return El tiempo promedio de carga en horas.
     */
    public int getTiempoCargaPromedio() {
        return tiempoCargaPromedio;
    }

    /**
     * Establece el tiempo promedio de carga de la estación.
     *
     * @param tiempoCargaPromedio El nuevo tiempo promedio de carga en horas.
     */
    public void setTiempoCargaPromedio(int tiempoCargaPromedio) {
        this.tiempoCargaPromedio = tiempoCargaPromedio;
    }

    /**
     * Obtiene el costo por hora de uso de la estación de carga.
     *
     * @return El costo por hora de uso.
     */
    public double getCostoPorHora() {
        return costoPorHora;
    }

    /**
     * Establece el costo por hora de uso de la estación de carga.
     *
     * @param costoPorHora El nuevo costo por hora de uso.
     */
    public void setCostoPorHora(double costoPorHora) {
        this.costoPorHora = costoPorHora;
    }

    /**
     * Obtiene el nivel máximo de carga que puede soportar la estación de carga.
     *
     * @return El nivel máximo de carga en kWh.
     */
    public double getNivelCargaMax() {
        return nivelCargaMax;
    }

    /**
     * Establece el nivel máximo de carga que puede soportar la estación de carga.
     *
     * @param nivelCargaMax El nuevo nivel máximo de carga en kWh.
     */
    public void setNivelCargaMax(double nivelCargaMax) {
        this.nivelCargaMax = nivelCargaMax;
    }

    /**
     * Representa a la estación de carga normal como una cadena de texto, incluyendo
     * la información heredada de {@link Estacion} y los detalles específicos de esta clase.
     *
     * @return Una cadena que describe la estación de carga normal.
     */
    @Override
    public String toString() {
        return super.toString() +
                "Estacion_E_Normal{" +
                "tiempoCargaPromedio=" + tiempoCargaPromedio +
                ", costoPorHora=" + costoPorHora +
                ", nivelCargaMax=" + nivelCargaMax +
                '}';
    }

    /**
     * Método para obtener el estado general de la estación de carga normal.
     *
     * @return Una cadena con el estado general de la estación (aún no implementado).
     */
    public String estadoGeneral() {
        // TODO implement here
        return "";
    }
}
