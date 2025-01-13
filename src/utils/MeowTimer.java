package utils;

public class MeowTimer {
	private Long startTime;
	private Long endTime;

	public void start() {
		this.startTime = System.currentTimeMillis();
	}

	public void end() {
		this.endTime = System.currentTimeMillis();
	}

	public Long getTime() {
		return endTime - startTime;
	}

	public void printTimeAndClear() {
		System.out.println("걸린시간 MilliSecond : " + getTime() + "밀리초");
		System.out.println("걸린시간 : " + getTime() / 1000 + "초");
		init();
	}

	public void init() {
		this.startTime = 0L;
		this.endTime = 0L;
	}
}
