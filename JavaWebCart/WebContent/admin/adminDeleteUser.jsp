<!-- ������import -->
<%@ page language="java" contentType="text/html; charset=GB2312"
	pageEncoding="GB2312" import="java.util.*,com.lingnan.umssys.common.constant.userBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312">
<title>adminDeleteUserServlet</title>
<!-- ʵ�ְ�ť��ȫѡ����ѡ����ѡ������ɾ�� -->
<script>
	function allcheck()
	{
		var checkObj = document.getElementsByName("check");
		for(var i=0; i<checkObj.length; i++)
			{
				checkObj[i].checked = true;
			}
	}
	function allnotcheck()
	{
		var checkObj = document.getElementsByName("check");
		for(var i=0; i<checkObj.length; i++)
			{
				checkObj[i].checked = false;
			}
	}
	function backcheck()
	{
		var checkObj = document.getElementsByName("check");
		for(var i=0; i<checkObj.length; i++)
			{
				if(checkObj[i].checked == true)
					{
					checkObj[i].checked = false;
					}
				else
					{
						checkObj[i].checked = true;
					}
			}
	}
	function batchdelete()
	{
		var arr = [];
		var flag = false;
		var checkObj = document.getElementsByName("check");
		for(var i=0; i<checkObj.length; i++)
			{
				if(checkObj[i].checked == true)
				{
					arr.push(checkObj[i].value);
					flag = true;
				}
			}
		alert(arr);
		if(flag = true)
			{
				if(confirm("��ȷ��Ҫɾ�����û���"))
					{
						location.href="adminBatchDeleteUserServlet?arr="+arr;
					}
			}
		else
			{
			alert("������ѡ��һ���û����ٽ���ɾ����");
			}
	}
</script>
</head>
<body>
	<table border=1>
		<!-- �޸��ַ����루����.jsp�����Ĭ���ַ����룩-->
		<tr>
			<td></td>
			<td>�û��˺�</td>
			<td>�û���</td>
			<td>����</td>
			<td>��ݣ�1����Ա��2�̼ң�3��ң�</td>
			<td>����Ƿ�����ոù�����Ϣ��1δɾ����0��ɾ����</td>
		</tr>
		<%
			Vector<userBean> v = new Vector<userBean>();
			v = (Vector<userBean>) session.getAttribute("alluser");
			//Iterator�����������ڱ���������Ķ���
			Iterator it = v.iterator();
			userBean a = null;
			while (it.hasNext())
			{
				a = (userBean) it.next();
		%>
		<tr>
			<td><input type="checkbox" name="check" value=<%=a.getAid()%>></td>
			<td><%=a.getAid()%></td>
			<td><%=a.getAname()%></td>
			<td><%=a.getPassword()%></td>
			<td><%=a.getSuperuser()%></td>
			<td><%=a.getState()%></td>
			<td><a href="adminDeleteUserServlet?aid=<%=a.getAid()%>">ɾ��</a>
			</td>
		</tr>
		<%
			}
		%>
	</table>
	<input type="button" id="btn1" value="ȫѡ" onClick="allcheck();" />
	<input type="button" id="btn2" value="��ѡ" onClick="allnotcheck();" />
	<input type="button" id="btn3" value="��ѡ" onClick="backcheck();" />
	<input type="button" value="����ɾ��" onClick="batchdelete();" />
</body>
</html>