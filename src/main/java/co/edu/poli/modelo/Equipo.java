package co.edu.poli.modelo;

import java.io.*;
import java.util.*;

/**
 * Clase que representa un equipo de carga con atributos como
 * identificación, potencia, tipo y un historial de mantenimiento.
 */
public class Equipo {

    /**
     * Identificación única del equipo.
     */
    private String idEquipo;

    /**
     * Potencia nominal del equipo en unidades de energía.
     */
    private double potencia;

    /**
     * Tipo de equipo, por ejemplo, CSS o CHADEMO.
     */
    private String tipo;

    /**
     * Array que almacena los mantenimientos realizados en el equipo.
     */
    private Mantenimiento[] mantenimiento;

    /**
     * Constructor para inicializar un objeto de tipo Equipo con los datos especificados.
     *
     * @param idEquipo       Identificación única del equipo.
     * @param potencia       Potencia nominal del equipo.
     * @param tipo           Tipo de equipo.
     * @param mantenimiento  Historial de mantenimientos asociados al equipo.
     */
    public Equipo(String idEquipo, double potencia, String tipo, Mantenimiento[] mantenimiento) {
        this.idEquipo = idEquipo;
        this.potencia = potencia;
        this.tipo = tipo;
        this.mantenimiento = mantenimiento;
    }

    /**
     * Obtiene la identificación del equipo.
     *
     * @return Identificación del equipo.
     */
    public String getIdEquipo() {
        return idEquipo;
    }

    /**
     * Establece la identificación del equipo.
     *
     * @param idEquipo Nueva identificación del equipo.
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
     * @param potencia Nueva potencia del equipo.
     */
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    /**
     * Obtiene el tipo de equipo.
     *
     * @return Tipo del equipo.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de equipo.
     *
     * @param tipo Nuevo tipo del equipo.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene el historial de mantenimientos del equipo.
     *
     * @return Array de mantenimientos del equipo.
     */
    public Mantenimiento[] getMantenimiento() {
        return mantenimiento;
    }

    /**
     * Establece el historial de mantenimientos del equipo.
     *
     * @param mantenimiento Nuevo historial de mantenimientos.
     */
    public void setMantenimiento(Mantenimiento[] mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    /**
     * Retorna una representación en forma de cadena del equipo, incluyendo sus atributos.
     *
     * @return Representación en cadena del equipo.
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
        // TODO: Implementar lógica de verificación de mantenimiento
        return false;
    }
}
