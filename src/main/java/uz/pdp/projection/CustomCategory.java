package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.domain.Category;

@Projection(types = Category.class)
public interface CustomCategory {

    Long getId();

    String getName();

    boolean getActive();
}
