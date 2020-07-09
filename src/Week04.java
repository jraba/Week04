import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week04 {

	public static void main(String[] args) {

//1. and 4. 
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Randall");
		employeeNames.add("William");
		employeeNames.add("Robert");
		employeeNames.add("Renee");
		employeeNames.add("Nick");

//2. and 4.  
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(1);
		ids.add(10);
		ids.add(34);
		ids.add(4);
		ids.add(9);

//3. 
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		int index = 0;

//5.		
		for (int id : ids) {
			String employeeName = employeeNames.get(index);
			employeeMap.put(id, employeeName);
			index += 1;
		}

		System.out.println(employeeMap);
//5. employeeMap Populated : 1=Randall, 34=William, 4=Robert, 9=Renee, 10=Nick
//6.
		for (int id: employeeMap.keySet()) {
			System.out.println(id + "-" + employeeMap.get(id));
			
		}

//7. and 8. and 9.
		StringBuilder idsBuilder = new StringBuilder();
		
		for(int id: ids) {
		idsBuilder.append(id).append("-");
		
		}
		
		System.out.println(idsBuilder.toString());

//10. and 11. and 12.
		StringBuilder namesBuilder = new StringBuilder();
		
		for (String employeeName : employeeNames) {
			namesBuilder.append(employeeName).append(" ");
			
		}
		
		System.out.println(namesBuilder.toString());
	}

}

