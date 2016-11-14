package book;



import javax.faces.bean.ManagedBean;  
@ManagedBean

public class OsSystem implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private String name="ABC Operation System";
    private String versio="0.11";
    
    public OsSystem (){
    name="ABC Operation System";
    versio= "0.11";
    }
    
public OsSystem( String n,String v){
	this.name=n;
	this.versio=v;
}
		public String getName(){
			return name;
		}
		
		public void setName(String n){
			this.name= name;
		}
		
		public String getversio(){
			return versio;
		}
		
		public void setVersio(){
			this.versio=versio;
		}

		@Override
		public String toString() {
			return "OsSystem [name=" + name + ", versio=" + versio + "]";
		}
		
	
}


    