package Stack;

public class StackUnderFlowException extends RuntimeException {
    public StackUnderFlowException(String msg)
    {
    	super(msg);
    }
}
