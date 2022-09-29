package by.epam.hw.hierarchy;

import java.io.Serializable;
import java.util.Objects;

public abstract class Device implements Serializable{
	private static final long serialVersionUID = 1L;

	private String typeOfDevice;
	private String brand;
	private int weight;

	public Device() {
		
	}
	
	public Device(String typeOfDevice, String brand, int weight) {
		this.typeOfDevice = typeOfDevice;
		this.brand = brand;
		this.weight = weight;
	}

	public String getTypeOfDevice() {
		return typeOfDevice;
	}

	public void setTypeOfDevice(String typeOfDevice) {
		this.typeOfDevice = typeOfDevice;
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

	@Override
	public int hashCode() {
		return Objects.hash(brand, typeOfDevice, weight);
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
		return Objects.equals(brand, other.brand) && Objects.equals(typeOfDevice, other.typeOfDevice)
				&& weight == other.weight;
	}

	@Override
	public String toString() {
		return "Device [typeOfDevice=" + typeOfDevice + ", brand=" + brand + ", weight=" + weight + "]";
	}
}
