package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.domain.Client;

@Projection(types = Client.class)
public interface CustomClient {

    Long getId();

    String getFullName();

    String getEmail();

    String getPhoneNumber();

    Object getAddress();
}
