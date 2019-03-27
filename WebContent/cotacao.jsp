<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Cotação</title>

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
				<a href="cotacoes.jsp"
					class="list-group-item list-group-item-action bg-light">Todas
					as Cotações</a> <a href="cadastro.jsp"
					class="list-group-item list-group-item-action bg-light">Alteração
					de Cadastro</a>

			</div>
		</div>
		<!-- /#sidebar-wrapper -->

		<!-- Page Content -->
		<div id="page-content-wrapper">

			<nav
				class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
				<button class="btn btn-primary" id="menu-toggle"></button>

				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav ml-auto mt-2 mt-lg-0">
						<li class="nav-item active"><a class="nav-link" href="#">Home
								<span class="sr-only">(current)</span>
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> Dropdown </a>
							<div class="dropdown-menu dropdown-menu-right"
								aria-labelledby="navbarDropdown">
								<a class="dropdown-item" href="#">Action</a> <a
									class="dropdown-item" href="#">Another action</a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="#">Something else here</a>
							</div></li>
					</ul>
				</div>
			</nav>
			<div>
				<h4>Cotação</h4>
				<table style="width:100%">
				  <tr>
				    <td>
				    	<label for="numero">Número</label>
				    	<input name="numero" id="numero" />
				    </td>
				    <td>
				    	<label for="comprador">Comprador</label>
				    	<input name="comprador" id="comprador" />
				    </td> 
				  </tr>
				  <tr>
				    <td>	
				    	<label for="data-emissao">Data Emissão</label>
				    	<input type="date" name="data-emissao" id="data-emissao" />
				   	</td>
				    <td>
				    	<label for="data-limite">Data Limite</label>
				    	<input type="date" name="data-limite" id="data-limite" />
					</td> 
				  </tr>
				  <tr>
				    <td>
				    	<label for="frete">Frete</label>
				    	<input name="frete" id="frete" />
				    </td>
				    <td>
				    	<label for="condicao-pagamento">Condição de Pagamento</label>
				    	<input name="condicao-pagamento" id="condicao-pagamento" align="right"/>
				    </td>
				  </tr>
				</table>
				<table style="width:100%">
				  <tr>
				  	<td>
				  		<label for="endereco-entrega">Endereço de Entrega</label>
				  		<textarea rows="3" name="endereco-entrega" id="endereco-entrega" ></textarea>
				  	</td>
				  </tr>
				</table>
			</div>
			<div class="container-fluid">
				<h4 class="mt-4">Itens das Cotação</h4>
				<div class="table-responsive text-nowrap">

					<table class="table">
						<thead>
							<tr>
								<th scope="col">Item</th>
								<th scope="col">Quantidade</th>
								<th scope="col">Unidade</th>
								<th scope="col">Número SC</th>
								<th scope="col">Código do Produto</th>
								<th scope="col">Descrição</th>
								<th scope="col">Entrega</th>
								<th scope="col">$ Unitário</th>
								<th scope="col">Aliq. IPI (%)</th>
								<th scope="col">Aliq. ICMS (%)</th>
								<th scope="col">Frete</th>
								<th scope="col">Total</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<th scope="row" class="td-padding">1</th>
								<td><input type="text" style="border: 0;" name="quantidade"
									value="3" READONLY></td>
								<td><input type="text" style="border: 0;" name="unidade"
									value="PC" READONLY></td>
								<td><input type="text" style="border: 0;" name="numeroSc"
									value="32201" READONLY></td>
								<td><input type="text" style="border: 0;" name="codProduto"
									value="14900037" READONLY></td>
								<td> 
									MOUSE MICROSOFT
								</td>
								<td class="td-date"><input type="date" style="border: 0;"
									name="entrega"></td>
								<td><input type="text" style="border: 0;"
									name="valorUnitario"></td>
								<td><input type="text" style="border: 0;" name="ipi"></td>
								<td><input type="text" style="border: 0;" name="icms"></td>
								<td><input type="text" style="border: 0;" name="frete"
									value="100,00" READONLY></td>
								<td><input type="text" style="border: 0;" name="valorotal"
									value="200,00" READONLY></td>
							</tr>
							<tr>
								<th scope="row" class="td-padding">2</th>
								<td><input type="text" style="border: 0;" name="quantidade"
									value="3" READONLY></td>
								<td><input type="text" style="border: 0;" name="unidade"
									value="PC" READONLY></td>
								<td><input type="text" style="border: 0;" name="numeroSc"
									value="32201" READONLY></td>
								<td><input type="text" style="border: 0;" name="codProduto"
									value="14900037" READONLY></td>
								<td><input type="text" style="border: 0;" name="descricao"
									value="MOUSE MOCROSOFT" READONLY></td>
								<td class="td-date"><input type="date" style="border: 0;"
									name="entrega"></td>
								<td><input type="text" style="border: 0;"
									name="valorUnitario"></td>
								<td><input type="text" style="border: 0;" name="ipi"></td>
								<td><input type="text" style="border: 0;" name="icms"></td>
								<td><input type="text" style="border: 0;" name="frete"
									value="100,00" READONLY></td>
								<td><input type="text" style="border: 0;" name="valorotal"
									value="200,00" READONLY></td>
							</tr>
							<tr>
								<th scope="row" class="td-padding">3</th>
								<td><input type="text" style="border: 0;" name="quantidade"
									value="3" READONLY></td>
								<td><input type="text" style="border: 0;" name="unidade"
									value="PC" READONLY></td>
								<td><input type="text" style="border: 0;" name="numeroSc"
									value="32201" READONLY></td>
								<td><input type="text" style="border: 0;" name="codProduto"
									value="14900037" READONLY></td>
								<td><input type="text" style="border: 0;" name="descricao"
									value="MOUSE MOCROSOFT" READONLY></td>
								<td class="td-date"><input type="date" style="border: 0;"
									name="entrega"></td>
								<td><input type="text" style="border: 0;"
									name="valorUnitario"></td>
								<td><input type="text" style="border: 0;" name="ipi"></td>
								<td><input type="text" style="border: 0;" name="icms"></td>
								<td><input type="text" style="border: 0;" name="frete"
									value="100,00" READONLY></td>
								<td><input type="text" style="border: 0;" name="valorotal"
									value="200,00" READONLY></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<!-- /#page-content-wrapper -->

	</div>
	<!-- /#wrapper -->
	<footer></footer>
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
