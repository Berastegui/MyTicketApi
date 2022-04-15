# MyTicketApi

## Présentation
ce mini-projet est un résumé simplifié du code de notre API
Il permet de récupérer les tickets avec toutes leurs propriétés. Ces propriétés proviennent de deux sources différentes.

## Les sources (repository)
Ce sont des API dans la réalite. Ici, elles sont remplacées par des classes de tests avec des instances de ticket écrites en dure dans le code

### les métadatas
interface du repo : MetadataTicketRepository
Il s'agit de récupérer certaines données des tickets : label, conditions, description

### le ticketing
interface du repo : TicketingTicketRepository
Cela concerne le prix du ticket.

## Les classes tickets

### le ticket de la métadata
classe : TicketFromMetadata
peut être récupéré selon son id.
contient les propriétés suivantes : 
- label
- conditions
- description

### le ticket de la billetterie
classe : TicketFromTicketing
peut être récupéré selon son id.
contient les propriétés suivantes : 
- prix

### le ticket qu'on veut récupérer
classe : Ticket
doit contenir les propriété suivantes : 
- id 
- label
- conditions
- description
- prix

## L'aggregator
classe : TicketAggregator
Il appelle les interface de repository.
Il contient plusieurs fonctions non implémentées. 
L'objectif est de les implémenter pour récupérer un ticket selon son id, la liste des tickets, la liste des tickets sous conditions.

## Le test de l'aggregator
classe : TicketAggregatorTest
permet de testes les fonctions de l'aggregator.
Un premier test est implémenté : listTickets, il faut le passer en vert.
Il faudra ensuite écrire les tests suivants avec d'écrire les fonctions de l'aggregator
