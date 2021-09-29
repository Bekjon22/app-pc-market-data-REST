package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.domain.Order;

import java.util.List;

@Projection(types = Order.class)
public interface CustomOrder {

    Long getId();

    Object getClient();

    List<Long> getProducts();
}
