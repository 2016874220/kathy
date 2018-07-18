<!-- ������import -->
<%@ page language="java" contentType="text/html; charset=GB2312"
	pageEncoding="GB2312" import="java.util.*,com.lingnan.umssys.common.constant.goodsDTO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- ȥ���������»��� -->
<style>a{text-decoration:none}</style>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>��Ʒ����ϵͳ</title>
<!-- Bootstrap Styles-->
<link href="../assets/css/bootstrap.css" rel="stylesheet" />
<!-- FontAwesome Styles-->
<link href="../assets/css/font-awesome.css" rel="stylesheet" />
<!-- Morris Chart Styles-->
<link href="../assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
<!-- Custom Styles-->
<link href="../assets/css/custom-styles.css" rel="stylesheet" />
<!-- Google Fonts-->
<link href='https://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<link rel="stylesheet"
	href="../assets/js/Lightweight-Chart/cssCharts.css">
</head>
<body>
	<div id="wrapper">
		<nav class="navbar navbar-default top-navbar" role="navigation">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".sidebar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="seller.html"><strong>��Ʒ����ϵͳ</strong></a>
		</div>

		<!--���Ͻ�������-->
		<ul class="nav navbar-top-links navbar-right">
			<!-- /.dropdown -->
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#" aria-expanded="false"> <i
					class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
			</a>
				<ul class="dropdown-menu dropdown-user">
					<li><a href="../updateSelfMessageServlet"><i class="fa fa-sign-out fa-fw"></i>�޸ĸ�����Ϣ</a>
					<li><a href="../logoutServlet"><i
							class="fa fa-sign-out fa-fw"></i>�˳�</a></li>
				</ul> <!-- /.dropdown-user --></li>
			<!-- /.dropdown -->
		</ul>
		</nav>

		<!-- ��ർ���� -->
		<nav class="navbar-default navbar-side" role="navigation">
		<div class="sidebar-collapse">
			<ul class="nav" id="main-menu">
				<li><a href="goodsinfoForSellerServlet"><i
						class="fa fa-table"></i>��Ʒ��Ϣ</a></li>
				<li><a href="adminAddGoodsServlet"><i class="fa fa-edit"></i>�����Ʒ</a></li>
				<li><a href="adminDeleteGoodsServlet"><i class="fa fa-edit"></i>ɾ����Ʒ</a></li>
				<li><a class="active-menu" href="adminUpdateGoodsServlet"><i
						class="fa fa-edit"></i>�޸���Ʒ��Ϣ</a></li>
				<li><a href="adminFindAllBuyinfoServlet"><i class="fa fa-desktop"></i>�鿴�˿͹������</a></li>
			</ul>
		</div>
		</nav>

		<!-- �м�չʾ����  -->
		<!-- /. NAV SIDE  -->
		<div id="page-wrapper">
			<div class="header">
				<h1 class="page-header">
					�޸���Ʒ��Ϣҳ <small>�޸�</small>
				</h1>
				<ol class="breadcrumb">
					<li><a href="seller.html">ϵͳ</a></li>
					<li><a href="adminUpdateGoodsServlet">�޸���Ʒ��Ϣ</a></li>
					<li class="active">չʾ</li>
				</ol>

			</div>

			<div id="page-inner">

				<div class="row">
					<div class="col-md-12">
						<!-- Advanced Tables -->
						<div class="panel panel-default">
							<div class="panel-heading">��Ʒ��Ϣ�б�</div>
							<div class="panel-body">
								<div class="table-responsive">
									<table class="table table-striped table-bordered table-hover"
										id="dataTables-example">
										<thead>
											<tr>
												<th>��Ʒ���</th>
												<th>��Ʒ����</th>
												<th>��Ʒ�۸�Ԫ��</th>
												<th>��棨����</th>
												<th></th>
											</tr>
										</thead>
												<%
													Vector<goodsDTO> v = new Vector<goodsDTO>();
													v = (Vector<goodsDTO>) session.getAttribute("allupdategoods");
													//Iterator�����������ڱ���������Ķ���
													Iterator it = v.iterator();
													goodsDTO g = null;
													while (it.hasNext())
													{
														g = (goodsDTO) it.next();
												%>
												<tbody>
												<tr class="odd gradeX">
											<tr>
												<td><%=g.getGid()%></td>
												<td><%=g.getGname()%></td>
												<td><%=g.getPrice()%></td>
												<td><%=g.getGnum()%></td>
												<td><a href="adminUpdateGoodsStepTwo.jsp?gid=<%=g.getGid()%>">�޸�</a></td>
											</tr>
											<%
												}
											%>
											</tr>
										</tbody>
									</table>
								</div>
							</div>
						</div>
						<!--End Advanced Tables -->
					</div>
				</div>
			</div>
		</div>
		<!-- /. PAGE INNER  -->
	</div>
	<!-- /. PAGE WRAPPER  -->
	<!-- /. WRAPPER  -->
	<!-- JS Scripts-->
	<!-- jQuery Js -->
	<script src="../assets/js/jquery-1.10.2.js"></script>
	<!-- Bootstrap Js -->
	<script src="../assets/js/bootstrap.min.js"></script>

	<!-- Metis Menu Js -->
	<script src="../assets/js/jquery.metisMenu.js"></script>
	<!-- Morris Chart Js -->
	<script src="../assets/js/morris/raphael-2.1.0.min.js"></script>
	<script src="../assets/js/morris/morris.js"></script>


	<script src="../assets/js/easypiechart.js"></script>
	<script src="../assets/js/easypiechart-data.js"></script>

	<script src="../assets/js/Lightweight-Chart/jquery.chart.js"></script>

	<!-- Custom Js -->
	<script src="../assets/js/custom-scripts.js"></script>

	<script>
		
	</script>
</body>
</html>