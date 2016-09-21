package ua.com.integrity.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CamundaRestController {
	
    @RequestMapping(value = "/positions", method = RequestMethod.GET,  produces = "application/json")
    public List<String>  getPositions() {
        List<String> positions = new ArrayList<String>() ;
        positions.add("Менеджер по продажам");
        positions.add("Инженер- программист");
        positions.add("Администратор систем");
        positions.add("Тестировщик");
        return positions;
    }	
    
    @RequestMapping(value = "/units", method = RequestMethod.GET,  produces = "application/json")
    public List<String>  getUnits() {
        List<String> units = new ArrayList<String>() ;
        units.add("Юнит");
        return units;
    }
    
    @RequestMapping(value = "/departments", method = RequestMethod.GET,  produces = "application/json")
    public List<String>  getDepartments() {
        List<String> departments = new ArrayList<String>() ;
        departments.add("Администрация");
        departments.add("Департамент программных решений");
        departments.add("Департамент продаж");
        departments.add("Отдел техничесокй поддержки");
        return departments;
    }
}
