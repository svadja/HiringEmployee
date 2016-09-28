package ua.com.integrity.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.integrity.dao.CommonDao;
import ua.com.integrity.dao.OrgStructureDao;
import ua.com.integrity.model.company.Department;
import ua.com.integrity.model.company.Position;
import ua.com.integrity.model.company.Unit;

@Service
public class OrgStructureService {
	@Autowired
	OrgStructureDao orgStructureDao;
	
	@Autowired
	CommonDao commonDao;

	public List<Department> getAllDepatments() {
		return (List<Department>) commonDao.getAll(Department.class);
	}

	public List<Unit> getAllUnits() {
		return (List<Unit>) commonDao.getAll(Unit.class);
	}

	
	public List<Unit> getAllUnitsInDep(int depatmentId){
		return (List<Unit>) orgStructureDao.getAllUnitInDep(depatmentId);
	}
	
	public List<Position> getAllPositions() {
		return (List<Position>) commonDao.getAll(Position.class);
	}
	
	public List<Position> getAllPositionsInDep(int depatmentId) {
		return (List<Position>) orgStructureDao.getAllPositionInDep(depatmentId);
	}
	
	public List<Position> getAllPositionsInUnit(int unitId) {
		return (List<Position>) orgStructureDao.getAllPositionInUnit(unitId);
	}
	
	public Department getDepartmentById(Integer id){
		return (Department) commonDao.getById(Department.class.getName(), id);
	}
	
	public Unit getUnitById(Integer id){
		return (Unit) commonDao.getById(Unit.class.getName(),id);
	}
	
	public Position getPositionById(Integer id){
		return (Position) commonDao.getById(Position.class.getName(),id);
	}
	
	public Position getFullPositionById(Integer id){
		return orgStructureDao.getFullPositionById(id);
	}
	
	public void addOrgItem(Object item) {
		commonDao.saveOrUpdate(item);
	}
	
	public void addOrgItems(List items) {
		commonDao.savaOrUpdateAll(items);
	}
}
