/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.web;

import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pe.com.cibertec.domain.Customer;
import pe.com.cibertec.servicio.CustomerService;

/**
 *
 * @author fernando
 */
@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private CustomerService objServ;
    
    
    @GetMapping("/agregar")
    public String agregar(Customer obj){
        
        
        return "modificar";
    }   
    
    @PostMapping("/guardar")
    public String guardar(@Valid Customer obj, Errors errores){   
        if(errores.hasErrors()){
            return "index";
        }
        
        objServ.guardar(obj);
        return "redirect:/"; 
    }    
    
    @GetMapping("/editar/{id}")
    public String editar(Customer customer, Model model){
        customer = objServ.encontrarCustomer(customer);
        model.addAttribute("customer", customer);
        
        return "modificar";
    }    
    @GetMapping("/eliminar/{id}")
    public String eliminar(Customer customer){
        objServ.eliminar(customer);
        return "redirect:/";
    }
    
}
