package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    List<Student> list = new ArrayList<>();

    public void enroll(Student student) {
        this.list.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return list.contains(student);
    }

    public void lecture(double numberOfHours) {
        list.forEach(x -> x.learn(numberOfHours));
    }

    public Map<Student, Double> getStudyMap() {
        return list
                .stream()
                .collect(Collectors.toMap(student -> student, s -> s.getTotalStudyTime()));
    }
}
