package lang.clazz;

import java.lang.reflect.*;

public class ClassMetaMain {
  
    public static void main(String[] args) throws Exception {

        Class clazz = String.class; // 클래스에서 조회
      
        // 모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields)
            System.out.println("Field: " + field.getType() + " " + field.getName());
