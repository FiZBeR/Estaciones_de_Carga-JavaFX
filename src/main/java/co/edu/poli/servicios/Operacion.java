package co.edu.poli.servicios;

import co.edu.poli.modelo.Estacion;

import java.io.*;
import java.util.*;

/**
 * Interfaz que define las operaciones básicas para manejar objetos de tipo Estacion.
 * Incluye operaciones para crear, leer, actualizar, eliminar, serializar y deserializar Estacions.
 */
public interface Operacion {

    /**
     * Crea un nuevo objeto Estacion.
     *
     * @param x Objeto Estacion a crear.
     * @return Mensaje que indica el resultado de la operación.
     */
    public String create(Estacion x);

    /**
     * Lee un objeto Estacion basado en su identificador.
     *
     * @param id_estacion Identificador de la estacion a buscar.
     * @return El objeto Estacion encontrado o null si no existe.
     */
    public Estacion read(String id_estacion);

    /**
     * Lee todos los objetos Estacion almacenados.
     *
     * @return Arreglo de objetos Estacion.
     */
    public Estacion[] readall();

    /**
     * Actualiza un objeto Estacion existente basado en su identificador.
     *
     * @param x Objeto Estacion con los nuevos datos.
     * @param id_Estacion Identificador del Estacion a actualizar.
     * @return Mensaje que indica el resultado de la operación.
     */
    public String update(Estacion x, String id_Estacion);

    /**
     * Elimina un objeto Estacion basado en su identificador.
     *
     * @param id_Estacion Identificador del Estacion a eliminar.
     * @return El objeto Estacion eliminado o null si no existe.
     */
    public Estacion delete(String id_Estacion);

    /**
     * Serializa un arreglo de objetos Estacion a un archivo.
     *
     * @param Estacion Arreglo de objetos Estacion a serializar.
     * @param path Ruta donde se guardará el archivo.
     * @param name Nombre del archivo a crear.
     * @return Mensaje que indica el resultado de la operación.
     */
    public String serializar(Estacion[] Estacion, String path, String name);

    /**
     * Deserializa un arreglo de objetos Estacion desde un archivo.
     *
     * @param path Ruta del archivo a leer.
     * @param name Nombre del archivo a leer.
     * @return Arreglo de objetos Estacion deserializados.
     */
    public Estacion[] deserializar(String path, String name);

}
