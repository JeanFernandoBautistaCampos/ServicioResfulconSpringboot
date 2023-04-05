/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author fernando
 */
@Data
@Entity
@Table(name="customer")
public class Customer implements Serializable{
    
    private static final long serialVersionUid = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty
    private String name;
    
    private String Phone;
    
    @NotEmpty
    @Email
    private String email;
    
}
