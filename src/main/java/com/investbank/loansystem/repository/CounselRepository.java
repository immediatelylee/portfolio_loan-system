package com.investbank.loansystem.repository;

import com.investbank.loansystem.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface CounselRepository extends JpaRepository<Counsel,Long> {
}
