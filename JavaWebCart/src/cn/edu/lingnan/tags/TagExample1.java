package cn.edu.lingnan.tags;
/*
 * Ϊ��ǩ����һ����ǩ��������TagExample1.java
 */
import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class TagExample1 extends TagSupport
{
	//��ǩ��ʼ
	public int doStartTag() throws JspException
	{
		try
		{
			pageContext.getOut().println("--------------20180606-------------");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return Tag.SKIP_BODY;
	}
	
	//��ǩ����
	public int doEndTag() throws JspException
	{
		return Tag.EVAL_PAGE;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
