package oneToone;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QuestionMain {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		
		
		while(true)
		{
			System.out.println("Enter your choice:");
			int n=sc.nextInt();
			Session ses=sf.openSession();
			Transaction ts=ses.beginTransaction();
			switch(n) {    // One to Many CRUD operations
			case 1:
				
				List<Answer> li=new ArrayList<Answer>();
				li.add(new Answer("Set"));
				li.add(new Answer("Hashmap"));
				li.add(new Answer("Arraylist"));
				Question q=new Question("Collections in java?",5);
				//q.setAnswer(new Answer("java is understandable")); ---->one to one
				q.setAnswer(li);
				ses.save(q);  //----------------------------------------->Create operation
				ts.commit();
				ses.close();
				break;
			case 2:
				
				Question q1=ses.get(Question.class, 23);
				System.out.println(q1.getQuestionName());
				q1.getAnswer().forEach(a->System.out.println(a)); //----> Read operation
				ts.commit();
				ses.close();
				break;
			case 3:
				Question q2=ses.get(Question.class, 23);
				List<Answer> a=new ArrayList<>();
				a.add(new Answer("trying java"));
				a.add(new Answer("Java is good"));
				a.add(new Answer("Java is logoc based"));
				q2.setAnswer(a); 
				System.out.println("Answers updated"); //----> Update operation
				ts.commit();
				ses.close();
				break;
			case 4:
				Question q3=ses.get(Question.class, 23);
				ses.delete(q3);
				ts.commit();
				ses.close();
				System.out.println("Question deleted"); //-------> Delete operation
				break;
				
			}
		}
		
		
		
		
		/*Question q=ses.get(Question.class, 23);
		System.out.println(q.getQuestionName());
		//q.getAnswer().forEach(a->System.out.println(a.getAnswerName())); ----> Read operation
		/*List<Answer> a=new ArrayList<>();
		a.add(new Answer("trying java"));
		a.add(new Answer("Java is good"));
		a.add(new Answer("Java is logoc based"));
		q.setAnswer(a); 
		//System.out.println("Answers updated"); ----> Update operation
		ses.delete(q); //-----> Delete operation ... questions are deleted but not answers
		System.out.println("Answers deleted");
		ts.commit();
		ses.close();*/
	}
}
