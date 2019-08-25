package A_Practic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Counter_Convet_Map_List {
	public static void main(String[] args) {

		String s = "A b a B c D a b A f G g H j k F g h";
		String sf = s.toLowerCase();
		String arr[] = sf.split(" ");

		ArrayList<String> list = new ArrayList(Arrays.asList(arr));

		Map<String, Integer> tmap = new HashMap<String, Integer>();

		for (String t : list) {
			Integer c = tmap.get(t); // System.out.println(tmap.get("a"));
			tmap.put(t, (c == null) ? 1 : c + 1);
		}

		List<Entry<String, Integer>> sortedlist = new LinkedList<Entry<String, Integer>>(tmap.entrySet());

		Collections.sort(sortedlist, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

				return o1.getValue().compareTo(o2.getValue());
			}
		});

		Collections.reverse(sortedlist);
		sortedlist.forEach(System.out::println);

	}
}
