package hu.IB153I16.ingatlan.repository;

import hu.IB153I16.ingatlan.model.RealEstate;
import hu.IB153I16.ingatlan.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RolesRepository extends JpaRepository<Role, Long> {
    
    List<Role> findByName(String name);
}
