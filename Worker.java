package Worker;

public class Worker {
	
	private OnTaskDoneListener callback;
	private OnTaskErrorListener errorCallback;
	
	public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
		this.errorCallback = errorCallback;
		this.callback = callback;
	}
	
	public void start() {
		for (int i = 0; i < 100; i++) {
			if (i <= 66) {
				callback.onDone("Task " + i + " is done");
			} else {
				errorCallback.onError("Task " + i + " is error");
			}
			
		}
	}
	
}
