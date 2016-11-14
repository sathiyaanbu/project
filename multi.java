
package astrick;

/* assign -1
public class multi {

	
	public static void main(String[] args) {
		int j=10;
		for(int i=1; i<=10; i++)
			
			
		System.out.println(i +"*"+ j + "=" +i*j);


     for (int a=1;a<=10; a++) {
    	 System.out.print("\n");
    	 for(int b=1;b<=10;b++){
    		 System.out.println(a +"*"+ b + "=" +a*b);
    	 }
    	 System.out.println(""); 
     }
     }
}*/

//assign-5 
class Henkilo  //
{
  private String name; //class variables
  private int age; 
  private int height;
  private int weight;
  

  // Constructors, initialization of the class variable values.
 
  public Henkilo (String n, int a, int h, int w){
	  name=n;
	  age=a;
	  height=h;
	  weight=w;
	  
  }
  //  member variable - setmethod
  public void set_age(int a){
	 age=a;
	  
  }
  public void set_weight(int w){
	  weight=w;
  }
  public void set_height(int h){
	  height=h;
  }
  public void set_name(String n){
	  name=n;
  }
  // print people information
  public void tulosta( ){
	  
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
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public String toString() {
	return "Henkilo [name=" + name + ", age=" + age + ", height=" + height
			+ ", weight=" + weight + ", getName()=" + getName() + ", getAge()="
			+ getAge() + ", getHeight()=" + getHeight() + ", getWeight()="
			+ getWeight() + "]";
}

}
