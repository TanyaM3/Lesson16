package by.epam.hw.hierarchy;

import java.util.Objects;

public class Oven extends ElectricalDevice{
	private static final long serialVersionUID = 1L;

	private int maxTemp;
	private int programmsNumber;

	public Oven() {
		super();
	}
	
	public Oven(String typeOfDevice, String brand, int weight, String type, int powerConsumption, int maxTemp,
			int programmsNumber) {
		super("Oven", brand, weight, type, powerConsumption);
		this.maxTemp = maxTemp;
		this.programmsNumber = programmsNumber;
	}

	public int getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(int maxTemp) {
		this.maxTemp = maxTemp;
	}

	public int getProgrammsNumber() {
		return programmsNumber;
	}

	public void setProgrammsNumber(int programmsNumber) {
		this.programmsNumber = programmsNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(maxTemp, programmsNumber);
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
		Oven other = (Oven) obj;
		return maxTemp == other.maxTemp && programmsNumber == other.programmsNumber;
	}

	@Override
	public String toString() {
		return "Oven [maxTemp=" + maxTemp + ", programmsNumber=" + programmsNumber + "]";
	}
}
