/**
 * 
 */
package com.boss.demo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @title  BaseAction.java
 */

@SuppressWarnings("serial")
public class BaseAction extends ActionSupport implements java.io.Serializable {
	protected static final String SUCCESS = "success";//???
	protected static final String ERROR = "error";//???
	
	protected Message msg;//????????
	
	/**
	 * 
	 * @return
	 */
	public Message getMsg() {
		return msg;
	}

	@JSON(serialize=false)
	public HttpServletResponse getResponse() {
		return ServletActionContext.getResponse();
	}
	
	@JSON(serialize=false)
	public HttpServletRequest getRequest() {
		return ServletActionContext.getRequest();
	}
	
	@JSON(serialize=false)
	public HttpSession getSession() {
		return getRequest().getSession();
	}
	
	/**
	 * <p>????????? success</p>
	 * <p>??????????????????
	 *
	 * </p>
	 *<p>?????????</p>
	 * @param text
	 * @return
	 *
	 * @date   ???????2012-3-16
	 * @author ?????bill
	 */
	protected String success(String text) {
		msg = new Message(text, 1);
		return SUCCESS;
	}
	
	/**
	 * <p>?????????success</p>
	 * <p>??????????????????
	 *
	 * </p>
	 *<p>?????????</p>
	 * @return
	 *
	 * @date   ???????2012-3-16
	 * @author ?????bill
	 */
	protected String success() {
		return success("???????");
	}
	
	/**
	 * <p>????????? error</p>
	 * <p>???????????????????
	 *
	 * </p>
	 *<p>?????????</p>
	 * @param text
	 * @return
	 *
	 * @date   ???????2012-3-16
	 * @author ?????bill
	 */
	protected String error(String text) {
		msg = new Message(text, 0);
		return ERROR;
	}
	
	/**
	 * <p>????????? error</p>
	 * <p>???????????????????
	 *
	 * </p>
	 *<p>?????????</p>
	 * @return
	 *
	 * @date   ???????2012-3-16
	 * @author ?????bill
	 */
	protected String error() {
		return error("???????");
	}
	

	/**
	 * ??????public?????
	 * ????????
	 * @author bill
	 */
	public static class Message {
		private String text;
		private int code;
		
		public Message(String text, int code) {
			this.text = text;
			this.code = code;
		}
		
		public Message(String text) {
			this.text = text;
			this.code = 0;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public int getCode() {
			return code;
		}

		public void setCode(int code) {
			this.code = code;
		}
		
	}
}