package day08.com;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(87875461);
		al.add(87875462);
		al.add(87875463);
		al.add(87875464);
		al.add(87875465);
		al.add(87875466);
		al.add(87875467);
		al.add(87875468);
		al.add(87875469);
		al.add(87875460);
        
		
		for(Integer x:al)
		{
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("Remove index 2");
		al.remove(2);
		
		for(Integer y:al)
		{
			
			System.out.println(y);
//			System.out.println("hello");
		}
		
		System.out.println();
		System.out.println("Add.....");
		al.add(123456788);
		
		for(Integer y:al)
		{
			
			System.out.println(y);
          
		}
		
//		Replace
		
		System.out.println();
		System.out.println("Replace");
		al.set(5, 4561);
		
		for(Integer y:al)
		{
			
			System.out.println(y);
		}
		System.out.println();
		
		if(al.contains(912233102)==true)
		{
			System.out.println("contain");
		}
		else
		{
			System.out.println("Not contain");
		}
		for(Integer y:al)
		{
		
			
			System.out.println(y);
		}
		
		
		
	}

}
