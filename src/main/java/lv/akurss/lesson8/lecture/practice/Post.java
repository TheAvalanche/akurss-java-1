package lv.akurss.lesson8.lecture.practice;

import java.util.Date;
import java.util.Set;

public class Post {
	
	private String content;
	private Date created;
	private Set<Tag> tags;

	public Post(String content, Date created) {
		this.content = content;
		this.created = created;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
}
