package co.edu.poli.modelo;

import java.io.*;
import java.util.*;

/**
 * Clase abstracta que representa un Equipo.
 */
public abstract class Equipo {

    /**
     * Identificador único del equipo.
     */
    private String idEquipo;

    /**
     * Potencia del equipo.
     */
    private double potencia;

    /**
     * Tipo de equipo.
     */
    private String tipo;

    /**
     * Lista de mantenimientos asociados al equipo.
     */
    private Mantenimiento [ ] mantenimiento;

    /**
     * Constructor para crear un nuevo equipo.
     *
     * @param idEquipo     Identificador único del equipo.
     * @param potencia     Potencia del equipo.
     * @param tipo         Tipo de equipo.
     * @param mantenimiento Lista de mantenimientos asociados al equipo.
     */
    public Equipo(String idEquipo, double potencia, String tipo, Mantenimiento[] mantenimiento) {
        this.idEquipo = idEquipo;
        this.potencia = potencia;
        this.tipo = tipo;
        this.mantenimiento = mantenimiento;
    }

    /**
     * Obtiene el identificador del equipo.
     *
     * @return Identificador del equipo.
     */
    public String getIdEquipo() {
        return idEquipo;
    }

    /**
     * Establece el identificador del equipo.
     *
     * @param idEquipo Identificador único del equipo.
     */
    public void setIdEquipo(String idEquipo) {
        this.idEquipo = idEquipo;
    }

    /**
     * Obtiene la potencia del equipo.
     *
     * @return Potencia del equipo.
     */
    public double getPotencia() {
        return potencia;
    }

    /**
     * Establece la potencia del equipo.
     *
     * @param potencia Potencia del equipo.
     */
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    /**
     * Obtiene el tipo de equipo.
     *
     * @return Tipo de equipo.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de equipo.
     *
     * @param tipo Tipo de equipo.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene la lista de mantenimientos del equipo.
     *
     * @return Array de mantenimientos del equipo.
     */
    public Mantenimiento[] getMantenimiento() {
        return mantenimiento;
    }

    /**
     * Establece la lista de mantenimientos del equipo.
     *
     * @param mantenimiento Array de mantenimientos asociados al equipo.
     */
    public void setMantenimiento(Mantenimiento[] mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    /**
     * Devuelve una representación en formato String del objeto Equipo.
     *
     * @return String con los atributos del equipo.
     */
    @Override
    public String toString() {
        return "Equipo{" +
                "idEquipo='" + idEquipo + '\'' +
                ", potencia=" + potencia +
                ", tipo='" + tipo + '\'' +
                ", mantenimiento=" + Arrays.toString(mantenimiento) +
                '}';
    }

    /**
     * Verifica si el equipo requiere mantenimiento.
     *
     * @return {@code true} si el equipo requiere mantenimiento; {@code false} en caso contrario.
     */
    public boolean requiereMantenimiento() {
        // TODO implement here
        return false;
    }

    /**
     * Realiza una operación con un parámetro entero.
     *
     * @param a Valor entero con el que se realiza la operación.
     * @return Resultado de la operación como entero.
     */
    protected int Operation1(int a) {
        // TODO implement here
        return 0;
    }

    /**
     * Realiza una operación con un parámetro de tipo double.
     *
     * @param a Valor double con el que se realiza la operación.
     * @return Resultado de la operación como double.
     */
    protected double Operation2(double a) {
        // TODO implement here
        return 0.0d;
    }

    /**
     * Método abstracto que debe ser implementado por las subclases.
     */
    public abstract void abstracta();

}