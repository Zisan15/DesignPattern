package StructuralDP.CompositeDP;

import java.util.List;
import java.util.stream.Collectors;

public class RegionalDepartment extends Department{

    //bütün departmanları bir değişken üzerinde kontrol etmek için oluşturuldu
    List<Department> childDepartments;

    //parametreli constructor
    public RegionalDepartment(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    @Override
    String getName() {//firmada olan bütün departmanların isimlerini getirsin
        return childDepartments.stream().//stream yapıda departmanlar geliyor
                map(Department::getName).//stream yapıda departman isimleri geliyor
                collect(Collectors.joining(", "));//Collectors.joining() ==> objeleri String hale çevirir
    }

    @Override
    List<String> getEmployes() {//firmada bütün çalışanların isimleri
        return childDepartments.stream().
                flatMap(d->d.getEmployes().stream()).
                collect(Collectors.toList());
    }
}
