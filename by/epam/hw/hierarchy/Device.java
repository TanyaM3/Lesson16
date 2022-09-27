package by.epam.hw.hierarchy;

import java.io.Serializable;
import java.util.Objects;

public class Device implements Serializable {
	private static final long serialVersionUID = 1L;

	private String type;
	private String brand;
	private int weight;
	private int powerConsumption;
	private boolean state;

	public Device() {

	}

	public Device(String type, String brand, int weight, int powerConsumption) {
		this.type = type;
		this.brand = brand;
		this.weight = weight;
		this.powerConsumption = powerConsumption;
		state = false;
	}

	public boolean isOn() {
		return state;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, powerConsumption, state, type, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		return Objects.equals(brand, other.brand) && powerConsumption == other.powerConsumption && state == other.state
				&& Objects.equals(type, other.type) && weight == other.weight;
	}

	@Override
	public String toString() {
		return "Device [type=" + type + ", brand=" + brand + ", weight=" + weight + ", powerConsumption="
				+ powerConsumption + ", state=" + state + "]";
	}
}