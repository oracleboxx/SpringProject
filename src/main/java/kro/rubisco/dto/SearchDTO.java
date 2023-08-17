package kro.rubisco.dto;

public class SearchDTO {

	public static enum Target{
		titleAndContent, title, contetn,nickName
	}
	
	private Target target;
	private String keyword;
	public Target getTarget() {
		return target;
	}
	public void setTarget(Target target) {
		this.target = target;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
}
