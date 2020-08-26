package org.dxc.mongodb.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection="employee")
public class Employee {
	@Id
	private int employeeId;
	private String firstName;
	private String lastName;
	private String jobTitle;
	private double salary;
	
	

}
