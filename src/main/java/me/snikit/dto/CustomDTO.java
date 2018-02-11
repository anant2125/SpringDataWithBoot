package me.snikit.dto;

public class CustomDTO {

	@Override
	public String toString() {
		return "CustomDTO [id=" + id + "]";
	}

	public CustomDTO() {

	}

	public CustomDTO(String id) {
		super();
		this.id = id;
	}

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
