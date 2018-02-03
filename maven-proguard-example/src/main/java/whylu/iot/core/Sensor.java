package whylu.iot.core;

public class Sensor {
	private Long id;
	private SensorType type;
	private SensorUnit unit;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SensorType getType() {
		return type;
	}
	public void setType(SensorType type) {
		this.type = type;
	}
	public SensorUnit getUnit() {
		return unit;
	}
	public void setUnit(SensorUnit unit) {
		this.unit = unit;
	}
	public void testPublicf() {
		String string = "heelooo";
		System.out.println(string);
		testprivve();
	}
	
	public void testprivve() {
		String string2 = "heelooo";
		System.out.println(string2);
	}
	
}
