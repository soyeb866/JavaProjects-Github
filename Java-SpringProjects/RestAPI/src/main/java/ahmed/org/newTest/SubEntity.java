package ahmed.org.newTest;

public class SubEntity {
	private String message = "Hello";
	private int Id = 2;
	
	public SubEntity() {

	}
	public SubEntity(String message, int id) {

		this.message = message;
		Id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}	
	
}
