//start class
 class DragonBall{
private int size;
private int stars;
private String color;

public DragonBall(){
	size = 8;
	stars = 4;
	color = "orange";
}
public DragonBall(int s, int sT, String c){
	size = s;
	stars = sT;
	color = c;
}
public DragonBall(int sT, String c){
	stars = sT;
	color = c;
}
public void changeSize(int s){
size = s;
}
public void changeStars(int sT){
	stars = sT;
}
public void changeColor(String c){
	color = c;
	}
	public int getSize(){
	return size;
	}
		public int getStars(){
		return stars;
	}
	public String getColor(){
	return color;
	}

	public String toString(){
	return "Size: "+ size + "\nStars: " + stars + "\nColor: " + color;
	}
}// end of class

//start of new class
 public class DragonBallDriver {
	public static void main(String args[]) {
		DragonBall Goku = new DragonBall();
		DragonBall Kill = new DragonBall(12, 7, "Chartreuse");
		DragonBall Nutella  = new DragonBall(5, "Green");
		
		System.out.println("Goku Parameters");
		System.out.println(Goku);
		System.out.println();
		System.out.println("Kill Parameters");
		System.out.println(Kill);
		System.out.println();
		System.out.println("Nutella Parameters");
		System.out.println(Nutella);
		
		Goku.changeSize(4);
		Kill.changeStars(7);
		Nutella.changeColor("Brown");
		System.out.println();
		System.out.println("New Changes");
		
		System.out.println();
		System.out.println("Goku Parameters");
		System.out.println(Goku);
		System.out.println();
		System.out.println("Kill Parameters");
		System.out.println(Kill);
		System.out.println();
		System.out.println("Nutella Parameters");
		System.out.println(Nutella);
		
		System.out.println();
		System.out.println("Parameter Combonation");
		
		System.out.println("Size: "+Goku.getSize());
		System.out.println("Stars: "+Kill.getStars());
		System.out.println("Color: "+Nutella.getColor());

	}
}
