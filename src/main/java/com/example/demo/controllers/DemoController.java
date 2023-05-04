package com.example.demo.controllers;

import com.example.demo.models.dao.SalaryDao;
import com.example.demo.models.entities.Acquisition;
import com.example.demo.models.entities.Outcome;
import com.example.demo.models.dao.AcquisitionDao;
import com.example.demo.models.dao.OutcomeDao;
import com.example.demo.models.entities.Salary;
import com.example.demo.models.requests.AcquisitionRequest;
import com.example.demo.models.requests.SalaryRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class DemoController {

    private final OutcomeDao outcomeDao;
    private final AcquisitionDao acquisitionDao;
    private final SalaryDao salaryDao;

    @GetMapping("outcomes")
    ResponseEntity<List<Outcome>> getOutcomes() {
        List<Outcome> outcomes = outcomeDao.findAll();
        return new ResponseEntity<>(outcomes, HttpStatusCode.valueOf(200));
    }

    @GetMapping("acquisitions")
    ResponseEntity<List<Acquisition>> getAcquisitions() {
        List<Acquisition> acquisitions = acquisitionDao.findAll();
        return new ResponseEntity<>(acquisitions, HttpStatusCode.valueOf(200));
    }

    @PostMapping("acquisitions")
    ResponseEntity<Boolean> postAcquisition(@RequestBody AcquisitionRequest request) {
        log.info("{}", request);

        Acquisition acquisition = new Acquisition();

        acquisition.setName(request.getName());
        acquisition.setOutcome(new Outcome("acquisition", request.getRemarks(), request.getAmount()));

        acquisitionDao.save(acquisition);

        return new ResponseEntity<>(true, HttpStatusCode.valueOf(200));
    }

    @GetMapping("salaries")
    ResponseEntity<List<Salary>> getSalaries() {
        List<Salary> salaries = salaryDao.findAll();
        return new ResponseEntity<>(salaries, HttpStatusCode.valueOf(200));
    }

    @PostMapping("salaries")
    ResponseEntity<Boolean> postSalary(@RequestBody SalaryRequest request) {
        log.info("{}", request);

        Salary salary = new Salary();

        salary.setEmployee(request.getEmployee());
        salary.setOutcome(new Outcome("salary", request.getRemarks(), request.getAmount()));

        salaryDao.save(salary);

        return new ResponseEntity<>(true, HttpStatusCode.valueOf(200));
    }

}