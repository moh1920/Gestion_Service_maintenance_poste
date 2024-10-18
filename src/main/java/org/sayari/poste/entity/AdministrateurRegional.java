package org.sayari.poste.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@DiscriminatorValue("ADMIN")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AdministrateurRegional extends Utilisateur{

    @OneToMany(cascade =CascadeType.ALL,mappedBy = "administrateurRegional",fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Planning> plannings ;

    @OneToMany(cascade =CascadeType.ALL,mappedBy = "administrateurRegional",fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Rapport>  rapports;



}
