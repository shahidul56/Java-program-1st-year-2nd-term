package Labtest;
			//140228
import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		TemplateClass<Shape> shpTemp = new TemplateClass<Shape>();
		Circle c = new Circle("red", 2);
		Rectangle r = new Rectangle("Blue", 5, 4);
		squre s = new squre("Yellow", 5);
		
		c.getArea(5);
		shpTemp.set(c);
		Object areaCircle = shpTemp.get();
		System.out.println(areaCircle.toString());
		
		r.getArea(5,4);
		shpTemp.set(r);
		Object areaRec = shpTemp.get();
		System.out.println(areaRec.toString());
		
		s.getArea(5);
		shpTemp.set(s);
		Object areaSq = shpTemp.get();
		System.out.println(areaSq.toString());
		
		
		System.out.println("\n");
		
		ArrayList<Object> array = new ArrayList<Object>();
		array.add(c);
		array.add(r);
		array.add(s);
		
		Iterator<Object> itr=array.iterator();
		
		while (itr.hasNext()) {
			Object element =  itr.next();
			System.out.println(element);

	}

}
}

