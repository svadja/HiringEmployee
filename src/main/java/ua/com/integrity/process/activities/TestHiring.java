package ua.com.integrity.process.activities;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.springframework.stereotype.Component;

import ua.com.integrity.model.application.Application;

@Component
public class TestHiring implements TaskListener  {

	@Override
	public void notify(DelegateTask delegateTask) {
		System.out.println(((Application)delegateTask.getVariable("application")).getPerson().getFirstName());
		
	}
	
}
