//encapsulationin java is a mechanism of wrapping 
//the data (variables) and code acting on the data
//(methods)together as a single unit....|use...hide a variable
import java.util.*;
class person{

    private String name;

    public void setname(String newname) 
    {
        this.name = newname;

    }
    public String getname() 
    {
        return this.name;
    }
}

public class incapsulation {

    public static void main(String[] args) {
        person ss = new person();
        ss.setname("jill");

        System.out.println("name:" + ss.getname());

    }
}
