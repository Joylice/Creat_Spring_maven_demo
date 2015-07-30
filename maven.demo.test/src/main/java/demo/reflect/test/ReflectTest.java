package demo.reflect.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest {

	public static Car initByDefaultConst() throws Throwable {

		// 通过类装载器获取Car类对象

		Class clazz = Class.forName("demo.reflect.test.Car");
        Car car = (Car) clazz.newInstance();
		// 获取类的默认构造器对象并通过它实例化Car
		Constructor cons = clazz.getDeclaredConstructor();
		Field field = clazz.getDeclaredField("brand");
		field.setAccessible(true);
		field.set(car, "1111");
		

		// //通过反射方法设置属性
//		Method setBrand = clazz.getMethod("setBrand", String.class);
//		setBrand.invoke(car, "1111");
  
		
		// Method setColor=clazz.getMethod("setColor", String.class);
		// setColor.invoke(car, "2222");
		// Method setMaxSpeed=clazz.getMethod("setMaxSpeed", int.class);
		// setMaxSpeed.invoke(car,2222);
//		car.toString2("1111");

		return car;
	}

	public static void main(String[] args) throws Throwable {
		Car car = initByDefaultConst();
		car.introduce();
	}
}
