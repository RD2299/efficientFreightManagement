package project.dac2022.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.dac2022.springboot.model.TruckLendorRegister;

public interface TruckLenderRepository extends JpaRepository<TruckLendorRegister, Long> {

}
