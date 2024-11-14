
package co.edu.poli.vista;

import co.edu.poli.modelo.Estacion;
import co.edu.poli.modelo.PuntoDeCarga;

import java.io.*;
import java.util.*;

/**
 * Representa una estación de carga de tipo "Ultra" que extiende la clase {@link Estacion}.
 * Esta clase incluye información sobre el tiempo de carga ultra, la compatibilidad vehicular
 * y el costo asociado a la carga ultra.
 */
public class Estacion_E_Ultra extends Estacion {

    /**
     * Tiempo de carga ultra (en horas) para los vehículos en esta estación.
     */
    private int tiempoCargaUltra;

    /**
     * Tipo de vehículos compatibles con esta estación de carga ultra.
     */
    private String compatibilidadVehicular;

    /**
     * Costo de la carga ultra en la estación.
     */
    private double costoUltra;

    /**
     * Constructor que inicializa una estación de carga ultra con los parámetros proporcionados.
     *
     * @param nombre El nombre de la estación de carga.
     * @param idEstacion El identificador único de la estación de carga.
     * @param ubicacion La ubicación de la estación de carga.
     * @param estado El estado de la estación de carga (por ejemplo, "activa" o "inactiva").
     * @param capacidad La capacidad total de la estación de carga (número de puntos de carga).
     * @param puntoDeCarga El arreglo de puntos de carga disponibles en la estación.
     * @param tiempoCargaUltra El tiempo de carga ultra para los vehículos.
     * @param compatibilidadVehicular Los tipos de vehículos compatibles con esta estación de carga.
     * @param costoUltra El costo de la carga ultra en la estación.
     */
    public Estacion_E_Ultra(String nombre, String idEstacion, String ubicacion, String estado, int capacidad, PuntoDeCarga[] puntoDeCarga, int tiempoCargaUltra, String compatibilidadVehicular, double costoUltra) {
        super(nombre, idEstacion, ubicacion, estado, capacidad, puntoDeCarga);
        this.tiempoCargaUltra = tiempoCargaUltra;
        this.compatibilidadVehicular = compatibilidadVehicular;
        this.costoUltra = costoUltra;
    }

    /**
     * Obtiene el tiempo de carga ultra de la estación.
     *
     * @return El tiempo de carga ultra en horas.
     */
    public int getTiempoCargaUltra() {
        return tiempoCargaUltra;
    }

    /**
     * Establece el tiempo de carga ultra de la estación.
     *
     * @param tiempoCargaUltra El nuevo tiempo de carga ultra en horas.
     */
    public void setTiempoCargaUltra(int tiempoCargaUltra) {
        this.tiempoCargaUltra = tiempoCargaUltra;
    }

    /**
     * Obtiene la compatibilidad vehicular de la estación de carga ultra.
     *
     * @return Una cadena que describe los vehículos compatibles con la estación.
     */
    public String getCompatibilidadVehicular() {
        return compatibilidadVehicular;
    }

    /**
     * Establece la compatibilidad vehicular de la estación de carga ultra.
     *
     * @param compatibilidadVehicular La nueva compatibilidad vehicular para la estación.
     */
    public void setCompatibilidadVehicular(String compatibilidadVehicular) {
        this.compatibilidadVehicular = compatibilidadVehicular;
    }

    /**
     * Obtiene el costo de la carga ultra en la estación.
     *
     * @return El costo de la carga ultra.
     */
    public double getCostoUltra() {
        return costoUltra;
    }

    /**
     * Establece el costo de la carga ultra en la estación.
     *
     * @param costoUltra El nuevo costo de la carga ultra.
     */
    public void setCostoUltra(double costoUltra) {
        this.costoUltra = costoUltra;
    }

    /**
     * Representa a la estación de carga ultra como una cadena de texto, incluyendo
     * la información heredada de {@link Estacion} y los detalles específicos de esta clase.
     *
     * @return Una cadena que describe la estación de carga ultra.
     */
    @Override
    public String toString() {
        return super.toString() +
                "Estacion_E_Ultra{" +
                "tiempoCargaUltra=" + tiempoCargaUltra +
                ", compatibilidadVehicular='" + compatibilidadVehicular + '\'' +
                ", costoUltra=" + costoUltra +
                '}';
    }
}
