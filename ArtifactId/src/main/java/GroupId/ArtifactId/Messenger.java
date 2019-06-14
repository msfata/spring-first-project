package GroupId.ArtifactId;

public class Messenger {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("My message > " + message);
	}
}
