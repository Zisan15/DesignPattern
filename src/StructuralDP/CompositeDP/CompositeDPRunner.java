package StructuralDP.CompositeDP;

import java.util.Arrays;

public class CompositeDPRunner {

    public void compositeDemo() {

        //child departmanlarımı oluşturuyorum
        Department financeDepartment = new Finance();
        Department salesDeparment = new Sales();
        Department argeDepartment = new Arge();
        //GenelDepartman objeme child departmanları ekliyorum
        Department regionalDepartment =
                new RegionalDepartment(Arrays.asList(financeDepartment, salesDeparment, argeDepartment));

        System.out.println(regionalDepartment.getName());
        System.out.println("************************");
        System.out.println(regionalDepartment.getEmployes());


    }


    public static void main(String[] args) {

        CompositeDPRunner composite = new CompositeDPRunner();
        composite.compositeDemo();
    }
}
