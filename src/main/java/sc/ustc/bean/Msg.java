package sc.ustc.bean;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.concurrent.SuccessCallback;

public class Msg {
	
	private String msg;//���ش�������ʾ��Ϣ����������Ϊnull��
	
	private int code;//����״̬�룬100��ʾ����ɹ���200��ʾ����ʧ�ܣ�ÿ�η��ؽ�����У�ͨ�����ж������Ƿ���ɹ���
	
	/**
	 * Map������󣨺�˷������ݣ�ǰ��ȡ���ݸ�ʽ��result.extend.��������һ��������Ǻ�˶���ģ�������������ң�
	 */
	private Map<String,Object> extend=new HashMap<String, Object>();
	
	public static Msg success() {
		Msg result=new Msg();
		result.setCode(100);
		result.setMsg("����ɹ�");
		return result;
		
	}
	public static Msg fail() {
		Msg result=new Msg();
		result.setCode(200);
		result.setMsg("����ʧ��");
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
