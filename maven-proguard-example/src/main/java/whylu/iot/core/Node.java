package whylu.iot.core;

public class Node {
	private Long id;
	private String url;
	private Sensor sensor;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Sensor getSensor() {
		return sensor;
	}
	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}
	
	protected void nodeProt() {
		Sensor sensor= new Sensor();
		sensor.getUnit();
		sensor.testPublicf();
	}
	
	public static void main(String[] args) {
		NodeChild child = new NodeChild();
		child.CallProt();
	}
}
