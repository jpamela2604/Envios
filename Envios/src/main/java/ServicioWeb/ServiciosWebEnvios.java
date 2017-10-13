/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioWeb;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Pamela
 */
@WebService(serviceName = "ServiciosWebEnvios")
public class ServiciosWebEnvios {

    /**
     * This is a sample web service operation
     
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }*/
    
    @WebMethod(operationName = "cargar_Vehiculos")
    public String cargar_Vehiculos(@WebParam(name = "solicitud_catalogo") Integer solicitud_catalogo) {
        String respuesta="";
        return respuesta;
    }
    
     @WebMethod(operationName = "calcular_costo_viaje")
    public double calcular_costo_viaje(@WebParam(name = "viaje") Integer viaje,
            @WebParam(name = "costo") double costo
    ) {
        double respuesta = 0.0 ;
        return respuesta;
    }
    
    @WebMethod(operationName = "guardar_Transferencia")
    public Boolean guardar_Transferencia(@WebParam(name = "id_transferencia") Integer id_transferencia,
            @WebParam(name = "monto") Integer monto
    ) {
        Boolean respuesta = false ;
        return respuesta;
    }
}
