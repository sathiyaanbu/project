/* call a class2 in a another class1
 * in class1
 * classs2 object2 =new class2;
 * type parameter = (scan.oject).nextLine();
 * object2.methodname2(name2);
 *  
 */

/*package fi.agileo.test;

import java.util.Scanner;


public class Demo
{
    public static void add(String args[]) {
      Scanner s= new Scanner(System.in);
      int a,b,c;
      System.out.println("a=");
      a= s.nextInt();
      System.out.println("b=");
      b= s.nextInt();
      c=a+b;
      System.out.println(c);
      
    }}
	/*

	public static void main(String[] args) {
		
	}*/
		/*int luku=10;
		System.out.print( "Print the number = " + luku );
		
		
		// TODO Auto-generated method stub

	}*/
	       /* int summa = 0 ;
	         for (int i = 1; i < 10; i++) {
	             summa += i;
	         }
	 
	 
	         // 2. Tulon laskeminen
	         int tulo = 1;
	        int i = 1;
	 
	         while (i < 10) {
	             tulo *= i;
	             i++;
	         }
	 
	         System.out.println("Summa 1-10 = " + summa);
	         System.out.println("tulo 1-10 = " + tulo);
	 
	 
	     }
	 }*/
		
	/*	import java.util.Arrays;
		
		public class Demo {
		
		 public static void main(String args[]) {
		   int[] t = {10,20,30,40,50};
		   int[] t2 = {8,7,6,5,4,3,2,1};
		   // Arrays.fill(t2, 0);
		
		   for (int i=0; i<t.length; i++) System.out.println(i + ":" + t[i]);
		 
		   // Kopiointi
		   try {
		     System.arraycopy(t,0,t2,2,5);
		     Arrays.sort(t2);
		     for (int i=0; i<t2.length; i++) System.out.println(i + ":" + t2[i]);
		   }
		   catch (Exception e) { e.printStackTrace(); }
		 }
		
		}*/
// METHODS EXAMPLE


/*public static void main(String[] args) {
    greetManyTimes("Anthony", 3);
    System.out.println("and");
    greetManyTimes("Martin", 2);
}

public static void greet(String name) {
    System.out.println("Hi " + name + ", greetings from the world of methods!");
}

public static void greetManyTimes(String name, int times) {
    int i = 0;
    while ( i < times ) {
        greet(name);
        i++;
    }

}}*/
	/*public static void main(String[] args) {
		printSquare(4);
		printSquare(4);
		printSquare(2);
		printSquare(3);
	}
	private static void printSquare(int sideSize){
		System.out.println("*");
		
		
		
		    int i = 0;
		    while ( i < sideSize ) {
		    	printSquare (sideSize);
		        i++;	
		}
		    }
		
	
	}
		*/
	/*private static void printStars(int amount) {
	    // you can print one star with the command
	    System.out.print("*");
	    // call this command amount times
	}

	public static void main(String[] args) {
	    printStars(5);
	    
	    printStars(9);
	}*/

package servletit;

import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.*;
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.*; 
//import javax.servlet.http.HttpServletRequest;  
//import javax.servlet.http.HttpServletResponse;  

  
@WebServlet("/Course")  
public class MyServletcourse extends HttpServlet {  


    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                            throws ServletException, IOException {  
  
  ArrayList<Course> courses = new ArrayList<Course>();
      Course c1 =new Course("Servlet",1);
       Course c2=new Course("Java ServerPages",1);
        Course c3=new Course("Java ServerFace",2);
       Course c4= new Course("Java ServerFace1",2);
       courses.add(c1);
       courses.add(c2);
       courses.add(c3);
       courses.add(c4);
       courses.add(new Course("Java persistance",2));
       HttpSession session= request.getSession;
       if(session getAttribute("courses")==null)
        session.setAttribute("courses",courses);
    else
        courses=(ArrayList<Course>)session.getAttribute("courses");
       /* Collections.sort(courses, new Comparator<Course>() {
            @Override
            public int compare(Course c1, Course c2) {
                return c1.getName().compareTo(c2.getName));
            }
        });*/
        

        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.print("<html><body>");  
        out.print("<h3>Couses in the list</h3>"); 
         
        out.print("<table border=2>");  
        for (Course c: courses)
            out.println("<tr><td>" + c.getName() + "</td><td>" + c.getDays() + "</td></tr>");
     } 
        out.print("</table>");
        out.print("<html><body>"); 
        out.print("<form method=post>"); 
        out.print("Name<input type=text name=name />"); 
        out.print("Days<input type=text name=days>"); 
        out.print("<input type=submit/>");
        out.print("</form>"); 
        out.print("</body></html>");
         
       
        public void doPost(HttpServletRequest request.HttpServletResponse response) throws ServletException, IOException {  
        PrintWriter out;
        response.setContentType( "text/html");
        out= response.getWriter();
        String name=request.getParameter("name") ;
        Integer days=Integer.parseInt(request.getParameter("days")) ;
        HttpSession session =request.getSession();
        ArrayList<Course>  course=(ArrayList<Course>) session.getAttribute("courses")  ;
        if(name!= null&& days !=null && name.lenght()>0){ 
            Course newCourse=new (name,days);
            out.println("<p>New course added: "+ newCourse +"</p>");
            courses add(newCourse);
            session.setAttribute("courses",courses);
}
            out.print("<table border=2>");
            for(Course c: courses){
                out.println("<tr><td>" + c.getName() + "</td><td>" + c.getDays() + "</td></tr>"); 
            }


          /* Collections.sort(courses, new Comparator<Course>() {
            @Override
            public int compare(Course c1, Course c2) {
                return c2.getName().compareTo(c1.getName());
            }*/
        

       /* out.print("<h3>Sorted by name (reverse order)</h3>");  
        out.print("<ol>");  
        for (Course c: courses)
            out.println("<li>" + c );
        out.print("</ol");  
        out.print("</body></html>"); */ 
    }  
}  


	
	