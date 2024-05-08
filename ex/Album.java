package extends1.ex;

public class Album extends Item {

    @Override
    public void print() {
        super.print();
        System.out.println("-아티스트:"+artist);
    }

    private String artist;

    public Album(String name,int price,String artist) {
        super(name,price);
        this.artist=artist;
    }


}
