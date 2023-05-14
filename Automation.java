package week3.day1;

public class Automation extends MultipleLanguage {
	
	public void Java() {
		System.out.println("Java method");
	}

	public void Selenium() {
		System.out.println("Selenium method");		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby method");		
		
	}

	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.Java();
		auto.Selenium();
		auto.ruby();
		auto.python();
		

	}

}
