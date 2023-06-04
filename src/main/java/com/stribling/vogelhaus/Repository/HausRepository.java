package com.stribling.vogelhaus.Repository;

import com.stribling.vogelhaus.Entity.Haus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HausRepository extends JpaRepository<Haus, Long> {
}
