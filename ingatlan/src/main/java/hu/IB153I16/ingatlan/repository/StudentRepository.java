package hu.IB153I16.ingatlan.repository;

import hu.IB153I16.ingatlan.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findByName(String name);
}