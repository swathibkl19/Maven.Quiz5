package rocks.zipcode.io.quiz4.collections;

import java.util.Objects;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    private Integer id;
    private Double totalStudytime;

    public Student() {

        this(0);
    }

    public Student(Integer id) {
        this.id = id;
        this.totalStudytime = 0.0;
    }

    public void learn(Double amountOfHours) {
        this.totalStudytime = amountOfHours + totalStudytime;

    }

    public Double getTotalStudyTime() {

        return this.totalStudytime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

