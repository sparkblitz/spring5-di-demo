package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * @author jguillen
 */
@Service
public class SetterRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {

        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {

        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {

        return "Primärer Grußdienst";

    }
}
