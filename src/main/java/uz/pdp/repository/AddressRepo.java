package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.domain.Address;
import uz.pdp.projection.CustomAddress;

@RepositoryRestResource(path = "address", excerptProjection = CustomAddress.class)
public interface AddressRepo extends JpaRepository<Address,Long> {

}
