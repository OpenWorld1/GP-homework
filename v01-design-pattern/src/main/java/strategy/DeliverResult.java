package strategy;

public class DeliverResult
{
    private int code;
    private String msg;
    private String result;

    public DeliverResult(int code, String msg, String result) {
        this.code = code;
        this.msg = msg;
        this.result = result;
    }

    @Override
    public String toString() {
        return "交付状态：[" + code + "]" + "，交易详情：" + msg + ", 交易结果：" + result;
    }
}
