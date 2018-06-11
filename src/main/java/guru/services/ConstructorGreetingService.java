package guru.services;

import org.springframework.stereotype.Service;

/**
 * @author jguillen
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected via the constructor!!!";
    }
}
