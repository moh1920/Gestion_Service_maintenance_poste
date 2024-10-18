package org.sayari.poste.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Rapport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRapport ;
    private Date dateDeneration  ;
    private Integer idregion ;

    @ManyToOne
    private AdministrateurRegional administrateurRegional;

}
