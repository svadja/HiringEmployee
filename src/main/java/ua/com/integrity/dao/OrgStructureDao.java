package ua.com.integrity.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.com.integrity.model.company.Department;
import ua.com.integrity.model.company.Position;
import ua.com.integrity.model.company.Unit;

@Repository
public class OrgStructureDao {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Unit> getAllUnitInDep(int depatmentId) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Unit.class);
		criteria.add(Restrictions.eq("rootDepatment.id", depatmentId));
		List units = criteria.list();
		session.close();
		return units;
	}

	public List<Position> getAllPositionInDep(int depatmentId) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Position.class);
		criteria.add(Restrictions.eq("rootDepatment.id", depatmentId));
		List positions = criteria.list();
		session.close();
		return positions;
	}

	public List<Position> getAllPositionInUnit(int unitId) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Position.class);
		criteria.add(Restrictions.eq("rootUnit.id", unitId));
		List positions = criteria.list();
		session.close();
		return positions;
	}
	
	public Position getFullPositionById(Integer id){
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Position.class);
		criteria.add(Restrictions.eq("id", id));
		criteria.setFetchMode("rootDepatment", FetchMode.JOIN); 
		criteria.setFetchMode("rootUnit", FetchMode.JOIN); 
		Position position = (Position) criteria.uniqueResult();
		session.close();
		return position;
	}

}
