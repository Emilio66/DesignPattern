package facade;

public class SystemFacade {
	PopconPopper popcon;
	MoviePlayer player;
	Light	light;
	
	public SystemFacade(PopconPopper popconPopper,MoviePlayer player,Light light){
		this.popcon=popconPopper;
		this.player=player;
		this.light=light;
	}
	
	public void startMovie(){
		popcon.createPopcon();
		light.off();
		player.play();
		System.err.println("======================================");
	}
	
	public void endMovie(){		
		player.stop();
		light.on();
		popcon.stop();
		System.err.println("======================================");
	}
}
