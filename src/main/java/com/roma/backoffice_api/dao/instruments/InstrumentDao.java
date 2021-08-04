package com.roma.backoffice_api.dao.instruments;

import com.roma.backoffice_api.domain_model.Instruments;


import java.util.Date;
import java.util.List;

public interface InstrumentDao {
    Instruments findAllInstrumentsByCodeDao(String instrCode);
    Instruments findAllInstrumentsByIsinDao(Integer instrIsin);
    List <Instruments> findAllInstrumentsByDateDao();
}
