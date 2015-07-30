package maven.demo.test.loosely_coupled;

public class OutputHelper {
	private IOutputGenerator outputGenerator;

	public void generateOutput() {
		this.outputGenerator.generateOutput();
	}

	public OutputHelper(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
	

}
