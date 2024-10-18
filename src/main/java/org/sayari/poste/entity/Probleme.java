package org.sayari.poste.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Probleme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProbleme;
    private String categorie;
    private String priorite;
    private Date dateSignale;
    private Date dateResolution;
    private String status;

    @ManyToOne
    private TechnicienRegional technicienRegional ;
    @OneToMany(cascade =CascadeType.ALL,mappedBy = "probleme",fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Notification> notifications;
    @ManyToOne
    private Region region ;
    @ManyToOne
    private GestionnaireDesuccursale gestionnaireDesuccursale ;
    @ManyToOne
    private EmployeDeSuccursale employeDeSuccursale;
    @ManyToOne
    private Planning planning ;





}
