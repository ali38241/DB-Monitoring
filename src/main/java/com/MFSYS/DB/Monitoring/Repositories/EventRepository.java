package com.MFSYS.DB.Monitoring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MFSYS.DB.Monitoring.Entities.Event;

@Repository
public interface EventRepository<T extends Event, ID> extends JpaRepository<T, ID> {

}
