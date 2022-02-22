package cc.code;

import java.util.ArrayList;
import java.util.List;

public class HadukenValidation {

	protected List<String> validatePerson(Person person) {
		
		List<String> constraints = new ArrayList<String>();
		if (person != null) {
			if (person.cpf != null) {
				if (person.name != null) {
					if (person.hardPhones != null) {
						for (String phone : person.hardPhones) {
							if (phone != null) {
								if (phone.isEmpty()) {
									constraints.add("Error - Invalid Phone number");
									return constraints;
								} else {
									if(phone.length() < 7){
										constraints.add("Error - Invalid Phone number");
										return constraints;
									}
								}
								
							} else {
								constraints.add("Error - Invalid Phone number");
								return constraints;
							}
						}
					}
				}
			}
		}

		return constraints;
	}
}
