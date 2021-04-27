package homework2;

public class Main {
       public static void main(String[] args) {
    	   
    	   Member member1 = new Member(3, "Serkan",false);
    	   Member member2 = new Member(4, "Engin",true);
    	   
    	   Member[] members = {member1,member2};
    	   for (Member member : members) {
    		   System.out.println(member.name);
    	   }
    	   
    	   
    	   Course course1 = new Course(45,"KURS1", true);
    	   Course course2 = new Course(46,"KURS2", false);
    	   
    	   Course[] courses = {course1,course2};
    	   for (Course course : courses) {
    		  if(course.availability==true) {
    			  System.out.println(course.name +" = Kurs aktif");
    		  }
    		  else {
    			  System.out.println(course.name +" = Kurs aktif değil");
    		  }
    		  
           } 
    	   
    	   Member[] members1 = {member1,member2};
    	   for (Member member : members1) {
    		   if(member.availability==true) {
    			   System.out.println(member.name +" = Öğrenci Çevrimiçi");
    		   }
    		   else {
    			   System.out.println(member.name +" = Öğrenci Çevrimdışı");
    		   }
    	   }
    	   
    	   
    	   
    	   
    	   
    	 CourseManager courseManager = new CourseManager() ;
    	 courseManager.AddToCourse(course1);
    	 
    	 StudentManager studentManager = new StudentManager();
    	 studentManager.AddStudent(member2);
    	 studentManager.AddStudent(member1);
    	 
    	 //AvailabilityManager availabilityManager = new AvailabilityManager();
    	 //availabilityManager.ShowAvailability(member2);
    	 //availabilityManager.ShowAvailability(member1);
       }
}
