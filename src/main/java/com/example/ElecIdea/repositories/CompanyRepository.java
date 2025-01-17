
package com.example.ElecIdea.repositories;

import com.example.ElecIdea.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CompanyRepository extends JpaRepository<Company, String> {
    boolean existsByName(String name);
    boolean existsByNif(String nif);
    boolean existsByEmail(String email);
    boolean existsByPhone(String phone);
    
    //busqueda registro de usuarios
    Company findByCode(String code);    
}
