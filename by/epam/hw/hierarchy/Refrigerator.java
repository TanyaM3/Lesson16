package by.epam.hw.hierarchy;

import java.io.Serializable;
import java.util.Objects;

public class Refrigerator extends ElectricalDevice implements Serializable {
	private static final long serialVersionUID = 1L;

	private int freezerCapacity;
	private int overallCapacity;
	
	public Refrigerator() {
		super();
	}

	public Refrigerator(String typeOfDevice, String brand, int weight, String type, int powerConsumption,
			int freezerCapacity, int overallCapacity) {
		super("Refrigerator", brand, weight, type, powerConsumption);
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
	}

	public int getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public int getOverallCapacity() {
		return overallCapacity;
	}

	public void setOverallCapacity(int overallCapacity) {
		this.overallCapacity = overallCapacity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(freezerCapacity, overallCapacity);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Refrigerator other = (Refrigerator) obj;
		return freezerCapacity == other.freezerCapacity && overallCapacity == other.overallCapacity;
	}

	@Override
	public String toString() {
		return "Refrigerator [freezerCapacity=" + freezerCapacity + ", overallCapacity=" + overallCapacity + "]";
	}
}