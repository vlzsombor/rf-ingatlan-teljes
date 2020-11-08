package hu.IB153I16.ingatlan.repository;

import hu.IB153I16.ingatlan.model.RealEstate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealEstateRepository extends JpaRepository<RealEstate, Long> {
    Long removeByName(String name);


}
