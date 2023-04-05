/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.cibertec.servicio;

import java.util.List;
import pe.com.cibertec.domain.Customer;

/**
 *
 * @author fernando
 */
public interface CustomerService {
    public List<Customer> listarCustomers();
    
    public void guardar(Customer customer);
    
    public void eliminar (Customer customer);
    
    public Customer encontrarCustomer(Customer customer);
}
