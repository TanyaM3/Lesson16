package by.epam.hw.hierarchy;

import java.util.Objects;

public abstract class ElectricalDevice extends Device {

	private String type;
	private int powerConsumption;
	private boolean state;

	public ElectricalDevice() {
		super();
	}

	public ElectricalDevice(String typeOfDevice, String brand, int weight, String type, int powerConsumption) {
		super("Electrical Device", brand, weight);
		this.type = type;
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
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(powerConsumption, state, type);
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
		ElectricalDevice other = (ElectricalDevice) obj;
		return powerConsumption == other.powerConsumption && state == other.state && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "ElectricalDevice [type=" + type + ", powerConsumption=" + powerConsumption + ", state=" + state + "]";
	}
}