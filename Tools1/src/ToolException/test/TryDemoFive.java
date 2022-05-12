package ToolException.test;

public class TryDemoFive {

	public static void main(String[] args) {
		try {
			testThree();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testOne() throws HotelAgeException {
		throw new HotelAgeException();
	}

	public static void testTwo() throws Exception {
		try {
			testOne();
		} catch (HotelAgeException e) {
			throw new Exception("我是新产生的异常1",e);
//			throw new Exception("我是新产生的异常1");
		}
	}

	public static void testThree() throws Exception {
		try {
			testTwo();
		} catch (Exception e) {
			Exception e1=new Exception("我是新产生的异常2");
			e1.initCause(e);
			throw e1;

//			throw new Exception("我是新产生的异常2",e);

//			throw new Exception("sdadasdadasd");
		}
	}
}
