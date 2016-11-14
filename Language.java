package testiluokka;

public class Language {
	String name;
	String code;

	public Language() {
		
	}

	public Language(String name, String code) {
		this.name = name;
		this.code = code;
	}

	public void result() {
		System.out.println(name + "(" + code + ")");
		
	}
	
	@Override
	public String toString() {
		
		return (name!= null ?   name + "             " : "") + (code != null ?   code : "      ") 
				+ "               @" + Integer.toHexString(this.hashCode()) + " and class "
				+ this.getClass().getSimpleName();
	}

}
