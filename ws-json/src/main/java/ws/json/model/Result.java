package ws.json.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Result {

	private Object result;

	
	public Result() {
		super();
	}


	public Result(Object result) {
		super();
		this.result = result;
	}


	public Object getResult() {
		return result;
	}


	public void setResult(Object result) {
		this.result = result;
	}


	@Override
	public String toString() {
		return "Result [result=" + result + "]";
	}

	
}
