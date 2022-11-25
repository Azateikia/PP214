package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    @Autowired
    @Qualifier("deth8")
    private Deth8 deth8;

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + deth8;
    }
}