package co.edu.unicauca.cor.domain;

import co.edu.unicauca.cor.infra.Utilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Nivel de atención 4 de reclamos
 *
 * @author Astrid Carolina Cruz - Braian Alexis Bastidas
 */
public class LevelFour extends ClaimHandler {

    public LevelFour(String email) {
        super(email);
    }

    @Override
    public boolean attend(Claim claim) {
        if (claim.getType().equals(TypeEnum.CRITIC)) {
            Logger logger = LoggerFactory.getLogger(Utilities.class);
            logger.info("El reclamo será atendido en el nivel 4 por " + getEmail());
            Utilities.sendMail(getEmail(), claim.getTitle(), claim.getDescription());
            claim.setAttended(true);
            return true;

        } else {
            System.out.println("No Fue posible atender el Reclamo, Lo sentimos");
            return false;
        }
    }

}
