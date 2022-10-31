package id.sinaukoding.latihan.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "staffs")
@Getter
@Setter
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer staffId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String phone;

    @Column
    private String email;

    @Column
    private String active;


}