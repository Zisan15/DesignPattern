package StructuralDP.CompositeDP;

import java.util.Arrays;
import java.util.List;

public class Sales extends Department {
    @Override
    String getName() {
        return "Sales";
    }

    @Override
    List<String> getEmployes() {
        return Arrays.asList("S1", "S2", "S3");
    }
}
