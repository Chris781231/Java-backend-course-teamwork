package employee.entity;

import lombok.*;

@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Employee {

    @NonNull
    @Getter
    private final String name;

    @NonNull
    @Getter
    private final int yearOfBirth;

    @Setter
    @Getter
    private int salary;

    public void increaseSalaryByAmount(int amount) {
        salary += amount;
    }

    public void increaseSalaryByPercent(int percent) {
        salary = salary + (salary * percent / 100);
    }

    public void decreaseSalaryByAmount(int amount) {
        salary -= amount;
    }

    public void decreaseSalaryByPercent(int percent) {
        salary = salary - (salary * percent / 100);
    }
}

