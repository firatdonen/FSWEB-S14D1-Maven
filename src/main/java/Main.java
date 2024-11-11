import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.pool.Rectangle;
import com.workintech.pool.Cuboid;
import com.workintech.developers.Employee;
import com.workintech.developers.SeniorDeveloper;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.HRManager;
import org.junit.jupiter.engine.execution.AfterEachMethodAdapter;

public class Main {
    public static void main(String[] args) {
//        System.out.println("*********silindir için**************");
//    Circle circle= new Circle(3.75);
//        System.out.println("circle.radius="+circle.getRadius());
//        System.out.println("circle.area="+circle.getArea());
//
//     Cylinder cylinder=new Cylinder(5.55,7.25);
//        System.out.println("cylinder.radius="+cylinder.getRadius());
//        System.out.println("cylinder.height="+cylinder.getHeight());
//        System.out.println("cylinder.area="+cylinder.getArea());
//        System.out.println("cylinder.getArea="+cylinder.getVolume());
//        System.out.println("***********havuz alanı için******************");

//        Rectangle rectangle=new Rectangle(5,10);
//        System.out.println("rectangle.width="+rectangle.getWidth());
//        System.out.println("rectangle.length="+rectangle.getLength());
//        System.out.println("rectangle.area="+rectangle.getArea());
//        Cuboid cuboid=new Cuboid(5,10,5);
//        System.out.println("cuboid.width="+cuboid.getWidth());
//        System.out.println("cuboid.length="+cuboid.getLength());
//        System.out.println("cuboid.area="+cuboid.getArea());
//        System.out.println("cuboid.height="+cuboid.getHeight());
//        System.out.println("cuboid.volume="+cuboid.getVolume());

        System.out.println("*********developers*******************");
        // üç parametereli construstor için objeler

        JuniorDeveloper jd1 = new JuniorDeveloper(1, "Ahmet", 500000);
        JuniorDeveloper jd2 = new JuniorDeveloper(1, "Hasan", 500000);


        MidDeveloper md1 = new MidDeveloper(2, "rwer", 59999);
        MidDeveloper md2= new MidDeveloper(3,"hasan",34355);

        SeniorDeveloper sd1= new SeniorDeveloper(1,"jale",34235);
        SeniorDeveloper sd2=new SeniorDeveloper(4, "davut",5345);

        // altı parametreli constructor için objeler
        HRManager hrM = new HRManager(1, "sdffd", 50000,
                new JuniorDeveloper[2], new MidDeveloper[2], new SeniorDeveloper[3]);
        //array capacity belirlemiş olduk


        hrM.addEmployee(0, jd1);
        hrM.addEmployee(1, jd2);


        hrM.addEmployee(0,md1);
        hrM.addEmployee(1,md2);

        hrM.addEmployee(0,sd1);
        hrM.addEmployee(1,sd2);
        hrM.addEmployee(2,sd2);


        System.out.println(hrM.toString());

        System.out.println(jd1);
        jd1.work();
        System.out.println(jd2);
        jd2.work();

    }

}