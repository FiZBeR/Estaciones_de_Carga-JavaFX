package co.edu.poli.servicios;

import co.edu.poli.modelo.Equipo;
import co.edu.poli.modelo.Mantenimiento;

/**
 * Clase que representa un equipo de carga rápida para vehículos eléctricos.
 * Hereda de la clase Equipo.
 */
public class EquipoCargaRapida extends Equipo {
    /**
     * Tiempo estimado de carga en minutos.
     */
    private int tiempoCargaMin;

    /**
     * Tipo de conector utilizado para la carga rápida (por ejemplo, "CHAdeMO", "CCS").
     */
    private String tipoConector;

    /**
     * Nivel de carga soportado por el equipo (por ejemplo, "Alto", "Medio", "Bajo").
     */
    private String nivelCarga;

    /**
     * Constructor que inicializa un nuevo equipo de carga rápida con los detalles proporcionados.
     *
     * @param idEquipo       Identificador del equipo.
     * @param potencia       Potencia del equipo en kilovatios (kW).
     * @param tipo           Tipo de equipo.
     * @param mantenimiento  Lista de mantenimientos realizados en el equipo.
     * @param tiempoCargaMin Tiempo estimado de carga en minutos.
     * @param tipoConector   Tipo de conector del equipo.
     * @param nivelCarga     Nivel de carga soportado por el equipo.
     */
    public EquipoCargaRapida(String idEquipo, double potencia, String tipo, Mantenimiento[] mantenimiento, int tiempoCargaMin, String tipoConector, String nivelCarga) {
        super(idEquipo, potencia, tipo, mantenimiento);
        this.tiempoCargaMin = tiempoCargaMin;
        this.tipoConector = tipoConector;
        this.nivelCarga = nivelCarga;
    }

    /**
     * Obtiene el tiempo estimado de carga en minutos.
     *
     * @return Tiempo de carga en minutos.
     */
    public int getTiempoCargaMin() {
        return tiempoCargaMin;
    }

    /**
     * Establece el tiempo estimado de carga en minutos.
     *
     * @param tiempoCargaMin Tiempo de carga en minutos.
     */
    public void setTiempoCargaMin(int tiempoCargaMin) {
        this.tiempoCargaMin = tiempoCargaMin;
    }

    /**
     * Obtiene el tipo de conector utilizado por el equipo de carga rápida.
     *
     * @return Tipo de conector.
     */
    public String getTipoConector() {
        return tipoConector;
    }

    /**
     * Establece el tipo de conector utilizado por el equipo de carga rápida.
     *
     * @param tipoConector Tipo de conector.
     */
    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

    /**
     * Obtiene el nivel de carga soportado por el equipo de carga rápida.
     *
     * @return Nivel de carga.
     */
    public String getNivelCarga() {
        return nivelCarga;
    }

    /**
     * Establece el nivel de carga soportado por el equipo de carga rápida.
     *
     * @param nivelCarga Nivel de carga.
     */
    public void setNivelCarga(String nivelCarga) {
        this.nivelCarga = nivelCarga;
    }

    /**
     * Devuelve una representación en formato String del objeto EquipoCargaRapida.
     *
     * @return String con los detalles del equipo de carga rápida.
     */
    @Override
    public String toString() {
        return "EquipoCargaRapida{" +
                "tiempoCargaMin=" + tiempoCargaMin +
                ", tipoConector='" + tipoConector + '\'' +
                ", nivelCarga='" + nivelCarga + '\'' +
                '}';
    }

    /**
     * Verifica si el equipo de carga rápida requiere mantenimiento.
     *
     * @return true si se requiere mantenimiento, false en caso contrario.
     */
    public boolean requiereMantenimiento() {
        // TODO implementar aquí la lógica de verificación de mantenimiento.
        return "".isEmpty(); // Lógica provisional.
    }

    /**
     * Método abstracto que podría ser sobreescrito por subclases si es necesario.
     */
    public void abstracta() {
        // Este método puede ser sobreescrito en subclases si se requiere una funcionalidad específica.
    }

}
