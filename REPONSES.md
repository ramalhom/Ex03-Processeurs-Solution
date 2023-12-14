## Réponses aux questions

### PARTIE 2 : Découverte des littéraux

#### Question
Pourquoi y a-t-il un **L** majuscule à la fin des deux dernières valeurs utilisées pour exprimer le nombre de transistors ?

```
    cpus[ 14 ] = new CPU( "Intel Core i7 (Haswell-E)", 2014, 2600000000L, 238310 );
    cpus[ 15 ] = new CPU( "Oracle SPARC M7", 2015, 10000000000L );
```

#### Réponse - avec explications
Règle N°1 : lorsqu'on écrit un nombre en java, par exemple `124`, Java assumera qu'il s'agit d'un nombre entier, donc de type `int`.

Règle N°2 : si ce nombre comporte un point (une virgule pour nous humains), par exemple `124.17`, alors Java assume qu'il s'agit d'un nombre réel, donc de type `double`.

Problème, selon règle N°1 si on se permettait d'écrire `2600000000` cela générerait une erreur de compilation ! En effet, selon règle N°1, Java le considèrerait comme un `int`. Or comme vous le savez un `int` a une taille de 32 bits dont 1 pour le signe, et donc des valeurs possibles allant de -2'147'483'648 à +2'147'483'647. Et donc cette valeur 2'600'000'000 serait trop grande pour un `int` !!!

Solution (et réponse à la question)

Indiquer à Java que notre constante `2600000000` est un nombre entier long de 64 bits, donc de type `long`, en utilisant ce littéral `L` pour indiquer ce souhait directement dans la constante.

#### Réponse courte
Pour indiquer à Java que la valeur saisie `2600000000` doit être considérée comme de type `long` et non de type `int`.
