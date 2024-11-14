package co.edu.poli.vista;

import co.edu.poli.modelo.Estacion;
import java.io.*;
import java.util.*;

/**
 * Interfaz que define las operaciones básicas para manejar estaciones de carga, incluyendo
 * las operaciones CRUD (Crear, Leer, Actualizar, Eliminar) y métodos para la serialización
 * y deserialización de estaciones de carga.
 */
public interface Operacion {

    /**
     * Crea una nueva estación de carga.
     *
     * @param x La estación de carga que se desea crear.
     * @return Un mensaje que indica si la estación fue guardada correctamente.
     */
    public String create(Estacion x);

    /**
     * Lee una estación de carga a partir de su identificador único.
     *
     * @param id_estacion El ID de la estación que se desea leer.
     * @return La estación de carga correspondiente al ID proporcionado, o null si no se encuentra.
     */
    public Estacion read(String id_estacion);

    /**
     * Devuelve todas las estaciones de carga almacenadas.
     *
     * @return Un arreglo de todas las estaciones de carga.
     */
    public Estacion[] readAll();

    /**
     * Actualiza los datos de una estación de carga existente.
     *
     * @param id_estacion El ID de la estación que se desea actualizar.
     * @param x La nueva estación de carga con los datos actualizados.
     * @return Un mensaje que indica si la estación fue actualizada correctamente.
     */
    public String update(String id_estacion, Estacion x);

    /**
     * Elimina una estación de carga a partir de su identificador único.
     *
     * @param id_estacion El ID de la estación que se desea eliminar.
     * @return La estación de carga eliminada, o null si no se encuentra.
     */
    public Estacion delete(String id_estacion);

    /**
     * Serializa el arreglo de estaciones de carga y lo guarda en un archivo.
     *
     * @param estacion El arreglo de estaciones de carga que se desea serializar.
     * @param path La ruta del archivo donde se almacenará el archivo serializado.
     * @param name El nombre del archivo donde se guardarán las estaciones.
     * @return Un mensaje indicando si la serialización fue exitosa.
     */
    public String serializar(Estacion[] estacion, String path, String name);

    /**
     * Deserializa un archivo y lo convierte en un arreglo de estaciones de carga.
     *
     * @param path La ruta donde se encuentra el archivo serializado.
     * @param name El nombre del archivo que se desea deserializar.
     * @return Un arreglo de estaciones de carga deserializado, o null si ocurre un error.
     */
    public Estacion[] deserializar(String path, String name);

}
