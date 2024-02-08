package weektwo;

import java.util.Map;

public class PaymentTxn {

	private Map<String, String> data;

	public Map<String, String> getData() {
		return data;
	}

//	public void setData(Map<String, String> data) {
//		this.data = data;
//	}

	public PaymentTxn() {
		// TODO Auto-generated constructor stub
	}	

	public PaymentTxn(Map<String, String> rw) {
		this.data = rw;
	}

}
