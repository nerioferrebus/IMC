package rmi;

import nerioferrebus.seminario.imc.rmi.net.Servidor;

/**
 * @author NERIO FERREBUS
 */
public class Principal {

    public static void main(String[] args) {
        Servidor servicio = new Servidor();
        try {
            servicio.iniciar();
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
}