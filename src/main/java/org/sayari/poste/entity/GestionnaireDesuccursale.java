package org.sayari.poste.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@DiscriminatorValue("GES")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GestionnaireDesuccursale extends  Utilisateur {

    @OneToMany(cascade =CascadeType.ALL,mappedBy = "gestionnaireDesuccursale",fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Probleme> probleme;


}
