package kro.rubisco.dto;

public class CategoryDTO extends BaseTime{
private Long categoryId;
private String category;
public Long getCategoryId() {
	return categoryId;
}
public void setCategoryId(Long categoryId) {
	this.categoryId = categoryId;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}

}
