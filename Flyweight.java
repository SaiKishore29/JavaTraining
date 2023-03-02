package Flyweight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Flyweight{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		List<String> paint=Arrays.asList("Red", "Green", "Blue", "White", "Yellow");
		System.out.println(paint);
		while(true) {
		System.out.println("Enter Color:");
		String color=scan.next();
		ColorBrush colorBrush=(ColorBrush)PaintFactory.getColor(color);
		colorBrush.paint();
		}
	}

}
interface Brush{
	void paint();
}
class ColorBrush implements Brush{
	private String color;
	public ColorBrush(String color) {
		this.color=color;
	}

	@Override
	public void paint() {
		System.out.println("Paint color="+color);
		
	}
	
}
class PaintFactory{
	private static final HashMap<String, ColorBrush> colorMap = new HashMap<>();

	public static Brush getColor(String color) {
		ColorBrush colorBrush = (ColorBrush) colorMap.get(color);
		if (colorBrush == null) {
			colorBrush = new ColorBrush(color);
			colorMap.put(color, colorBrush);
			System.out.println("Buying color : " + color);	
		}
		System.out.println(colorMap);
		return colorBrush;
	}
	
}
