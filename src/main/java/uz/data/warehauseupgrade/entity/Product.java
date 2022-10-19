package uz.data.warehauseupgrade.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    Category categoryId;

    @OneToOne
    private Attachment photo;

    @Column(nullable = false,unique = true)
    private String code;

    @ManyToOne
    private Measurement measurement;

    private Boolean status;
}
