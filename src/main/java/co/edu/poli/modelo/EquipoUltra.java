package co.edu.poli.modelo;

import java.io.*;
import java.util.*;

/**
 * Clase que representa un equipo de carga ultra rápida con características
 * avanzadas como sistema de enfriamiento y protección contra sobrecargas.
 */
public class EquipoUltra {

    /**
     * Identificación única del equipo de carga ultra rápida.
     */
    private String idEquipo;

    /**
     * Potencia nominal del equipo en unidades de energía.
     */
    private double potencia;

    /**
     * Tipo de equipo de carga ultra rápida, como carga DC o AC.
     */
    private String tipo;

    /**
     * Voltaje máximo soportado por el equipo.
     */
    private double voltajeMax;

    /**
     * Sistema de enfriamiento utilizado en el equipo, como "líquido" o "aire".
     */
    private String sistemaDeEnfriamiento;

    /**
     * Capacidad máxima de batería que el equipo puede cargar.
     */
    private double capacidadBateriaMax;

    /**
     * Sistema de protección contra sobrecargas del equipo.
     */
    private String proteccionSobrecarga;

    /**
     * Array que almacena los mantenimientos realizados en el equipo.
     */
    private Mantenimiento[] mantenimiento;

    /**
     * Constructor para inicializar un objeto de tipo EquipoUltra con los datos especificados.
     *
     * @param idEquipo             Identificación única del equipo de carga ultra rápida.
     * @param potencia             Potencia nominal del equipo.
     * @param tipo                 Tipo del equipo de carga ultra rápida.
     * @param voltajeMax           Voltaje máximo soportado.
     * @param sistemaDeEnfriamiento Sistema de enfriamiento del equipo.
     * @param capacidadBateriaMax  Capacidad máxima de batería que puede cargar.
     * @param proteccionSobrecarga Sistema de protección contra sobrecargas.
     * @param mantenimiento        Historial de mantenimientos asociados al equipo.
     */
    public EquipoUltra(String idEquipo, double potencia, String tipo, double voltajeMax, String sistemaDeEnfriamiento, double capacidadBateriaMax, String proteccionSobrecarga, Mantenimiento[] mantenimiento) {
        this.idEquipo = idEquipo;
        this.potencia = potencia;
        this.tipo = tipo;
        this.voltajeMax = voltajeMax;
        this.sistemaDeEnfriamiento = sistemaDeEnfriamiento;
        this.capacidadBateriaMax = capacidadBateriaMax;
        this.proteccionSobrecarga = proteccionSobrecarga;
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
     * Obtiene el voltaje máximo soportado por el equipo.
     *
     * @return Voltaje máximo del equipo.
     */
    public double getVoltajeMax() {
        return voltajeMax;
    }

    /**
     * Establece el voltaje máximo soportado por el equipo.
     *
     * @param voltajeMax Nuevo voltaje máximo.
     */
    public void setVoltajeMax(double voltajeMax) {
        this.voltajeMax = voltajeMax;
    }

    /**
     * Obtiene el sistema de enfriamiento del equipo.
     *
     * @return Sistema de enfriamiento del equipo.
     */
    public String getSistemaDeEnfriamiento() {
        return sistemaDeEnfriamiento;
    }

    /**
     * Establece el sistema de enfriamiento del equipo.
     *
     * @param sistemaDeEnfriamiento Nuevo sistema de enfriamiento.
     */
    public void setSistemaDeEnfriamiento(String sistemaDeEnfriamiento) {
        this.sistemaDeEnfriamiento = sistemaDeEnfriamiento;
    }

    /**
     * Obtiene la capacidad máxima de batería que el equipo puede cargar.
     *
     * @return Capacidad máxima de batería.
     */
    public double getCapacidadBateriaMax() {
        return capacidadBateriaMax;
    }

    /**
     * Establece la capacidad máxima de batería que el equipo puede cargar.
     *
     * @param capacidadBateriaMax Nueva capacidad máxima de batería.
     */
    public void setCapacidadBateriaMax(double capacidadBateriaMax) {
        this.capacidadBateriaMax = capacidadBateriaMax;
    }

    /**
     * Obtiene el sistema de protección contra sobrecargas del equipo.
     *
     * @return Protección contra sobrecargas.
     */
    public String getProteccionSobrecarga() {
        return proteccionSobrecarga;
    }

    /**
     * Establece el sistema de protección contra sobrecargas del equipo.
     *
     * @param proteccionSobrecarga Nueva protección contra sobrecargas.
     */
    public void setProteccionSobrecarga(String proteccionSobrecarga) {
        this.proteccionSobrecarga = proteccionSobrecarga;
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
     * Retorna una representación en forma de cadena del equipo de carga ultra rápida, incluyendo sus atributos.
     *
     * @return Representación en cadena del equipo de carga ultra rápida.
     */
    @Override
    public String toString() {
        return "EquipoUltra{" +
                "idEquipo='" + idEquipo + '\'' +
                ", potencia=" + potencia +
                ", tipo='" + tipo + '\'' +
                ", voltajeMax=" + voltajeMax +
                ", sistemaDeEnfriamiento='" + sistemaDeEnfriamiento + '\'' +
                ", capacidadBateriaMax=" + capacidadBateriaMax +
                ", proteccionSobrecarga='" + proteccionSobrecarga + '\'' +
                ", mantenimiento=" + Arrays.toString(mantenimiento) +
                '}';
    }

    /**
     * Verifica si el equipo de carga ultra rápida requiere mantenimiento.
     *
     * @return {@code true} si el equipo requiere mantenimiento; {@code false} en caso contrario.
     */
    public boolean requiereMantenimiento() {
        // TODO: Implementar lógica de verificación de mantenimiento
        return false;
    }

}
