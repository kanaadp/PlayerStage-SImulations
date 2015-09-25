import java.util.*;
class createSim{
	public static void main(String[] args)
	{
		//./carcontrol 1 1 .25 .15 &
	String executecommand = "./carcontrol ";
	String basespeed = ".25 ";
	String turnspeed = ".15 ";
	Random rand = new Random();
	for (int i = 1; i<=100; i++){
		System.out.println(executecommand + i +" "+ rand.nextInt(2) + " " + basespeed + turnspeed + "&");
		System.out.println("Sleep 1");
		
		}
	}
}
