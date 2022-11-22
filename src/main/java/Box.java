public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height)
    {
        setLength(length);
        this.width = width;
        this.height = height;
    }

    private void setLength(double length){
        this.length = length;
    }
}
