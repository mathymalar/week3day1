package week3.day1.org.system;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("Size is 1280*720 through 1920*1080");
	}

	public static void main(String[] args) {
		Desktop dsk = new Desktop();
		dsk.desktopSize();
		dsk.computerModel();
	}

}
