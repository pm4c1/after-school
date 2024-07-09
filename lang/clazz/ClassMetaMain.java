package lang.clazz;

import java.lang.reflect.*;

public class ClassMetaMain {
  
    public static void main(String[] args) throws Exception {

        Class clazz = String.class; // 클래스에서 조회
      
        // 모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields)
            System.out.println("Field: " + field.getType() + " " + field.getName());

        // 모든 메서드 출력
        Method[] methods = clazz.getDeclaredMethods();
        for (Method  method : methods)
            System.out.println("Method: " + method);

        // 상위 클래스 정보 출력
        System.out.println("SuperClass: " + clazz.getSuperclass().getName());

        // 인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();

        for (Class i : interfaces)
            System.out.println("Interface: " + i.getName());
