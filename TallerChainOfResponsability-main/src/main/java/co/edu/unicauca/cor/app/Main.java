package co.edu.unicauca.cor.app;

import co.edu.unicauca.cor.domain.ClaimManager;
import co.edu.unicauca.cor.domain.Claim;
import co.edu.unicauca.cor.domain.TypeEnum;

/**
 * Ejecutor Principal del programa
 *
 * @author Astrid Carolina Cruz - Braian Alexis Bastidas
 */
public class Main {


    public static void main(String[] args) {
        ClaimManager manager = new ClaimManager();
        manager.createAthentionFlow();

        Claim claim = new Claim(1, "Tiempo de entrega", "¿Cual es el promedio de entrega de mi domicilio?", TypeEnum.BASIC);
        manager.getLevelOne().attend(claim);

        claim = new Claim(2, "Cobro exajerado del domicilio", "El mensajero me cobró mucho por el domicilio", TypeEnum.DELIVERY);
        manager.getLevelOne().attend(claim);

        claim = new Claim(3, "Calidad del producto", "La comida del restaurante popayan casero estaba fria", TypeEnum.HIGH);
        manager.getLevelOne().attend(claim);
        
        claim = new Claim(4, "Producto inconsumible", "Me enviaron el pedido en mal estado", TypeEnum.CRITIC);
        manager.getLevelOne().attend(claim);
        
        claim = new Claim(5, "Pedido Incorrecto", "Me enviaron el pedido de forma erronea", TypeEnum.UNCLASSIFIED);
        manager.getLevelOne().attend(claim);
        
         
    }

}
