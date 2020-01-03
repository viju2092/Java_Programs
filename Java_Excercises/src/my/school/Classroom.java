package my.school;

public class Classroom {

   String name;
   int age;
   
   public Classroom() {}
   
   public Classroom(String value, int agee)
   {
	   name = value;
	   age = agee;
   }
   
   public String getName() {
	return name;
	
}
   
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
