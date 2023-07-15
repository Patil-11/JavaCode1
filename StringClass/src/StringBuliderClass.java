
public class StringBuliderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//append() 
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		
		//insert() 
		StringBuilder sb1=new StringBuilder("Hello ");  
		sb1.insert(1,"Java");//now original string is changed  
		System.out.println(sb1);//prints HJavaello  
		
		//replace()
		StringBuilder sb2=new StringBuilder("Hello");  
		sb2.replace(1,3,"Java");  
		System.out.println(sb2);//prints HJavalo  
		
		//delete() 
		StringBuilder sb3=new StringBuilder("Hello");  
		sb3.delete(1,3);  
		System.out.println(sb3);//prints Hlo  
		
		// reverse()
		StringBuilder sb4=new StringBuilder("Hello");  
		sb4.reverse();  
		System.out.println(sb4);//prints olleH  
		
		//capacity() 
		StringBuilder sb5=new StringBuilder();    
		System.out.println(sb.capacity());//default 16    
		sb5.append("Hello");    
		System.out.println(sb5.capacity());//now 16    
		sb5.append("Java is my favourite language");    
		System.out.println(sb5.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2    
		}  
	}


