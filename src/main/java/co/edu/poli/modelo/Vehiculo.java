package co.edu.poli.modelo;

import java.io.*;
import java.util.*;

/**
 * Representa un vehículo eléctrico con información sobre su matrícula, marca, modelo,
 * capacidad de batería, carga de batería y el estado de la batería.
 */
public class Vehiculo {

    /**
     * Matrícula del vehículo, un identificador único asociado al vehículo.
     */
    private String matricula;

    /**
     * Marca del vehículo.
     */
    private String marca;

    /**
     * Modelo del vehículo.
     */
    private String modelo;

    /**
     * Capacidad total de la batería del vehículo (en kWh).
     */
    private int capacidadBateria;

    /**
     * Carga actual de la batería del vehículo (en kWh).
     */
    private int cargaBateria;

    /**
     * Estado de la batería del vehículo, por ejemplo, "cargada", "baja", "en espera".
     */
    private String estadoBateria;

    /**
     * Constructor que inicializa un vehículo con su matrícula, marca, modelo, capacidad de batería,
     * carga de batería y estado de la batería.
     *
     * @param matricula Matrícula única del vehículo.
     * @param marca Marca del vehículo.
     * @param modelo Modelo del vehículo.
     * @param capacidadBateria Capacidad total de la batería del vehículo.
     * @param cargaBateria Carga actual de la batería del vehículo.
     * @param estadoBateria Estado actual de la batería del vehículo.
     */
    public Vehiculo(String matricula, String marca, String modelo, int capacidadBateria, int cargaBateria, String estadoBateria) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadBateria = capacidadBateria;
        this.cargaBateria = cargaBateria;
        this.estadoBateria = estadoBateria;
    }

    /**
     * Obtiene la matrícula del vehículo.
     *
     * @return La matrícula del vehículo.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Establece la matrícula del vehículo.
     *
     * @param matricula La nueva matrícula del vehículo.
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Obtiene la marca del vehículo.
     *
     * @return La marca del vehículo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del vehículo.
     *
     * @param marca La nueva marca del vehículo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el modelo del vehículo.
     *
     * @return El modelo del vehículo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del vehículo.
     *
     * @param modelo El nuevo modelo del vehículo.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtiene la capacidad total de la batería del vehículo.
     *
     * @return La capacidad de la batería (en kWh).
     */
    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    /**
     * Establece la capacidad de la batería del vehículo.
     *
     * @param capacidadBateria La nueva capacidad de la batería (en kWh).
     */
    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    /**
     * Obtiene la carga actual de la batería del vehículo.
     *
     * @return La carga de la batería (en kWh).
     */
    public int getCargaBateria() {
        return cargaBateria;
    }

    /**
     * Establece la carga actual de la batería del vehículo.
     *
     * @param cargaBateria La nueva carga de la batería (en kWh).
     */
    public void setCargaBateria(int cargaBateria) {
        this.cargaBateria = cargaBateria;
    }

    /**
     * Obtiene el estado actual de la batería del vehículo.
     *
     * @return El estado de la batería, como una cadena de texto (por ejemplo, "cargada", "baja", "en espera").
     */
    public String getEstadoBateria() {
        return estadoBateria;
    }

    /**
     * Establece el estado actual de la batería del vehículo.
     *
     * @param estadoBateria El nuevo estado de la batería.
     */
    public void setEstadoBateria(String estadoBateria) {
        this.estadoBateria = estadoBateria;
    }

    /**
     * Representa al vehículo como una cadena de texto.
     *
     * @return Una cadena que describe el vehículo y sus atributos.
     */
    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadBateria=" + capacidadBateria +
                ", cargaBateria=" + cargaBateria +
                ", estadoBateria='" + estadoBateria + '\'' +
                '}';
    }

    /**
     * Método para evaluar el estado del vehículo.
     *
     * @return Una cadena de texto con la evaluación (aún no implementada).
     */
    public String evaluacion() {
        // TODO implement here
        return "";
    }
}
