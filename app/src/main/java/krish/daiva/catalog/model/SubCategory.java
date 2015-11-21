package krish.daiva.catalog.model;

public class SubCategory {
	private String name,imgUrl,sid,parentId,Status;
	public SubCategory(String categoryName,String imgUrl,String sid,String parentId,String Status){
		this.name=categoryName;
		this.imgUrl=imgUrl;
		this.sid=sid;
		this.parentId=parentId;
		this.Status=Status;
	}

	public String getStatus() {
		return Status;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getName() {
		return name;
	}

    public String getParentId() {
        return parentId;
    }

    public String getSid() {
        return sid;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
}