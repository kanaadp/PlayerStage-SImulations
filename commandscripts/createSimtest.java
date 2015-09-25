import java.util.*;
class createSimtest{
	public static void main(String[] args)
	{
		 //         ./../../workspace/carcontrol/Debug/carcontrol 1 1 .25 .15 &
	String executecommand = "./../workspace/"+args[0]+"/Debug/"+args[0];
	String basespeed = ".25 ";
	String turnspeed = ".15 ";
	Random rand = new Random();
	for (int i = 1; i<=12; i++){
		System.out.println(executecommand + " " + i +" "+ 0 + " " + basespeed + turnspeed + "&");
		System.out.println("sleep 1");
		
		}
	}
}
