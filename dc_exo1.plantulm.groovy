@startuml 
dc

skinparam  classAttributeIconSize  0

masquer le  cercle
masquer les  membres vides 
masquer les  méthodes vides 

Entreprise  "1"  -- "*" Artisan : gerer
Entreprise  "1"  -- "*" Chantier : possède
Chantier  "*"  -- "*" Artisan 
( Artisan , Chantier ) ..  affecter

Classe  Entreprise {
    nom
    adresse
    nbEmployés
}

 Artisan de classe {
    nom
    coordonnées
    spécialité
}

 Chantier de classe {
    adresse
    dateDébut
    dateFin
}

Classe  affectant {
    nombreHeures
    débutMission
    finMission
    getPayeArtisan ()
}

@enduml
