package com.lingnan.usersys.common.exception;
/**
 * Service异常类
 * @author Administrator
 *
 */
public class ServiceException extends DaoException{
	/**
	 * 默认的构造方法
	 */
	public ServiceException(){
		
	}
	/**
	 * 构造方法
	 * @param arg0 异常的详细信息
	 */
	public ServiceException(String arg0){
		//调用父类的super(String)构造方法，重写详细的异常信息
		super(arg0);
	}
	/**
	 * 构造方法
	 * @param arg0 产生异常的原因
	 */
	public ServiceException(Throwable arg0){
		//调用父类的super(Throwable)构造方法，重写异常产生的原因
		super(arg0);
	}
	/**
	 * 构造方法
	 * @param arg0 异常的详细信息
	 * @param arg1 产生异常的原因
	 */
	public ServiceException(String arg0, Throwable arg1){
		//调用父类的super(String,Throwable)构造方法，重写详细的异常信息以及异常产生的原因
		super(arg0,arg1);
	}
}