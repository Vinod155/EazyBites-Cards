package com.example.Cards.repository;

import com.example.Cards.entity.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CardRepository extends JpaRepository<Cards,Long> {
    public Optional<Cards> findByMobileNumber(String mobileNumber);
}
