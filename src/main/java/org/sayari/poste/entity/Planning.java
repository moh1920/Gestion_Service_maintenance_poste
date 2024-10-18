package org.sayari.poste.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Planning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPlanning;
    private Date dateDebut;
    private Date dateFin;


    @OneToMany(cascade =CascadeType.ALL,mappedBy = "planning",fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Tache> taches;

    @OneToMany(cascade =CascadeType.ALL,mappedBy = "planning",fetch = FetchType.EAGER)
    @JsonIgnore
    private List<TechnicienRegional> technicienRegionals;

    @ManyToOne
    private AdministrateurRegional administrateurRegional ;

    @OneToMany(cascade = CascadeType.ALL,mappedBy ="planning",fetch = FetchType.EAGER)
    @JsonIgnore
    private  List<Probleme> problemeList ;



}
