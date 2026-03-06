public class Rectangle{

    private double height;
    private double width;

    //Constructor
    public Rectangle(double height, double width){
        setHeight(height);
        setWidth(width);
    }
    
    //Setter for Height
    public void setHeight(double height){
        if (height >= 0.1 && height <= 20.0){
            this.height = height;
        }
    }
    
    //Setter for Width
    public void setWidth(double width){
        if (width >= 0.1 && width <= 20.0){
            this.width = width;
        }
    }

    //Getter for Heigth
    public double getHeight(){
        return height;
    }

    //Setter for Width
    public double getWidth(){
        return width;
    }

    public double getPerimeter(){
        return 2 * (getHeight() +  getWidth());
    }

    public double getArea (){
        double area = getHeight() * getWidth();
        return area;
    }

    public boolean isSquare(){
        return height == width;
    }
}   


