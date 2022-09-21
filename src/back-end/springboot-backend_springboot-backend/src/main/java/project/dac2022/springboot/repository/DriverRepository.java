package project.dac2022.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.dac2022.springboot.model.DriverRegister;

public interface DriverRepository extends JpaRepository<DriverRegister, Long> {

}
