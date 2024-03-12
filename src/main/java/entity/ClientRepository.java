package entity;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;

public interface ClientRepository  extends JpaRepository<ClientEntity, UUID> {
@Transactional

@Query(value = """
            UPDATE employee_table
            SET age = ?2
            WHERE employee_id = ?1
            """, nativeQuery = true)
Optional<ClientEntity> updateAgeById(@Param("id") UUID id,
                                       @Param("age") Integer age);
}
