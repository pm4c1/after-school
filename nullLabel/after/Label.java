package nullLabel.after;

public class Label {

    private String label;
    // private 이기에 세터, 생성자로 값을 넣을 수 있음

    public Label(String label){
        this.label = label;
    }

    public void display(){
        System.out.println("display : " + label);
    }

    @Override
    public String toString() {
        return "\"" + label + "\"";
    }

    public boolean isNull() {
        return false;
    }
}
