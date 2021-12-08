import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class HashmapSorting {
	public static void main(String[] args) {
		int key;
		String value;
		Map<Integer, String> unsortedMap=new HashMap<>();
		unsortedMap.put(22, "A");
		unsortedMap.put(11, "C");
		unsortedMap.put(33, "Z");
		unsortedMap.put(44, "D");
		unsortedMap.put(99, "Y");
		unsortedMap.put(88, "O");
		
		Map<Integer, String> sortingMapbyKey=unsortedMap.entrySet().stream()
		.sorted(Entry.comparingByKey())
		.collect(Collectors.toMap(entry->entry.getKey(), entry->entry.getValue(),
				(entry1,entry2)->entry2,LinkedHashMap::new));
		System.out.println("After sorting by key in ascending order"+
				sortingMapbyKey);
		
		done 
		
		
		
		
		Map<Integer, String> sortingMapbyValue=unsortedMap.entrySet().stream()
				.sorted(Collections.reverseOrder(Entry.comparingByValue()))
				.collect(Collectors.toMap(entry->entry.getKey(), entry->entry.getValue(),
						(entry1,entry2)->entry2,LinkedHashMap::new));
		System.out.println("After sorting by value in descending order"+sortingMapbyValue);
		
		
		
		
		
	}

}
