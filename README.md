# Application pour la Gestion de Bibliothèque

# TO-DO

* add /mysql to .gitignore

```
echo "/mysql" >> .gitignore
```

* create livre and emprunt(two primary keys(cin and date)) tables in database

* implement & test LivreDao methods

* implement & test EmpruntDao methods

# Docker

```
sudo docker run --name my-own-mysql -v ~/Desktop/prjJava/mysql:/var/lib/mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -d mysql:8.0.1
```

```
sudo docker run --name my-own-phpmyadmin -d --link my-own-mysql:db -p 8081:80 phpmyadmin/phpmyadmin
```

```
sudo docker stop my-own-mysql
sudo docker rm my-own-mysql
```


