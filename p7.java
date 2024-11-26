import java.util.Scanner;
interface Resizable {
void resizeWidth(int width);
void resizeHeight(int height);
}
class Rectangle implements Resizable {
private int width;
private int height;
public Rectangle(int width, int height) {
this.width = width;
this.height = height;
}
@Override
public void resizeWidth(int newWidth) {
this.width = newWidth;
System.out.println("New width: " + width);
}
@Override
public void resizeHeight(int newHeight) {
this.height = newHeight;
System.out.println("New height: " + height);
}
public void displayDimensions() {
System.out.println("Current dimensions: " + width + " x " +
height);
}
}
public class p7{
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
Rectangle rectangle = new Rectangle(10,5) ;
rectangle.displayDimensions();
System.out.println("Enter the new width and height");
int w=sc.nextInt();
int h=sc.nextInt();
rectangle.resizeWidth(w);
rectangle.resizeHeight(h);
rectangle.displayDimensions();
}
}