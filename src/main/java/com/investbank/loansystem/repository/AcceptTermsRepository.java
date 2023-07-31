package com.investbank.loansystem.repository;

import com.investbank.loansystem.domain.AcceptTerms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface AcceptTermsRepository extends JpaRepository<AcceptTerms, Long> {
}
