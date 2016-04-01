import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class testSchedule {

	@SuppressWarnings("static-access")
	@Test
	public void test() {
		Schedule s = new Schedule();
		String a = "first";
		String b = "second";
		List<Work> works = new ArrayList<Work>();
		works.add(new Work(a,1,4));
		List<Double> lst = new ArrayList<Double>();
		lst.add((double) 4);
		lst.add((double) 1);
		assertEquals(lst,s.FCFS(works));
		List<Double> lst1 = new ArrayList<Double>();
		lst1.add((double) 4);
		lst1.add((double) 1);
		assertEquals(lst,s.SJF(works));
		
		List<Work> works1 = new ArrayList<Work>();
		works1.add(new Work(a,1,4));
		works1.add(new Work(b,2,3));
		List<Double> lst9 = new ArrayList<Double>();
		lst9.add((double) 5);
		lst9.add((double) 1.5);
		assertEquals(lst9,s.FCFS(works1));
		
		List<Work> works2 = new ArrayList<Work>();
		works2.add(works1.get(1));
		works2.add(works1.get(0));
		assertEquals(works2,s.sortByServiceTime(works1));
		List<Work> works5 = new ArrayList<Work>();
		works5.add(new Work(a,1,3));
		works5.add(new Work(b,2,4));
		List<Work> works6 = new ArrayList<Work>();
		works6.add(works5.get(0));
		works6.add(works5.get(1));
		assertEquals(works6,s.sortByServiceTime(works5));
		List<Work> works3 = new ArrayList<Work>();
		works3.add(new Work(a,1,3));
		works3.add(new Work(b,2,4));
		works3.add(new Work(b,3,2));
		List<Double> lst3 = new ArrayList<Double>();
		lst3.add((double) 4.66666666666666667);
		lst3.add((double) 1.5);
		assertEquals(lst3,s.SJF(works3));
	}

}
