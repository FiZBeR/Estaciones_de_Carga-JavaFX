package co.edu.poli.servicios;

import co.edu.poli.modelo.Mantenimiento;

import java.io.*;
import java.util.*;

/**
 * Clase que representa un equipo de carga ultra rápida para vehículos eléctricos.
 * Hereda de la clase EquipoCargaRapida.
 */
public class EquipoCargaUltraRapida extends EquipoCargaRapida {

    /**
     * Sistema de enfriamiento del equipo (por ejemplo, tipo de refrigeración utilizada).
     */
    private int sistemaEnfriamiento;

    /**
     * Capacidad máxima de batería que el equipo puede manejar en kilovatios hora (kWh).
     */
    private double capacidadBateriaMaxima;

    /**
     * Voltaje máximo que el equipo puede soportar.
     */
    private double voltajeMaximo;

    /**
     * Indica si el equipo tiene protección contra sobrecargas.
     */
    private boolean proteccionSobrecarga;

    /**
     * Tiempo estimado de carga ultra rápida en minutos.
     */
    private int tiempoCargaUltraRapidaMin;

    /**
     * Constructor que inicializa un nuevo equipo de carga ultra rápida con los detalles proporcionados.
     *
     * @param idEquipo                   Identificador del equipo.
     * @param potencia                   Potencia del equipo en kilovatios (kW).
     * @param tipo                       Tipo de equipo.
     * @param mantenimiento              Lista de mantenimientos realizados en el equipo.
     * @param tiempoCargaMin             Tiempo estimado de carga en minutos.
     * @param tipoConector               Tipo de conector del equipo.
     * @param nivelCarga                 Nivel de carga soportado por el equipo.
     * @param sistemaEnfriamiento        Tipo de sistema de enfriamiento utilizado.
     * @param capacidadBateriaMaxima    Capacidad máxima de batería que el equipo puede manejar.
     * @param voltajeMaximo             Voltaje máximo que el equipo puede soportar.
     * @param proteccionSobrecarga       Indica si el equipo tiene protección contra sobrecargas.
     * @param tiempoCargaUltraRapidaMin Tiempo estimado de carga ultra rápida en minutos.
     */
    public EquipoCargaUltraRapida(String idEquipo, double potencia, String tipo, Mantenimiento[] mantenimiento,
                                  int tiempoCargaMin, String tipoConector, String nivelCarga, int sistemaEnfriamiento,
                                  double capacidadBateriaMaxima, double voltajeMaximo, boolean proteccionSobrecarga,
                                  int tiempoCargaUltraRapidaMin) {
        super(idEquipo, potencia, tipo, mantenimiento, tiempoCargaMin, tipoConector, nivelCarga);
        this.sistemaEnfriamiento = sistemaEnfriamiento;
        this.capacidadBateriaMaxima = capacidadBateriaMaxima;
        this.voltajeMaximo = voltajeMaximo;
        this.proteccionSobrecarga = proteccionSobrecarga;
        this.tiempoCargaUltraRapidaMin = tiempoCargaUltraRapidaMin;
    }

    /**
     * Obtiene el tipo de sistema de enfriamiento utilizado por el equipo.
     *
     * @return Sistema de enfriamiento.
     */
    public int getSistemaEnfriamiento() {
        return sistemaEnfriamiento;
    }

    /**
     * Establece el tipo de sistema de enfriamiento utilizado por el equipo.
     *
     * @param sistemaEnfriamiento Tipo de sistema de enfriamiento.
     */
    public void setSistemaEnfriamiento(int sistemaEnfriamiento) {
        this.sistemaEnfriamiento = sistemaEnfriamiento;
    }

    /**
     * Obtiene la capacidad máxima de batería que el equipo puede manejar.
     *
     * @return Capacidad de batería máxima en kWh.
     */
    public double getCapacidadBateriaMaxima() {
        return capacidadBateriaMaxima;
    }

    /**
     * Establece la capacidad máxima de batería que el equipo puede manejar.
     *
     * @param capacidadBateriaMaxima Capacidad de batería máxima en kWh.
     */
    public void setCapacidadBateriaMaxima(double capacidadBateriaMaxima) {
        this.capacidadBateriaMaxima = capacidadBateriaMaxima;
    }

    /**
     * Obtiene el voltaje máximo que el equipo puede soportar.
     *
     * @return Voltaje máximo en voltios.
     */
    public double getVoltajeMaximo() {
        return voltajeMaximo;
    }

    /**
     * Establece el voltaje máximo que el equipo puede soportar.
     *
     * @param voltajeMaximo Voltaje máximo en voltios.
     */
    public void setVoltajeMaximo(double voltajeMaximo) {
        this.voltajeMaximo = voltajeMaximo;
    }

    /**
     * Verifica si el equipo tiene protección contra sobrecargas.
     *
     * @return true si tiene protección contra sobrecargas, false en caso contrario.
     */
    public boolean isProteccionSobrecarga() {
        return proteccionSobrecarga;
    }

    /**
     * Establece si el equipo tiene protección contra sobrecargas.
     *
     * @param proteccionSobrecarga Indica si el equipo tiene protección contra sobrecargas.
     */
    public void setProteccionSobrecarga(boolean proteccionSobrecarga) {
        this.proteccionSobrecarga = proteccionSobrecarga;
    }

    /**
     * Obtiene el tiempo estimado de carga ultra rápida en minutos.
     *
     * @return Tiempo de carga ultra rápida en minutos.
     */
    public int getTiempoCargaUltraRapidaMin() {
        return tiempoCargaUltraRapidaMin;
    }

    /**
     * Establece el tiempo estimado de carga ultra rápida en minutos.
     *
     * @param tiempoCargaUltraRapidaMin Tiempo de carga ultra rápida en minutos.
     */
    public void setTiempoCargaUltraRapidaMin(int tiempoCargaUltraRapidaMin) {
        this.tiempoCargaUltraRapidaMin = tiempoCargaUltraRapidaMin;
    }

    /**
     * Devuelve una representación en formato String del objeto EquipoCargaUltraRapida.
     *
     * @return String con los detalles del equipo de carga ultra rápida.
     */
    @Override
    public String toString() {
        return "EquipoCargaUltraRapida{" +
                "sistemaEnfriamiento=" + sistemaEnfriamiento +
                ", capacidadBateriaMaxima=" + capacidadBateriaMaxima +
                ", voltajeMaximo=" + voltajeMaximo +
                ", proteccionSobrecarga=" + proteccionSobrecarga +
                ", tiempoCargaUltraRapidaMin=" + tiempoCargaUltraRapidaMin +
                '}';
    }
}
