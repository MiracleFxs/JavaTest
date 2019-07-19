package annotation;

public class ParseAnn {
	public static void main(String[] args) {
		//1.使用类加载器加载类
		try {
			Class c=Class.forName("annotation.Child");
			//2.找到类上面的注解
			boolean isExit=c.isAnnotationPresent(c);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
