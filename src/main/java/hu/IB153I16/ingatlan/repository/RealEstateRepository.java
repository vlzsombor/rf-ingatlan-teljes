package hu.IB153I16.ingatlan.repository;

import hu.IB153I16.ingatlan.model.RealEstate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RealEstateRepository extends JpaRepository<RealEstate, Long> {
    @Query(value="select r from RealEstate r where r.telepulesNev like :keyword% ")
    List<RealEstate> findByKeyWord(@Param("keyword") String keyword);
}

