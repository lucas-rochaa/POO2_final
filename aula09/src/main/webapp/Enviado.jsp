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
	String func = request.getParameter("func");
    %>



    <h1>Mensagem</h1>
    <fieldset>
    <legend>Mensagem enviada com sucesso</legend>
	<p>Mensagem enviada de:</p>
	
	<p>
	Mensagem enviada pelo usuario: <%=usuario %><br>
	Para o funcionadio: <%=func %><br>
	</p>
	<p>Nosso funcionario lhe enviara um email como resposta assim que ler a mensagem</p>
	<a href="index.html">Voltar ao menu</a>
    </fieldset>
</body>
</html>