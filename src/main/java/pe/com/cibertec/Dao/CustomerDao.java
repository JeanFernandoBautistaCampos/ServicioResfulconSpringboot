/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.cibertec.Dao;

import org.springframework.data.repository.CrudRepository;
import pe.com.cibertec.domain.Customer;

/**
 *
 * @author fernando
 */
public interface CustomerDao extends CrudRepository<Customer, Long>{
    
}
