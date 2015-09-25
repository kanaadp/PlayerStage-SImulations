class cfgfilegen{
	public static void main(String[] args){
		System.out.println("driver");
		System.out.println(" (");
		System.out.println("  name \"stage\"");
		System.out.println("  provides [ \"simulation:0\" ]");
		System.out.println("  plugin \"stageplugin\"");
		System.out.println("  worldfile \"ex0.world\"");
		System.out.println(" )");				
		for(int i = 1; i <= 100; i++){
		System.out.println("driver");
		System.out.println(" (");
		System.out.println("  name \"stage\"");
		System.out.println("  provides [\"position2d:"+i+"\" \"ranger:"+i+"\"]");
		System.out.println("  model \"car"+i+"\"");
		System.out.println(" )");
		}
	}
}
/*
 * driver
 (		
  name "stage"
  provides [ "simulation:0" ]
  plugin "stageplugin"

  # load the named file into the simulator
  worldfile "ex0.world"	
 )
 * 
driver
(
  name "stage"
  provides ["position2d:1" "ranger:1"]
  model "car1"
)

*/
