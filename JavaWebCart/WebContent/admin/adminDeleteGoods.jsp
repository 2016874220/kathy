<!-- ������import -->
<%@ page language="java" contentType="text/html; charset=GB2312"
	pageEncoding="GB2312" import="java.util.*,com.lingnan.umssys.common.constant.goodsDTO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- ǿ��ˢ�� -->
	<meta http-equiv="Cache-control" content="no-cache"/>
<!-- ȥ���������»��� -->
<style>
a {
	text-decoration: none
}
</style>
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

<!-- ʵ�ְ�ť��ȫѡ����ѡ����ѡ������ɾ�� -->
<script>
	function allcheck() {
		var checkObj = document.getElementsByName("check");
		for (var i = 0; i < checkObj.length; i++) {
			checkObj[i].checked = true;
		}
	}
	function allnotcheck() {
		var checkObj = document.getElementsByName("check");
		for (var i = 0; i < checkObj.length; i++) {
			checkObj[i].checked = false;
		}
	}
	function backcheck() {
		var checkObj = document.getElementsByName("check");
		for (var i = 0; i < checkObj.length; i++) {
			if (checkObj[i].checked == true) {
				checkObj[i].checked = false;
			} else {
				checkObj[i].checked = true;
			}
		}
	}
	function batchdelete() {
		var arr = [];
		var flag = false;
		var checkObj = document.getElementsByName("check");
		for (var i = 0; i < checkObj.length; i++) {
			if (checkObj[i].checked == true) {
				arr.push(checkObj[i].value);
				flag = true;
			}
		}
		alert(arr);
		if (flag = true) {
			if (confirm("��ȷ��Ҫɾ������Ʒ��")) {
				location.href = "adminBatchDeleteGoodsServlet?arr=" + arr;
			}
		} else {
			alert("������ѡ��һ����Ʒ���ٽ���ɾ����");
		}
	}
</script>
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
				<li><a href="adminDeleteGoodsServlet" class="active-menu"><i class="fa fa-edit"></i>ɾ����Ʒ</a></li>
				<li><a href="adminUpdateGoodsServlet"><i
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
												<td></td>
												<td>��Ʒ���</td>
												<td>��Ʒ����</td>
												<td>��Ʒ�۸�Ԫ��</td>
												<td>��棨����</td>
												<td></td>
											</tr>
										</thead>
										<%
											Vector<goodsDTO> v = new Vector<goodsDTO>();
													v = (Vector<goodsDTO>) session.getAttribute("alldeletegoods");
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
												<td><input type="checkbox" name="check"
													value=<%=g.getGid()%>></td>
												<td><%=g.getGid()%></td>
												<td><%=g.getGname()%></td>
												<td><%=g.getPrice()%></td>
												<td><%=g.getGnum()%></td>
												<td><a
													href="adminDeleteGoodsServlet?gid=<%=g.getGid()%>">ɾ��</a></td>
											</tr>
											<%
												}
											%>
											</tr>
											</tbody>
											</table>
										
			<td>						
	<input type="button" id="btn1" value="ȫѡ" onClick="allcheck();" />
	<input type="button" id="btn2" value="��ѡ" onClick="allnotcheck();" />
	<input type="button" id="btn3" value="��ѡ" onClick="backcheck();" />
	<input type="button" value="����ɾ��" onClick="batchdelete();" />
	
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
</body>
</html>