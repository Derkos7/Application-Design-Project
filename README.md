# Application-Design-Project
En entrant dans l'application, l'utilisateur peut se créer un compte et se connecter. Quand il arrive sur la page principale, il a accès à une bibliothèque de jeu. Il peut obtenir plus d'informations sur chaque jeu.

# Rapport Yannick
Page d’authentification / Login

Pour le Front End :
J’ai créer l’interface de la page d'authentification avec la syntaxe usuelle (XML) : en utilisant des RelativeLayout et LinearLayout, des ImageView pour le logo, TextView pour “Entrer…” et “Login”, des “round_corners” etc.


Pour le Back End : 
J’ai travaillé en Kotlin au lieu de JetPack Compose parce que le fichier “Main_Activity”  était un “.kt” donc j’ai gravité vers Kotlin.
Je me suis aidée des deux vidéos “Tuto Login” sur Youtube, et j’ai adapté mon code en fonction, corrigé les erreurs qu’il y avait car il fallait importer plusieurs “bibliothèques” si je peux appeler ça comme ça. Ensuite je me suis rendue compte qu’on pouvait faire plus simple sans importer tout ce qui R, ou Toast etc…
La confusion est venue du fait qu’il y avait encore une partie Compose dans mon .kt qui a été créé automatiquement.
J’ai eu à Clean et Rebuild le projet plusieurs fois pour m’assurer que les modifications soient bien prises en compte.

Pour le Test / Débug : 
Créer un projet FireBaseAuth afin de pouvoir faire fonctionner ma connexion sur Android Studio
J’ai suivi les étapes tels que Télecharger le fichier Google JSON
Mettre ce fichier dans le gradle (modèle app) qu’il faut trouver (il y’en a plusieurs)
Ensuite il faut Sync le projet avec les Gradle Files
Vérifier que j’ai appélé le FireBaseAuth dans mes méthodes (en respectant les majuscules où il faut sinon erreur !)
Mettre le projet dans Android Studio 
Lancer l’émulateur dans le Device Manager
Changer le fichier thèmes.xml (créer automatiquement) car j’ai eu des messages d’erreur après avoir essayé de Run : changer le parent de votre thème pour qu'il soit basé sur Theme.AppCompat et vérifier qu’il est utilisé dans le AndroidManifest.xml
Ajouter des dependencies à mes fichiers gradle(projet) sinon erreur et Sync après.
Enfin, le but est de pouvoir se connecter et il faudrait donc créer un/des identifiants et mots de passe diretcement sur FireBase afin de pouvoir vérifier la connexion, le cas échéant l’application devrait nous renvoyer un message d’erreur étant donnée que les ID ne sont pas valides, montrant ainsi que l’application est fonctionnel à ce niveau là.

# Rapport Lamiae
Pour ma part, je me suis chargée du design, de la charte graphique et des fonctionnalités. J'ai aussi réalisé la page 'Home' qui affiche toutes les dernières sorties de jeux et les nouveautés. Nous avons en haut une barre de recherche, puis une image des derniers jeux sortis. Lorsque l'on clique sur une de ces images nous arrivons à la description. De plus nous avons en bas de la page (qui est une page défilante), trois boutons permanants et que l'on retrouve sur toutes les pages. Ce sont le Home, Library et Profile. En cliquant sur Home, nous sommes conduit vers la page principale, en cliquant sur Library, nous nous retrouvons sur une autre pages qui affiche tous les jeux joué ou en cours de jeu par l'utilisateur, et finalement, le button Profile, sert à se diriger vers la page de profil de l'utilisateur. 

# Rapport Paul
Lorsque l'utilisateur clique sur un jeu de la page principale, il arrive sur la description du jeu. Le code met directement la bonne image avec la bonne description et d'autres informations comme le temps de jeu estimé, les plateformes disponibles et un résumé des fonctionnalités et des fonctionnalités. Un bouton permet d'ajouter le jeu à la bibliothèque, tandis qu'une barre de navigation en bas facilite la transition vers d'autres parties de l'application (la bibliothèque de jeux, le profil de l'utilisateur ou la page d'accueil). Les mêmes fonctionalités peuvent être retrouvés sur la page Library. Dans cette page, nous retrouvons les jeux sauvegardés par l'utilisateurs. En cliquant sur l'image d'un des jeux, on arrive vers la description du jeu.
