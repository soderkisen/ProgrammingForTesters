package se.jocke.api.mapper;

import se.jocke.api.DepartmentModel;
import se.jocke.department.entity.Department;

import java.util.List;
import java.util.stream.Collectors;

public class DepartmentModelsMapper {
    public static List<DepartmentModel> map(List<Department> departments) {
        return departments.stream().map(DepartmentModelMapper::map).collect(Collectors.toList());
    }
}
