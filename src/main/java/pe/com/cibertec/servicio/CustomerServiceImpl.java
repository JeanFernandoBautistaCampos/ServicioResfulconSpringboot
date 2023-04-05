/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.cibertec.Dao.CustomerDao;
import pe.com.cibertec.domain.Customer;

/**
 *
 * @author fernando
 */
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerDao objDao;

    @Override
    @Transactional(readOnly = true)
    public List<Customer> listarCustomers() {
        return (List<Customer>)objDao.findAll();        
    }

    @Override
    @Transactional 
    public void guardar(Customer customer) {
        objDao.save(customer);
    }

    @Override
    @Transactional
    public void eliminar(Customer customer) {
        objDao.delete(customer);
    }

    @Override
    @Transactional(readOnly = true)
    public Customer encontrarCustomer(Customer customer) {
        return objDao.findById(customer.getId()).orElse(null);
    }
}
