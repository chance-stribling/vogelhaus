package com.stribling.vogelhaus.Repository;

import com.stribling.vogelhaus.Entity.Haus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HausRepository extends JpaRepository<Haus, Long> {
    Optional<Haus> findByName(String name);

    Optional<Haus> findByAddress(String address);
}
