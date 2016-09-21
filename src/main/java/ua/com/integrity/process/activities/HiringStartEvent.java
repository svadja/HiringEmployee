package ua.com.integrity.process.activities;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.springframework.stereotype.Component;

import ua.com.integrity.model.Application;

@Component
public class HiringStartEvent implements ExecutionListener {
	@Override
	public void notify(DelegateExecution delegateExecution) throws Exception {
		String userId = delegateExecution.getProcessEngineServices().getIdentityService().getCurrentAuthentication().getUserId();
		String processInstanceId = delegateExecution.getProcessInstanceId();
		Application application = (Application) delegateExecution.getVariable("application");
	}

}
