package Class_11_2_Comparator_compare;

import java.util.Comparator;

public class CompareByEmpName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		if (o1.getEmpNmae().compareTo(o2.getEmpNmae()) == 0) {
			return o1.getEmpId().compareTo(o2.getEmpId());
		} else {

			return o1.getEmpNmae().compareTo(o2.getEmpNmae());
		}

	}

}
