/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ScoreYourFood.demo.Repository;

import com.ScoreYourFood.demo.Entidades.Bar;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BarRepository extends JpaRepository<Bar, String> {
    @Query("SELECT c FROM Bar c WHERE c.calle = :calle")
    public List<Bar> buscarPorCalle(@Param("calle") String calle);  
}
