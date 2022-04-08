package ws.json.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Values {

	private Object value1;
	private Object value2;

	public Values() {
		super();
	}

	public Values(Object value1, Object value2) {
		super();
		this.value1 = value1;
		this.value2 = value2;
	}

	public Object getValue1() {
		return value1;
	}

	public void setValue1(Object value1) {
		this.value1 = value1;
	}

	public Object getValue2() {
		return value2;
	}

	public void setValue2(Object value2) {
		this.value2 = value2;
	}

	@Override
	public String toString() {
		return "Values [value1=" + value1 + ", value2=" + value2 + "]";
	}

}
