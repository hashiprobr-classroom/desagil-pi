package br.edu.insper.desagil.pi.qulture;

import java.util.HashMap;
import java.util.Map;

public class Manager {
	private int id;
	private String name;
	private double grade;
	private Map<String, Employee> managed;

	public Manager(int id, String name) {
		this.id = id;
		this.name = name;
		this.grade = 0;
		this.managed = new HashMap<>();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public Map<String, Employee> getManaged() {
		return managed;
	}

	public void addManaged(String position, Employee employee) {
		managed.put(position, employee);
	}

	public void removeManaged(String position) {
		managed.remove(position);
	}

	public void evaluate(String position, double grade) {
		managed.get(position).setGrade(grade);
	}
}
