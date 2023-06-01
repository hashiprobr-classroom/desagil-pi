package br.edu.insper.desagil.pi.qulture;

import java.util.List;

public class Summarizer {
	private List<Employee> employees;
	private List<Manager> managers;

	public Summarizer(List<Employee> employees, List<Manager> managers) {
		this.employees = employees;
		this.managers = managers;
	}

	public double summarize() {
		double sum = 0;

		for (Employee employee : employees) {
			sum += employee.totalGrade();
		}

		for (Manager manager : managers) {
			sum += manager.totalGrade();
		}

		return sum / (employees.size() + managers.size());
	}
}
