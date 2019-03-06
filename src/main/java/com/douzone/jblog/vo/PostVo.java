package com.douzone.jblog.vo;

public class PostVo {

	private String content;
	private String title;
	private String reg_date;
	private int category_no;
	private String category;
			
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public int getCategory_no() {
		return category_no;
	}
	public void setCategory_no(int category_no) {
		this.category_no = category_no;
	}
	@Override
	public String toString() {
		return "PostVo [content=" + content + ", reg_date=" + reg_date + ", category_no=" + category_no + ", category="
				+ category + "]";
	}
}
