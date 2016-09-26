package ua.com.integrity.process.activities.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.com.integrity.model.application.Application;
import ua.com.integrity.model.company.Department;
import ua.com.integrity.model.company.Position;
import ua.com.integrity.model.company.Unit;
import ua.com.integrity.service.OrgStructureService;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;

@Component
public class ManagerAssignment implements TaskListener {

	@Autowired
	OrgStructureService orgStructureService;
	
	@Override
	public void notify(DelegateTask delegateTask) {
		String manager = "";
		Application application = (Application) delegateTask.getVariable("application");
		
		if(delegateTask.getBpmnModelElementInstance().getId().equals("Task_unit_head")){
			Unit unit = orgStructureService.getFullPositionById(application.getJob().getPositionId()).getRootUnit(); 
			manager = (unit != null) ? unit.getManager():"";
		}
		
		if(delegateTask.getBpmnModelElementInstance().getId().equals("Task_dep_head")){
			Department department = orgStructureService.getFullPositionById(application.getJob().getPositionId()).getRootDepatment(); 
			manager = (department != null) ? department.getManager():"";
		}
		delegateTask.setAssignee(manager);
	}

}
