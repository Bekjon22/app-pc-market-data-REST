package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.domain.Product;

@Projection(types = Product.class)
public interface CustomProduct {

    Long getId();

    String getName();

    String getModel();

    String getMark();

    String getDescription();

    boolean getActive();

    Object getCategory();

    Object getAttachment();
}
