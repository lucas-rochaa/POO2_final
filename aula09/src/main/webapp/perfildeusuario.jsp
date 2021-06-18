<!DOCTYPE html> 
<head>
    <title> Perfil Usuario </title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="css" href="perfil.css">
    <link rel="shortcut icon" type="x-icon" href="Lucas_BroxaOficial.png">
</head>

<body>
	<%
	String usuario = request.getParameter("usuario");
	String modalidades = request.getParameter("modalidades");
	String data = request.getParameter("data");
	String horario = request.getParameter("horario");
	String personal = request.getParameter("personal");
    %>



    <h1>Agendamento</h1>
    <fieldset>
    <legend>Agendamento Realizado</legend>
	<p>Agendamento Realizado para:</p>
	
	<p>
	Usuario: <%=usuario %><br>
	Modalidades: <%=modalidades %><br>
	Data: <%=data %><br>
	Horario: <%=horario %><br>
	Personal <%=personal %>
	</p>
	<a href="index.html">Voltar ao menu</a>
    </fieldset>
</body>
</html>