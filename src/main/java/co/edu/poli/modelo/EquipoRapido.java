package co.edu.poli.modelo;

import java.io.*;
import java.util.*;

/**
 * Clase que representa un equipo de carga rápida con atributos adicionales
 * como tiempo de carga y tipo de conector, además de un historial de mantenimientos.
 */
public class EquipoRapido {

    /**
     * Identificación única del equipo de carga rápida.
     */
    private String idEquipo;

    /**
     * Potencia nominal del equipo en unidades de energía.
     */
    private double potencia;

    /**
     * Tipo de equipo de carga rápida, por ejemplo, DC o AC.
     */
    private String tipo;

    /**
     * Tiempo estimado para una carga completa en minutos.
     */
    private int tiempoCarga;

    /**
     * Tipo de conector utilizado por el equipo, como CSS o CHADEMO.
     */
    private String tipoConector;

    /**
     * Array que almacena los mantenimientos realizados en el equipo.
     */
    private Mantenimiento[] mantenimiento;

    /**
     * Constructor para inicializar un objeto de tipo EquipoRapido con los datos especificados.
     *
     * @param idEquipo      Identificación única del equipo de carga rápida.
     * @param potencia      Potencia nominal del equipo.
     * @param tipo          Tipo del equipo de carga rápida.
     * @param tiempoCarga   Tiempo estimado para una carga completa.
     * @param tipoConector  Tipo de conector utilizado.
     * @param mantenimiento Historial de mantenimientos asociados al equipo.
     */
    public EquipoRapido(String idEquipo, double potencia, String tipo, int tiempoCarga, String tipoConector, Mantenimiento[] mantenimiento) {
        this.idEquipo = idEquipo;
        this.potencia = potencia;
        this.tipo = tipo;
        this.tiempoCarga = tiempoCarga;
        this.tipoConector = tipoConector;
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
     * Obtiene el tiempo de carga estimado del equipo.
     *
     * @return Tiempo de carga en minutos.
     */
    public int getTiempoCarga() {
        return tiempoCarga;
    }

    /**
     * Establece el tiempo de carga estimado del equipo.
     *
     * @param tiempoCarga Nuevo tiempo de carga en minutos.
     */
    public void setTiempoCarga(int tiempoCarga) {
        this.tiempoCarga = tiempoCarga;
    }

    /**
     * Obtiene el tipo de conector del equipo.
     *
     * @return Tipo de conector del equipo.
     */
    public String getTipoConector() {
        return tipoConector;
    }

    /**
     * Establece el tipo de conector del equipo.
     *
     * @param tipoConector Nuevo tipo de conector.
     */
    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
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
     * Retorna una representación en forma de cadena del equipo de carga rápida, incluyendo sus atributos.
     *
     * @return Representación en cadena del equipo de carga rápida.
     */
    @Override
    public String toString() {
        return "EquipoRapido{" +
                "idEquipo='" + idEquipo + '\'' +
                ", potencia=" + potencia +
                ", tipo='" + tipo + '\'' +
                ", tiempoCarga=" + tiempoCarga +
                ", tipoConector='" + tipoConector + '\'' +
                ", mantenimiento=" + Arrays.toString(mantenimiento) +
                '}';
    }

    /**
     * Verifica si el equipo de carga rápida requiere mantenimiento.
     *
     * @return {@code true} si el equipo requiere mantenimiento; {@code false} en caso contrario.
     */
    public boolean requiereMantenimiento() {
        // TODO: Implementar lógica de verificación de mantenimiento
        return false;
    }

}
