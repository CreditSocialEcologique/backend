# Backend

Pour éxécuter le projet, il est possible de l'éxécuter avec docker, un ide java ou maven.

## Docker

Pour lancer l'application sous docker, il faut installer docker et lancer cette commande :

```bash
docker compose up -d
```

## IDE

Dans votre IDE, il faut ouvrir le projet. Une fois ouvert, vous pouvez éxécuter la classe BackEndApplication.java

## Maven

Si maven est dans vos variables d'environnement, vous pouvez éxécuter cette commande :
```bash
maven package
```
Cela va crée un fichier jar dans le dossier target.
Dans le dossier target, vous pouvez éxécuter le fichier jar avec cette commande :

```
java -jar cse-1.jar
```
