<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Creation utilisateur</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>

<body>
    <header>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="ListUtilisateurs">Liste des utilisateurs</a>
            <a class="navbar-brand" href="CreateUtilisateur">Creation utilisateur</a>

        </nav>
    </header>
    <main class="container mt-4">
        <form action="CreateUtilisateur" method="post">
            <div class="form-group">
                <label for="nomUtilisateur">Nom:</label>
                <input type="text" class="form-control" id="nomUtilisateur" name="nom">
            </div>
            <div class="form-group">
                <label for="prenomUtilisateur">Prenom:</label>
                <input type="text" class="form-control" id="prenomlUtilisateur" name="prenom">
            </div>
            <div class="form-group">
                <label for="ageUtilisateur">Age:</label>
                <input type="number" class="form-control" id="ageUtilisateur" name="age">
            </div>
            <div class="form-group">
                <label for="emailUtilisateur">Email:</label>
                <input type="email" class="form-control" id="emailUtilisateur" name="email">
            </div>
            <button type="submit" class="btn btn-primary">Save</button>
        </form>
    </main>

    <!-- Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>

</html>
