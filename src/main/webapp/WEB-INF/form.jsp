<jsp:useBean id="cats" type="java.util.ArrayList<org.example.exercice4jee.model.Cat>" scope="request" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Cat</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1>Cat</h1>
    <h2 class="mt-5"> Add a Cat</h2>
    <form method="post" action="form">
        <div class="row mb-3">
            <label for="name" class="col-sm-2 col-form-label">Name:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="name" name="name">
            </div>
        </div>
        <div class="row mb-3">
            <label for="breed" class="col-sm-2 col-form-label">Breed:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="breed" name="breed">
            </div>
        </div>
        <div class="row mb-3">
            <label for="favoriteFood" class="col-sm-2 col-form-label">Favorite food:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="favoriteFood" name="favoriteFood">
            </div>
        </div>
        <div class="row mb-3">
            <label for="birthDate" class="col-sm-2 col-form-label">Birthdate:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="birthDate" name="birthDate">
            </div>
        </div>
        <button class="btn btn-primary">Add</button>
    </form>

    <h2 class="mt-5">Cat List</h2>
    <% if (!cats.isEmpty()) { %>
    <table class="table table-dark mt-4">
        <thead>
        <tr>
            <th>Name</th>
            <th>Breed</th>
            <th>Favorite Food</th>
            <th>Birthdate</th>
        </tr>
        </thead>
        <tbody>
        <%
           for (int i = 0; i < cats.size(); i++) {
        %>
        <tr>
            <td><%= cats.get(i).getName() %></td>
            <td><%= cats.get(i).getBreed() %></td>
            <td><%= cats.get(i).getFavoriteFood() %></td>
            <td><%= cats.get(i).getBirthdate() %></td>
        </tr>
        <% } %>
        </tbody>
        <% } else { %>
        <p>No cats found.</p>
        <% } %>
    </table>
</div>
</body>
</html>
