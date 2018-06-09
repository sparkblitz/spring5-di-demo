package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * @author jguillen
 */
@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}
