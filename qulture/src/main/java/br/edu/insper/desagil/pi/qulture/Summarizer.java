package br.edu.insper.desagil.pi.qulture;

import java.util.List;

public class Summarizer {
	private List<Employee> employees;

	public Summarizer(List<Employee> employees, List<Manager> managers) {
		this.employees = employees;
		for (Manager manager : managers) {
			this.employees.add(manager);
		}
	}

	public double summarize() {
		double sum = 0;
		for (Employee employee : employees) {
			sum += employee.totalGrade();
		}
		return sum / (employees.size());
	}
}
