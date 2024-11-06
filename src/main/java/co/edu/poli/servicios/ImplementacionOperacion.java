package co.edu.poli.servicios;

import co.edu.poli.modelo.Estacion;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.*;
import java.util.*;

/**
 * Implementación de la interfaz Operacion para realizar
 * operaciones CRUD (Crear, Leer, Actualizar, Eliminar)
 * sobre objetos de tipo Estacion. También permite la serialización
 * y deserialización de los Estacions.
 */
public class ImplementacionOperacion implements Operacion {

    /**
     * Arreglo que almacena los objetos de tipo Estacion.
     */
    private Estacion[] Estacion;

    /**
     * Constructor por defecto que inicializa un arreglo de Estacion con tamaño 1.
     */
    public ImplementacionOperacion() {
        Estacion = new Estacion[1];
    }

    /**
     * Establece el arreglo de Estacions.
     *
     * @param Estacion Arreglo de objetos Estacion a establecer.
     */
    public void setEEstacion(Estacion[] Estacion) {
        this.Estacion = Estacion;
    }

    /**
     * Crea un nuevo objeto Estacion y lo almacena en el arreglo.
     *
     * @param x Objeto Estacion a crear.
     * @return Mensaje indicando el resultado de la operación.
     */
    public String create(Estacion x) {
        for (int i = 0; i < Estacion.length; i++) {
            if (Estacion[i] == null) {
                Estacion[i] = x;
                return "Save!";
            }
        }
        // Si el arreglo está lleno, duplicar su tamaño
        Estacion[] Estacionaux = new Estacion[Estacion.length * 2];
        System.arraycopy(Estacion, 0, Estacionaux, 0, Estacion.length);
        Estacionaux[Estacion.length] = x;
        Estacion = Estacionaux;
        return "Save!!";
    }

    /**
     * Lee un objeto Estacion basado en su identificador.
     *
     * @param id_Estacion Identificador del Estacion a buscar.
     * @return El objeto Estacion encontrado o null si no existe.
     */
    public Estacion read(String id_Estacion) {
        for (int i = 0; i < Estacion.length; i++) {
            if (!(Estacion[i] == null))
                if (Estacion[i].getIdEstacion().equals(id_Estacion))
                    return Estacion[i];
        }
        return null;
    }

    /**
     * Lee todos los objetos Estacion almacenados.
     *
     * @return Arreglo de objetos Estacion.
     */
    public Estacion[] readall() {
        return Estacion;
    }

    /**
     * Actualiza un objeto Estacion existente basado en su identificador.
     *
     * @param x        Objeto Estacion con los nuevos datos.
     * @param id_Estacion Identificador del Estacion a actualizar.
     * @return Mensaje indicando el resultado de la operación.
     */
    public String update(Estacion x, String id_Estacion) {
        for (int i = 0; i < Estacion.length; i++) {
            if (!(Estacion[i] == null))
                if (Estacion[i].getIdEstacion().equals(id_Estacion)) {
                    Estacion[i] = x;
                    return "Update!";
                }
        }
        return "Cod is not in the array!";
    }

    /**
     * Elimina un objeto Estacion basado en su identificador.
     *
     * @param id_Estacion Identificador del Estacion a eliminar.
     * @return El objeto Estacion eliminado o null si no existe.
     */
    public Estacion delete(String id_Estacion) {
        Estacion temp = null;
        for (int i = 0; i < Estacion.length; i++) {
            if (!(Estacion[i] == null))
                if (Estacion[i].getIdEstacion().equals(id_Estacion)) {
                    temp = Estacion[i];
                    Estacion[i] = null;
                    return temp;
                }
        }
        return temp;
    }

    /**
     * Serializa un arreglo de objetos Estacion a un archivo.
     *
     * @param Estacion Arreglo de objetos Estacion a serializar.
     * @param path   Ruta donde se guardará el archivo.
     * @param name   Nombre del archivo a crear.
     * @return Mensaje indicando el resultado de la operación.
     */
    public String serializar(Estacion[] Estacion, String path, String name) {
        try {
            FileOutputStream fos = new FileOutputStream(path + name);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Estacion);
            oos.close();
            fos.close();
            return "File create!!";
        } catch (IOException ioe) {
            return "Error file " + ioe.getMessage();
        }
    }

    /**
     * Deserializa un arreglo de objetos Estacion desde un archivo.
     *
     * @param path Ruta del archivo a leer.
     * @param name Nombre del archivo a leer.
     * @return Arreglo de objetos Estacion deserializados.
     */
    public Estacion[] deserializar(String path, String name) {
        Estacion[] a = null;
        try {
            FileInputStream fis = new FileInputStream(path + name);
            ObjectInputStream ois = new ObjectInputStream(fis);
            a = (Estacion[]) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return a;
    }

}
