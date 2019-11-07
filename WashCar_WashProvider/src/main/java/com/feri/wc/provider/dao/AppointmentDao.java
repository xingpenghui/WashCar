package com.feri.wc.provider.dao;

import com.feri.wc.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

//持久层
public interface AppointmentDao extends JpaRepository<Appointment,Integer> {

}
