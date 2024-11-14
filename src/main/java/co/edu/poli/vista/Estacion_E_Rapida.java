package co.edu.poli.vista;

import co.edu.poli.modelo.Estacion;
import co.edu.poli.modelo.PuntoDeCarga;

import java.io.*;
import java.util.*;

/**
 * Representa una estación de carga de tipo "Rápida" que extiende la clase {@link Estacion}.
 * Esta clase incluye información sobre el tiempo promedio de carga rápida y la tarifa de carga rápida.
 */
public class Estacion_E_Rapida extends Estacion {

    /**
     * Tiempo promedio de carga rápida (en horas) para los vehículos en esta estación.
     */
    private int tiempoPromedioRapido;

    /**
     * Tarifa de carga rápida de la estación (costo por uso de la carga rápida).
     */
    private double tarifaCargaRapida;

    /**
     * Constructor que inicializa una estación de carga rápida con los parámetros proporcionados.
     *
     * @param nombre El nombre de la estación de carga.
     * @param idEstacion El identificador único de la estación de carga.
     * @param ubicacion La ubicación de la estación de carga.
     * @param estado El estado de la estación de carga (por ejemplo, "activa" o "inactiva").
     * @param capacidad La capacidad total de la estación de carga (número de puntos de carga).
     * @param puntoDeCarga El arreglo de puntos de carga disponibles en la estación.
     * @param tiempoPromedioRapido El tiempo promedio de carga rápida para los vehículos.
     * @param tarifaCargaRapida La tarifa por uso de carga rápida en la estación.
     */
    public Estacion_E_Rapida(String nombre, String idEstacion, String ubicacion, String estado, int capacidad, PuntoDeCarga[] puntoDeCarga, int tiempoPromedioRapido, double tarifaCargaRapida) {
        super(nombre, idEstacion, ubicacion, estado, capacidad, puntoDeCarga);
        this.tiempoPromedioRapido = tiempoPromedioRapido;
        this.tarifaCargaRapida = tarifaCargaRapida;
    }

    /**
     * Obtiene el tiempo promedio de carga rápida de la estación.
     *
     * @return El tiempo promedio de carga rápida en horas.
     */
    public int getTiempoPromedioRapido() {
        return tiempoPromedioRapido;
    }

    /**
     * Establece el tiempo promedio de carga rápida de la estación.
     *
     * @param tiempoPromedioRapido El nuevo tiempo promedio de carga rápida en horas.
     */
    public void setTiempoPromedioRapido(int tiempoPromedioRapido) {
        this.tiempoPromedioRapido = tiempoPromedioRapido;
    }

    /**
     * Obtiene la tarifa de carga rápida de la estación.
     *
     * @return La tarifa de carga rápida.
     */
    public double getTarifaCargaRapida() {
        return tarifaCargaRapida;
    }

    /**
     * Establece la tarifa de carga rápida de la estación.
     *
     * @param tarifaCargaRapida La nueva tarifa de carga rápida.
     */
    public void setTarifaCargaRapida(double tarifaCargaRapida) {
        this.tarifaCargaRapida = tarifaCargaRapida;
    }

    /**
     * Representa a la estación de carga rápida como una cadena de texto, incluyendo
     * la información heredada de {@link Estacion} y los detalles específicos de esta clase.
     *
     * @return Una cadena que describe la estación de carga rápida.
     */
    @Override
    public String toString() {
        return super.toString() +
                "Estacion_E_Rapida{" +
                "tiempoPromedioRapido=" + tiempoPromedioRapido +
                ", tarifaCargaRapida=" + tarifaCargaRapida +
                '}';
    }
}
