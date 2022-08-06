package leilao.infra.model;

import java.io.Serializable;
import java.time.LocalTime;

import javax.persistence.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "batches")
public class BatchesModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long batch_id;

    @Column
    private LocalTime delieverDate;

    @Column
    private String observation;

}
