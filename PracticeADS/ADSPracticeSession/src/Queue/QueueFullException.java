package Queue;

public class QueueFullException extends RuntimeException{

	public QueueFullException(String msg)
	{
		super(msg);
	}
}
