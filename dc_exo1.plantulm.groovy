@startuml dc

skinparam classAttributeIconSize 0

hide circle
hide empty members
hide empty methods

Entreprise "1" -- "*" Artisan : gerer
Entreprise "1" -- "*" Chantier : posséder
Chantier "*" -- "*" Artisan 
(Artisan, Chantier) .. affecter

Class Entreprise {
    nom
    adresse
    nbEmployés
}

Class Artisan {
    nom
    coordonnées
    spécialité
}

Class Chantier {
    adresse
    dateDébut
    dateFin
}

Class affecter {
    nombreHeures
    débutMission
    finMission
    getPayeArtisan()
}

@enduml
