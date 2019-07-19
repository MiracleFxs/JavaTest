package annotation;

public interface Person {
	public String name();
	public String age();
	
	//表示sing过时
	@Deprecated
	public String sing();
}
