public class Rectangle {

    /* Define fields/attributes */
    private double length;
    private double width;

    /* Method to change the length to a new double */
    public void setLength(double l){
        length = l;
    }

    /* Method to view the length value */
    public double getLength(){
        return length;
    }

    /* Method to change the width to a new double */
    public void setWidth(double w){
        length = w;
    }

    /* Method to view the width value */
    public double getWidth(){
        return width;
    }

    /* Calculate the area using length * width */
    public double getArea(){
        double area = length * width;
        return area;
    }

}

