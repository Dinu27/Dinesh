package org.lang;

public class StateDetails extends LanguageInfo {

	public void southIndia() {
		System.out.println("South");
	}

	public void northIndia() {
		System.out.println("North" );
	}

	public static void main(String[] args) {

		StateDetails sd = new StateDetails();

		sd.englishLanguage();
		sd.hindiLanguage();
		sd.tamilLanguage();
		sd.northIndia();
		sd.southIndia();

	}

}
