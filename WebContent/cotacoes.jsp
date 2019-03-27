<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Cotações</title>

  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css/simple-sidebar.css" rel="stylesheet">

</head>

<body>

  <div class="d-flex" id="wrapper">
    <!-- Sidebar -->
    <div class="bg-light border-right" id="sidebar-wrapper">
      <div class="sidebar-heading">Portal do Fornecedor</div>
            
      <div class="list-group list-group-flush">
        <a href="#" class="list-group-item list-group-item-action bg-light">Alteração de Cadastro</a>

      </div>
    </div>
    <!-- /#sidebar-wrapper -->

    <!-- Page Content -->
    <div id="page-content-wrapper">

      <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
        <button class="btn btn-primary" id="menu-toggle"></button>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav ml-auto mt-2 mt-lg-0">
            <li class="nav-item active">
              <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Link</a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Dropdown
              </a>
              <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="#">Action</a>
                <a class="dropdown-item" href="#">Another action</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">Something else here</a>
              </div>
            </li>
          </ul>
        </div>
      </nav>

      <div class="container-fluid">
        <h2 class="mt-4">Cotações</h2>
		<div class="table-responsive text-nowrap">
		
		  <table class="table">
		    <thead>
		      <tr>
		      	<th scope="col"></th>
		        <th scope="col">Staus</th>
		        <th scope="col">Número</th>
		        <th scope="col">Empresa</th>
		        <th scope="col">Fornecedor</th>
		        <th scope="col">Comprador</th>
		        <th scope="col">Data Emissão</th>
		        <th scope="col">Data Limite</th>

		      </tr>
		    </thead>
		    <tbody>
		      <tr>
		        <th scope="row" class="td-padding"><a href="cotacao.jsp">Cotar</a></th>
		        <td><input type="text" style="border:0;" name="status" value="Aberto" READONLY></td>
		      	<td><input type="text" style="border:0;" name="numero" value="000134" READONLY></td>
		      	<td><input type="text" style="border:0;" name="empresa" value="IBAR" READONLY></td>
		      	<td><input type="text" style="border:0;" name="fornecedor" value="FAWAY" READONLY></td>
		      	<td><input type="text" style="border:0;" name="comprador" value="TAINA SOARES" READONLY></td>
		      	<td class="td-date"><input type="date" style="border:0;" name="dtEmissao" READONLY></td>
		      	<td class="td-date"><input type="date" style="border:0;" name="dtLimite" READONLY></td>
		      </tr>
		      <tr>
		        <th scope="row" class="td-padding"><a href="cotacao.jsp">Cotar</a></th>
		        <td><input type="text" style="border:0;" name="status" value="Aberto" READONLY></td>
		      	<td><input type="text" style="border:0;" name="numero" value="000135" READONLY></td>
		      	<td><input type="text" style="border:0;" name="empresa" value="NUTEC" READONLY></td>
		      	<td><input type="text" style="border:0;" name="fornecedor" value="FAWAY" READONLY></td>
		      	<td><input type="text" style="border:0;" name="comprador" value="TAINA SOARES" READONLY></td>
		      	<td class="td-date"><input type="date" style="border:0;" name="dtEmissao"  READONLY></td>
		      	<td class="td-date"><input type="date" style="border:0;" name="dtLimite" READONLY></td>
		      </tr>
		      <tr>
		        <th scope="row" class="td-padding"><a href="cotacao.jsp">Cotar</a></th>
		        <td><input type="text" style="border:0;" name="status" value="Aberto" READONLY></td>
		      	<td><input type="text" style="border:0;" name="numero" value="000136" READONLY></td>
		      	<td><input type="text" style="border:0;" name="empresa" value="GLOBAL SERVICE" READONLY></td>
		      	<td><input type="text" style="border:0;" name="fornecedor" value="FAWAY" READONLY></td>
		      	<td><input type="text" style="border:0;" name="comprador" value="TAINA SOARES" READONLY></td>
		      	<td class="td-date"><input type="date" style="border:0;" name="dtEmissao"  READONLY></td>
		      	<td class="td-date"><input type="date" style="border:0;" name="dtLimite" READONLY></td>
		      </tr>
		    </tbody>
		  </table>
		
		</div>
      </div>
    </div>
    <!-- /#page-content-wrapper -->
  </div>
  <!-- /#wrapper -->
  
  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Menu Toggle Script -->
  <script>
    $("#menu-toggle").click(function(e) {
      e.preventDefault();
      $("#wrapper").toggleClass("toggled");
    });
  </script>

</body>

</html>
