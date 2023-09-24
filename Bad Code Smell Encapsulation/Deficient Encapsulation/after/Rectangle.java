public class Rectangle {
    public int width;
    public int height;

    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return 2 * (width + height);
    }
    
    public int getWicth() {
    	return width;
    }
    
    public void setWidth(int width) {
    	this.width = width;
    }
    
    public int getHeight() {
    	return height;
    }
    
    public void setHeight(int height) {
    	this.height = height;
    }
}
