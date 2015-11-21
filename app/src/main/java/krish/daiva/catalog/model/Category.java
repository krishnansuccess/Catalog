package krish.daiva.catalog.model;

public class Category {
	private String CategoryName,IdCategory,Status;
	public Category(String CategoryName,String IdCategory,String Status){
		this.CategoryName=CategoryName;
		this.IdCategory=IdCategory;
		this.Status=Status;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public String getIdCategory() {
		return IdCategory;
	}

	public String getStatus() {
		return Status;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public void setIdCategory(String idCategory) {
		IdCategory = idCategory;
	}

	public void setStatus(String status) {
		Status = status;
	}
}