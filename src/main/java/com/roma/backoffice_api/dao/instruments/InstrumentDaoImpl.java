package com.roma.backoffice_api.dao.instruments;

import com.roma.backoffice_api.domain_model.Instruments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class InstrumentDaoImpl implements InstrumentDao {
    @Autowired
    InstrumentRepo instrumentRepo;

    @Override
    public Instruments findAllInstrumentsByCodeDao(String instrCode) {
        return instrumentRepo.findInstrumentsByCodeRepo(instrCode);
    }

    @Override
    public Instruments findAllInstrumentsByIsinDao(Integer instrIsin) {
        return instrumentRepo.findInstrumentsByIsinRepo(instrIsin);
    }

    @Override
    public List<Instruments> findAllInstrumentsByDateDao() {
        return instrumentRepo.findAllInstrumentsByDateRepo();
    }
}
