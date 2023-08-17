package kro.rubisco.config;


@SuppressWarnings("serial")
public class TestException extends Exception {
	private String msg;
	
    public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public TestException(String msg) {
        super(msg);
    }
	
}
