package exception;

/**
 * checked 异常
 * @author ddh
 *
 */
public class Exception2 extends Exception {
	private String content;

	public Exception2(String content) {
		super();
		this.content = content;
	}

	public Exception2() {
		super();
	}
	
	
}
