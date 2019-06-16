package chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@interface Valid
{
	String type();
	String message();
}
public class AnnotationDemo {
	
	@Valid(type="email",message="Invalid email")
	public String email;

	static void printAnnotation(Object obj)
	{
		try 
		{
			Field field = obj.getClass().getField("email");
			Valid anno = field.getAnnotation(Valid.class);
			
			System.out.println("Anno "+anno);
			System.out.println("Anno type "+anno.type() +" message "+anno.message());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public static void main(String[]args)
	{
		AnnotationDemo obj = new AnnotationDemo();
		printAnnotation(obj);
	}
}
