package lv.akurss.lesson6.lecture.object_use_case;

public class CarExt {
	private String name;
	private int maxSpeed;

	public CarExt(String name, int maxSpeed) {
		this.name = name;
		this.maxSpeed = maxSpeed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		CarExt carExt = (CarExt) o;

		if (maxSpeed != carExt.maxSpeed) return false;
		return name.equals(carExt.name);
	}

	@Override
	public int hashCode() {
		int result = name.hashCode();
		result = 31 * result + maxSpeed;
		return result;
	}

	@Override
	public String toString() {
		return "CarExt{" +
				"name='" + name + '\'' +
				", maxSpeed=" + maxSpeed +
				'}';
	}
}
