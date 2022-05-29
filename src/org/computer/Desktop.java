package org.computer;

public class Desktop extends Computer{
private void desktopSize() {
System.out.println("desktop size is 15inch");
}
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.desktopSize();
	d.computerModel();
	d.computerProcessor();
}
}
