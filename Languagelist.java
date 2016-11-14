package testiluokka;


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Language suomi = new Language();
	suomi.name = "suomi";
	suomi.code = "fi";
	Language ruotsi = new Language();
	ruotsi.name = "ruotsi";
	ruotsi.code = "se";
	Language englanti = new Language();
	englanti.name = "englanti";
	englanti.code = "en";
	suomi.result();
	ruotsi.result();
	englanti.result();
	System.out.println("Language\t  code\t     muistiosoite\t");

	// Kuinka lisätään Kieli-oliot taulukkoon?
	Language[]Languages = new Language[3];
	Languages[0] = suomi;
	Languages[1] = ruotsi;
	Languages[2] = new Language(englanti.name, englanti.code);
	Languages[2].code = "en-EN";

	System.out.println(suomi);
	System.out.println(ruotsi);
	System.out.println(englanti);

	if (englanti ==Languages[2]) {
		System.out.println("englanti == kieli[2]");
	}

	for (Language k : Languages) {
		System.out.println(k);
	}}} 
