/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioWebTest;

import ServicioWeb.ServiciosWebEnvios;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pamela
 */
public class ServiciosWebEnviosTest {
    
   ServiciosWebEnvios request;
    
    public ServiciosWebEnviosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        request= new ServiciosWebEnvios();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     @Test  
     public void prueba_servicio_cargar_Vehiculos(){
         //solicitud_catalogo
         String r =  this.request.cargar_Vehiculos(Integer.MIN_VALUE);
         assertEquals("",r);
     }
     
       @Test  
     public void prueba_servicio_calcular_costo_viaje(){
         //viaje/costo
         Double r =  this.request.calcular_costo_viaje(10652, 16000.00);
         Double valor=0.0;
         assertEquals(valor.toString(),r.toString());
     }

     
      @Test  
     public void prueba_servicio_guardar_Transferencia(){
        //idtransferencia/monto
         Boolean r =  this.request.guardar_Transferencia(12659, 156895);
         assertEquals(false,r);
     }
}
