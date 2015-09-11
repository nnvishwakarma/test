package poc.rest.ws.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONTENTS")
public class Content implements Serializable{
	
	/**
	 * Content class ID  
	 */	
	private static final long serialVersionUID = 123L;
	@Id
	private int chapterNo;
	private String title;
	private String description;
	private int startPage;
	private int endPage;
	
	public Content(){
		
	}
	
	public Content(int chanpterNo,String title,String description,int startDate,int endDate){
		this.chapterNo=chanpterNo;
		this.title=title;
		this.description=description;
		this.startPage=startDate;
		this.endPage=endDate;		
	}
	
	public int getChapterNo() {
		return chapterNo;
	}
	public void setChapterNo(int chapterNo) {
		this.chapterNo = chapterNo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	
	public String toString(){
		return String.format("Content: [%d, %s, %s, %d to %d]\n",
			getChapterNo(),getTitle(),getDescription(),getStartPage(),getEndPage());	
	}
	
	
}
