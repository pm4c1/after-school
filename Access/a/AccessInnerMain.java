package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public
        data.publicField = 1;
        data.publicMethod();

        // default
        data.defaultField = 2;
        data.defaultField();

        // privata - 다른 클래스에서 호출 불가
        // data.privataFiled = 3;
        // data.privateMethod();

        data.innerAccess();
    }
}
