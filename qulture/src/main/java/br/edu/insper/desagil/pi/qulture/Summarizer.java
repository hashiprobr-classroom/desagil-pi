package br.edu.insper.desagil.pi.qulture;

import java.util.List;
import java.util.Map;

public class Summarizer {
	private List<Employee> employees;
	private List<Manager> managers;

	public Summarizer(List<Employee> employees, List<Manager> managers) {
		this.employees = employees;
		this.managers = managers;
	}

	public double summarize() {
		double sum = 0;
		int employeesSize = employees.size();
		int managersSize = managers.size();

		if (employeesSize != 0 || managersSize != 0) {
			for (Employee employee : employees) {
				sum += employee.getGrade();
			}

			for (Manager manager : managers) {
				double managedSum = 0;
				Map<String, Employee> managed = manager.getManaged();

				if (!managed.isEmpty()) {
					for (Employee employee : managed.values()) {
						managedSum += employee.getGrade();
					}
					sum += managedSum;
				}

				sum += (manager.getGrade() + managedSum / managed.size()) / 2;
			}
		}

		return sum / (employeesSize + managersSize);
	}
}
