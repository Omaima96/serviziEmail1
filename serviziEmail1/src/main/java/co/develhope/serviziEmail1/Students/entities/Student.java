package co.develhope.serviziEmail1.Students.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    public class Student {

        private String id;
        private String name;
        private String surname;
        private String email;
    }


