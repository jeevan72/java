import java.util.Random;
class square extends Thread{
    int x;
    square(int x){
        this.x=x;

    }
   public  void run(){
    int s =x*x;
    System.out.println("Square of"+x+"is"+s);

    }
}
class cube extends Thread{
    int x;
    cube (int x){
        this.x=x;

    }
    public void run(){
        int c=x*x*x;
        System.out.println("cube of"+x+"is"+c);


    }
}
class random extends Thread {
    public void run(){
        Random r=new Random();
        for(int i=0;i<5;i++){
            
            int randomint=r.nextInt(10);
            System.out.println("random int is :"+randomint);
            square s=new square(randomint);
            s.start();
            cube c=new cube(randomint);
            c.start();
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class lab extends Thread{
    public static void main(String[] args) {
        random r=new random();
        r.start();   
    }
}