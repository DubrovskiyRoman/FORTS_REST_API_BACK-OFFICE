package com.roma.backoffice_api.controller;

import com.roma.backoffice_api.dao.instruments.InstrumentDao;
import com.roma.backoffice_api.domain_model.Instruments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/forts/back-office/instruments")
public class InstrumentsController {

    @Autowired
    InstrumentDao instrumentDao;

    // Information for instruments by code

    @GetMapping(value = "/instrumentCode={instrumentCode}")
    public ResponseEntity<Instruments> findInstrumentsByCode(@PathVariable(name = "instrumentCode") String code) {
        Instruments instruments = instrumentDao.findAllInstrumentsByCodeDao(code);
        return instruments != null
                ? new ResponseEntity<>(instruments, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Information for instruments by ISIN

    @GetMapping(value = "/instrumentISIN={instrumentIsin}")
    public ResponseEntity<Instruments> findInstrumentsIsin(@PathVariable(name = "instrumentIsin") Integer isin) {
        Instruments instruments = instrumentDao.findAllInstrumentsByIsinDao(isin);
        return instruments != null
                ? new ResponseEntity<>(instruments, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Actual Information for instruments

    @GetMapping(value = "/actual-instruments")
    public ResponseEntity<List<Instruments>> findAllInstrumentsByDate() {
        List<Instruments> instruments = instrumentDao.findAllInstrumentsByDateDao();
        return instruments != null && !instruments.isEmpty()
                ? new ResponseEntity<>(instruments, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

}
