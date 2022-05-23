package cn.fxmpay.software.utils;

/**
 * @author OneBird
 * @date 2022/5/20 8:48
 **/
public class JsonData {
    /**
     * code:  1；执行中   0：成功   -1：失败
     * data:  数据
     * msg:   返回的信息
     */
    private Integer code;
    private Object data;
    private String msg;

    public JsonData(Integer code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    /**
     * 成功不返回数据
     */
    public static JsonData buildSuccess(){
        return new JsonData(0,null,null);
    }

    /**
     * 成功且返回数据
     */
    public static JsonData buildSuccess(Object data){
        return new JsonData(0,data,null);
    }

    /**
     * 失败，返回错误信息
     */
    public static JsonData buildError(String msg){
        return new JsonData(-1,null,msg);
    }

    /**
     * 失败，返回自定义状态码和错误信息
     */
    public static JsonData buildError(Integer code, String msg){
        return new JsonData(code,null,msg);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
