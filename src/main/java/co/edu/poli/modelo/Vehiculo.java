package co.edu.poli.modelo;

import java.io.*;
import java.util.*;

/**
 * Clase que representa un vehículo eléctrico con sus características principales.
 */
public class Vehiculo {
    /**
     * Matrícula o placa del vehículo.
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
     * Capacidad total de la batería del vehículo en kilovatios-hora (kWh).
     */
    private int capacidadBateria;

    /**
     * Nivel de carga actual de la batería del vehículo.
     */
    private int cargaBateria;

    /**
     * Estado de la batería del vehículo (por ejemplo: "Buena", "Defectuosa", "Reemplazo requerido").
     */
    private String estadoBateria;

    /**
     * Constructor que inicializa un nuevo vehículo con los detalles proporcionados.
     *
     * @param matricula       Matrícula del vehículo.
     * @param marca           Marca del vehículo.
     * @param modelo          Modelo del vehículo.
     * @param capacidadBateria Capacidad total de la batería en kWh.
     * @param cargaBateria    Nivel actual de carga de la batería.
     * @param estadoBateria   Estado actual de la batería.
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
     * @return Matrícula del vehículo.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Establece la matrícula del vehículo.
     *
     * @param matricula Matrícula del vehículo.
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Obtiene la marca del vehículo.
     *
     * @return Marca del vehículo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del vehículo.
     *
     * @param marca Marca del vehículo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el modelo del vehículo.
     *
     * @return Modelo del vehículo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del vehículo.
     *
     * @param modelo Modelo del vehículo.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtiene la capacidad total de la batería del vehículo.
     *
     * @return Capacidad de la batería en kWh.
     */
    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    /**
     * Establece la capacidad total de la batería del vehículo.
     *
     * @param capacidadBateria Capacidad de la batería en kWh.
     */
    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    /**
     * Obtiene el nivel de carga actual de la batería del vehículo.
     *
     * @return Nivel de carga actual en kWh.
     */
    public int getCargaBateria() {
        return cargaBateria;
    }

    /**
     * Establece el nivel de carga actual de la batería del vehículo.
     *
     * @param cargaBateria Nivel de carga actual en kWh.
     */
    public void setCargaBateria(int cargaBateria) {
        this.cargaBateria = cargaBateria;
    }

    /**
     * Obtiene el estado de la batería del vehículo.
     *
     * @return Estado de la batería.
     */
    public String getEstadoBateria() {
        return estadoBateria;
    }

    /**
     * Establece el estado de la batería del vehículo.
     *
     * @param estadoBateria Estado de la batería.
     */
    public void setEstadoBateria(String estadoBateria) {
        this.estadoBateria = estadoBateria;
    }

    /**
     * Devuelve una representación en formato String del objeto Vehiculo.
     *
     * @return String con los detalles del vehículo.
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
     * Realiza una evaluación del estado general del vehículo (por ejemplo, estado de la batería).
     *
     * @return Resultado de la evaluación del vehículo.
     */
    public String evaluacion() {
        // TODO implementar aquí
        return "";
    }

}
