package co.edu.poli.vista;

import co.edu.poli.modelo.Estacion;
import java.io.*;
import java.util.*;

/**
 * Implementa las operaciones CRUD (Crear, Leer, Actualizar, Eliminar) y métodos de serialización y deserialización para la clase {@link Estacion}.
 * Esta clase permite manipular un arreglo de estaciones de carga de tipo {@link Estacion}.
 */
public class ImplementacionOperacion implements Operacion {

    /**
     * Arreglo de estaciones de carga.
     * Este arreglo almacenará las estaciones de carga agregadas.
     */
    private Estacion[] Estacion;

    /**
     * Constructor por defecto que inicializa el arreglo de estaciones con una capacidad inicial de 1.
     */
    public ImplementacionOperacion() {
        Estacion = new Estacion[1];
    }

    /**
     * Establece el arreglo de estaciones de carga.
     *
     * @param Estacion El nuevo arreglo de estaciones de carga a utilizar.
     */
    public void setEstacion(Estacion[] Estacion) {
        this.Estacion = Estacion;
    }

    public co.edu.poli.modelo.Estacion[] getEstacion() {
        return Estacion;
    }

    /**
     * Crea una nueva estación de carga y la agrega al arreglo de estaciones.
     * Si el arreglo está lleno, su tamaño se duplica para permitir más estaciones.
     *
     * @param x La estación de carga a crear.
     * @return Un mensaje indicando si la estación fue guardada correctamente.
     */
    public String create(Estacion x) {
        // Busca el primer espacio vacío en el arreglo
        for (int i = 0; i < Estacion.length; i++) {
            if (Estacion[i] == null) {
                Estacion[i] = x;
                return "Save!"; // Estación guardada
            }
        }
        // Si el arreglo está lleno, se crea un nuevo arreglo con el doble de capacidad
        Estacion[] Estacionaux = new Estacion[Estacion.length * 2];
        System.arraycopy(Estacion, 0, Estacionaux, 0, Estacion.length);
        Estacionaux[Estacion.length] = x;
        Estacion = Estacionaux; // Se asigna el nuevo arreglo
        return "Save!!"; // Estación guardada después de aumentar la capacidad
    }

    /**
     * Lee una estación de carga a partir de su ID.
     *
     * @param id_Estacion El identificador único de la estación que se desea leer.
     * @return La estación de carga encontrada, o null si no se encuentra.
     */
    public Estacion read(String id_Estacion) {
        // Busca la estación con el ID proporcionado
        for (int i = 0; i < Estacion.length; i++) {
            if (Estacion[i] != null && Estacion[i].getIdEstacion().equals(id_Estacion)) {
                return Estacion[i]; // Estación encontrada
            }
        }
        return null; // Estación no encontrada
    }

    /**
     * Devuelve todas las estaciones de carga almacenadas.
     *
     * @return Un arreglo de todas las estaciones de carga.
     */
    public Estacion[] readAll() {
        return Estacion; // Retorna el arreglo de estaciones
    }

    /**
     * Actualiza una estación de carga existente con los nuevos datos.
     *
     * @param id_estacion El ID de la estación que se desea actualizar.
     * @param x La nueva estación de carga con los datos actualizados.
     * @return Un mensaje indicando si la estación fue actualizada correctamente.
     */
    public String update(String id_estacion, Estacion x) {
        // Busca la estación con el ID proporcionado
        for (int i = 0; i < Estacion.length; i++) {
            if (Estacion[i] != null && Estacion[i].getIdEstacion().equals(id_estacion)) {
                Estacion[i] = x; // Se actualiza la estación
                return "Update!"; // Estación actualizada
            }
        }
        return "Cod is not in the array!"; // Si no se encuentra la estación
    }

    /**
     * Elimina una estación de carga a partir de su ID.
     *
     * @param id_estacion El ID de la estación que se desea eliminar.
     * @return La estación eliminada, o null si no se encuentra.
     */
    public Estacion delete(String id_estacion) {
        Estacion temp = null;
        // Busca la estación con el ID proporcionado
        for (int i = 0; i < Estacion.length; i++) {
            if (Estacion[i] != null && Estacion[i].getIdEstacion().equals(id_estacion)) {
                temp = Estacion[i]; // Se guarda la estación eliminada
                Estacion[i] = null; // Se elimina la estación
                return temp; // Se retorna la estación eliminada
            }
        }
        return temp; // Si no se encuentra la estación
    }

    /**
     * Serializa el arreglo de estaciones de carga y lo guarda en un archivo.
     *
     * @param estacion El arreglo de estaciones de carga a serializar.
     * @param path La ruta donde se guardará el archivo.
     * @param name El nombre del archivo.
     * @return Un mensaje indicando si la serialización fue exitosa.
     */
    public String serializar(Estacion[] estacion, String path, String name) {
        try {
            FileOutputStream fos = new FileOutputStream(path + name);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Estacion); // Se escribe el arreglo en el archivo
            oos.close();
            fos.close();
            return "File create!!"; // Archivo creado con éxito
        } catch (IOException ioe) {
            return "Error file " + ioe.getMessage(); // Si ocurre un error durante la serialización
        }
    }

    /**
     * Deserializa un archivo de estaciones de carga y lo convierte en un arreglo.
     *
     * @param path La ruta donde se encuentra el archivo.
     * @param name El nombre del archivo a deserializar.
     * @return Un arreglo de estaciones de carga deserializado, o null si ocurre un error.
     */
    public Estacion[] deserializar(String path, String name) {
        Estacion[] a = null;
        try {
            FileInputStream fis = new FileInputStream(path + name);
            ObjectInputStream ois = new ObjectInputStream(fis);
            a = (Estacion[]) ois.readObject(); // Se lee el arreglo del archivo
            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace(); // Si ocurre un error durante la deserialización
        } catch (ClassNotFoundException c) {
            c.printStackTrace(); // Si no se encuentra la clase
        }
        return a; // Retorna el arreglo deserializado
    }

}
