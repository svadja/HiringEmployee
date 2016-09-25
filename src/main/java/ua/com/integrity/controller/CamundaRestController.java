package ua.com.integrity.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ua.com.integrity.model.NameValuePair;
import ua.com.integrity.model.company.Department;
import ua.com.integrity.model.company.Position;
import ua.com.integrity.model.company.Unit;
import ua.com.integrity.service.OrgStructureService;

@RestController
@RequestMapping("api")
public class CamundaRestController {
	
	@Autowired
	OrgStructureService orgStructureService;
	
    @RequestMapping(value = "/departments", method = RequestMethod.GET,  produces = "application/json")
    public List<NameValuePair>  getDepartments() {
    	List<Department> departments = orgStructureService.getAllDepatments();
        return departments.stream().map((dep) -> new NameValuePair(dep.getName(), Integer.toString(dep.getId()))).collect(Collectors.toList()) ;
    }
	
    @RequestMapping(value = "/positions", method = RequestMethod.GET,  produces = "application/json")
    public List<NameValuePair>  getPositions() {
        List<Position> positions = orgStructureService.getAllPositions();
        return positions.stream().map((dep) -> new NameValuePair(dep.getName(), Integer.toString(dep.getId()))).collect(Collectors.toList()) ;
    }	
    
    @RequestMapping(value = "/units", method = RequestMethod.GET,  produces = "application/json")
    public List<NameValuePair>  getUnits() {
        List<Unit> units = orgStructureService.getAllUnits();
        return units.stream().map((dep) -> new NameValuePair(dep.getName(), Integer.toString(dep.getId()))).collect(Collectors.toList()) ;
    }
    
    @RequestMapping(value = "/init", method = RequestMethod.GET,  produces = "application/json")
    public void addDepartment() {
    	ArrayList<Department> departments = new ArrayList<>();
    	departments.add(new Department("Администрация","vsasa"));
    	departments.add(new Department("Департамент программных решений","vsasa"));
    	departments.add(new Department("Департамент продаж","vsasa"));
    	departments.add(new Department("Отдел техничесокй поддержки","vsasa"));
    	orgStructureService.addOrgItems(departments);
    	
    	ArrayList<Unit> units = new ArrayList<>();
    	units.add(new Unit("Відділ розробки", "vsasa", departments.get(0)));
    	orgStructureService.addOrgItems(units);
    	
    	ArrayList<Position> positions = new ArrayList<>();
    	positions.add(new Position("Инженер-программист", departments.get(1), units.get(0)));
    	positions.add(new Position("Тестировщик", departments.get(1), units.get(0)));
    	positions.add(new Position("Администратор систем", departments.get(3), null));
    	positions.add(new Position("Менеджер по продажам", departments.get(2), null));
      	orgStructureService.addOrgItems(positions);
    }

}


