package ar.edu.info.unlp.ejercicio24;

public abstract class ProcessStep {
	
	private boolean result;
	
	public void execute(MixingTank tank) {
		if (this.basicExecute(tank)) { this.setSuccess(); }
		else { this.setFailure(); }
	}
	
	protected abstract boolean basicExecute(MixingTank tank);
	
	public boolean isDone() {
		return this.result;
	}
	
	private void setSuccess() {
		result = true;
	}
	
	private void setFailure() {
		result = true;
	}

}
