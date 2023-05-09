package StructuralDP.CompositeDP;

import java.util.List;

abstract class Department {

    abstract String getName();

    //bütün departmanlarda çalışanları getirecek method
    abstract List<String> getEmployes();


}
