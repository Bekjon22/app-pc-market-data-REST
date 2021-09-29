package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.domain.Address;

@Projection(types = Address.class)
public interface CustomAddress {

    Long getId();

    String getRegion();

    String getDistrict();

    String getStreet();
}
