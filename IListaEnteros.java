/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOptionPane;

/**
 *
 * @author Juan Francisco Segura
 */
public interface IListaEnteros {
    void insertar(int numero);
    void eliminar(int posicion) throws IndexOutOfBoundsException;
    String mostrar();
    int mayor();
    int menor();
    double media();
    int moda();
    boolean estaVacia();
}