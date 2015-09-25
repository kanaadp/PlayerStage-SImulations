import java.util.*;
class createSim{
	public static void main(String[] args)
	{
		 //         ./../../workspace/carcontrol/Debug/carcontrol 1 1 .25 .15 *scenario_name* &
		String executecommand = "./../../../workspace/"+ args[0]+"/Debug/"+args[0];
		String basespeed1 = ".10 ";
		String basespeed2 = ".25 ";
		String basespeed3 = ".50 ";
		String basespeed4 = ".75 ";
		String basespeed5 = "1.0 ";
		String turnspeed = ".15 ";
		String scenario_name = args[1];
		Random rand = new Random();
		System.out.println("echo \"BASE SPEED = .10\"");
		for (int i = 1; i<=100; i++){
			System.out.println(executecommand + " " + i +" "+ 0 + " " + basespeed1 + turnspeed + scenario_name+" &");
			System.out.println("sleep " + rand.nextInt(3));
		}
	}
}
