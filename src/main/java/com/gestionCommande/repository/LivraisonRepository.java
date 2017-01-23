package com.gestionCommande.repository;

import com.gestionCommande.entities.Livraison;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivraisonRepository extends JpaRepository<Livraison,Long>
{
    List<Livraison> findLivraisonByCommandeClientNomAndCommandeClientPrenom(String clientNom, String clientPrenom);
    Page<Livraison> findLivraisonByCommandeClientNomAndCommandeClientPrenom(String clientNom, String clientPrenom, Pageable pageable);

    List<Livraison> findLivraisonByCommandeClientNumeroClient(Long idClient);
    Page<Livraison> findLivraisonByCommandeClientNumeroClient(Long idClient, Pageable pageable);
}
