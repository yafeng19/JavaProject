class Rectangle {
    private float length;
    private float width;
    public float getLength(){
        return length;
    }
    public void setLength(float length){
        this.length = length;
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public float Area(float length, float width){
        return length*width;
    }
}
class Cuboid extends Rectangle{
    private float height;
    public float getHeight(){
        return height;
    }
    public void setHeight(float height){
        this.height = height;
    }
    public float Volume(float length, float width, float height){
        return length*width*height;
    }
}
public class RectangleTest{
    public static void main(String args[]){
        Cuboid cub = new Cuboid();
        cub.setLength(5.0f);
        cub.setWidth(4.0f);
        cub.setHeight(3.0f);
        System.out.println("长方体的长："+cub.getLength()
                +"，宽："+ cub.getWidth()
                +"，高："+ cub.getHeight());
        System.out.println("长方体的底面积为："+cub.Area(cub.getLength(),cub.getWidth())
                +"，体积为："+cub.Volume(cub.getLength(),cub.getWidth(),cub.getHeight()));
    }
}