package chapter02;

public class TV {
	private boolean power;
	private int channel; // 0~50
	private int volume; //0~50
	
	public TV(int channel,int volume,boolean power) {
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}
	
	public void power(boolean power) {
		this.power=power;
	}
	
	public void volume(int volume) {
		if(volume>50)
			volume=50;
		if(volume<0)
			volume=0;
		this.volume=volume;
	}
	public void volume(boolean on) {
		if(!on) {
			volume=0;
		}
	}
	
	public void channel(int channel) {
		
		if(!power) return;
		
		if(channel>50) {
			channel=0;
		}else if(channel<0) {
			channel=50;
		}
		
		this.channel=channel;
		System.out.println("channel : "+this.channel);
	}
	public void channel(boolean up) {	
		
		if(up) {
			channel(++channel);
		}else {
			channel(--channel);
		}
	}
	
	public void status() {
		System.out.println("TV[power="+power+", channel="+channel+", volume="+volume+"]");
	}
}
