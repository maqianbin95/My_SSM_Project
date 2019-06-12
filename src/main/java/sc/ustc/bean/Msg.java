package sc.ustc.bean;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.concurrent.SuccessCallback;

public class Msg {
	
	private String msg;//返回处理结果提示信息（不设置则为null）
	
	private int code;//返回状态码，100表示处理成功，200表示处理失败（每次返回结果都有，通过它判断请求是否处理成功）
	
	/**
	 * Map保存对象（后端返回数据，前端取数据格式：result.extend.对象名，一般对象名是后端定义的，所以这个你问我）
	 */
	private Map<String,Object> extend=new HashMap<String, Object>();
	
	public static Msg success() {
		Msg result=new Msg();
		result.setCode(100);
		result.setMsg("处理成功");
		return result;
		
	}
	public static Msg fail() {
		Msg result=new Msg();
		result.setCode(200);
		result.setMsg("处理失败");
		return result;
		
	}
	public Msg add(String key,Object value) {
		this.getExtend().put(key, value);
		return this;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Map getExtend() {
		return extend;
	}
	public void setExtend(Map extend) {
		this.extend = extend;
	}
	
}
