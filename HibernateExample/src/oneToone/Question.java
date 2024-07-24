package oneToone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;

@Entity
public class Question {
	@OneToMany(cascade=CascadeType.ALL)//this means if once question gets deleted answer also gets deleted and vice versa for creating 
	private List<Answer> answer;//to make relation(foreign key)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int qid; //primary key
	private String questionName;
	private int marks;
	
	public Question()
	{
		
	}
	
	public Question(String questionName, int marks)
	{
		super();
		this.questionName=questionName;
		this.marks=marks;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestionName() {
		return questionName;
	}
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public String toString()
	{
		return questionName+answer;
	}
	
}
