package cn.edu.lingnan.servlet;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.edu.lingnan.dao.buyinfoDAO;
import cn.edu.lingnan.dto.buyinfoDTO;


public class BuyerAddBuyinfoServlet extends HttpServlet
{
	@Override protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException
	{
		//1.��ҳ���ȡ������Ҫ�����ݣ�4����
		buyinfoDTO cart = (buyinfoDTO)req.getSession().getAttribute("id4");
		String bid = req.getParameter("bid");
		String aid = req.getParameter("aid");
		String gid = req.getParameter("gid");
		String sumnum = req.getParameter("sumnum");
		//2.���ú�̨��ҵ���߼�ȥ�ж�����û����������Ƿ�����Ҷ�Ӧ
		buyinfoDAO bd = new buyinfoDAO();
		buyinfoDTO bdto = new buyinfoDTO();
		bdto.setBid(bid);
		bdto.setAid(aid);
		bdto.setGid(gid);
		bdto.setSumnum(Integer.getInteger(sumnum));
		boolean flag = bd.userInsertBuyinfo(bid, aid, gid, sumnum);
		//ҳ����ת֮ǰ�������v�����������ֵ����ԭ��δ���޸ĵ�
		Vector<buyinfoDTO> v = new Vector<buyinfoDTO>();
		v = bd.findCartById(cart.getAid());
		HttpSession s=req.getSession();
		s.setAttribute("cart", v);
		//ҳ����ת
		resp.sendRedirect("buyerAddBuyinfo.jsp");
	}
}
