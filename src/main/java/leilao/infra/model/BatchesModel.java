package leilao.infra.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "batches")
public class BatchesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Date delieverDate;

    @Column
    private Long observation;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="donator_id")
    // Call DonetorModel.id
    public DonatorModel donator.getId();
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="product_id")
    // Call DonetorModel.id
    public ProductModel product.getId();
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="overseer_id")
    // Call DonetorModel.id
    public OverseerModel overseer.getId()
    


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDelieverDate() {
        return delieverDate;
    }

    public void setDelieverDate(Date delieverDate) {
        this.delieverDate = delieverDate;
    }

    public Long getObservation() {
        return observation;
    }

    public void setObservation(Long observation) {
        this.observation = observation;
    }

}
