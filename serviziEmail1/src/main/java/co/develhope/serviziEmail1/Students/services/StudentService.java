package co.develhope.serviziEmail1.Students.services;

import co.develhope.serviziEmail1.Students.entities.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    static List<Student> students = Arrays.asList(
            new Student("1", "May", "Ch", "omaimam1396@gmail.com"),
            new Student("2", "Mario", "Rossi", "lory1991@develhope.co"),
            new Student("3", "Giulio", "Verdi", "lory1992@develhope.co"),
            new Student("4", "Giovanna", "Giallo", "giovanna@develhope.co")
    );

    public Student getStudentById(String studentId) {
        Optional<Student> studentFromDB = students.stream().filter(student -> student.getId().equals(studentId)).findAny();
        if(studentFromDB.isPresent()) return studentFromDB.get();
        return null;
    }
}
