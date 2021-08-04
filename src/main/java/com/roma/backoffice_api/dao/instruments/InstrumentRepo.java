package com.roma.backoffice_api.dao.instruments;

import com.roma.backoffice_api.domain_model.Instruments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface InstrumentRepo extends JpaRepository<Instruments, Long> {
    @Query(value = "SELECT * FROM instruments AS i\n" +
            "WHERE i.instr_code=:instrCode AND i.download_date=CURRENT_DATE;", nativeQuery = true)
    Instruments findInstrumentsByCodeRepo(@Param("instrCode") String instrCode);

    @Query(value = "SELECT * FROM instruments AS i " +
            "WHERE i.instr_id=:instrId AND i.download_date=CURRENT_DATE;", nativeQuery = true)
    Instruments findInstrumentsByIsinRepo(@Param("instrId") Integer instrId);

    @Query(value = "SELECT * FROM Instruments i WHERE i.download_date = CURRENT_DATE;", nativeQuery = true)
    List<Instruments> findAllInstrumentsByDateRepo();


}
