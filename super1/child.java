package extends1.super1;

public class Child extends Parent{
    public String value = "child";

    @Override
    public void hello(){
        System.out.println("Child.hello");
    }

    public void call(){
        System.out.println("자식의 값: " + this.value); // this 생략 가능
        System.out.println("부모의 값: " + super.value);

        this.hello(); // this 생략 가능  같은 hello지만 자식 , 부모를 골라서 가능
        super.hello();
    }

}
