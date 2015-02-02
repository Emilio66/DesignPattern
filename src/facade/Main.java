package facade;

public class Main {
	public static void main(String[] args){
		PopconPopper popper=new PopconPopper();
		Light light =new Light();
		MoviePlayer player=new MoviePlayer();
		SystemFacade user=new SystemFacade(popper, player, light);
		user.startMovie();
		user.endMovie();
	}
}
