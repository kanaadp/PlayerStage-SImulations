class worldfilegen{
	public static void main(String[] args){
		System.out.println("include \"compactcar.inc\"");
		System.out.println("include \"map.inc\"");
		System.out.println("floorplan");
		System.out.println(" (");	
		System.out.println("  color \"grey\" \n  name \"intersection\"\n  size [540.000 540.000 0.800]\n  pose [0.000 0.000 0.000 0.000]\n  bitmap \"intersection.png\"\n  obstacle_return 1\n  laser_return 1\n  ranger_return 1.000");
		System.out.println(" )");
		String n ="floorplan\n"+
		" (\n"+
		"  color \"goldenrod\"\n"+
		"  names \"lane markers\"\n"+
		"  size [18.000 18.000 0.010]\n"+
		"  pose [0.000 0.000 0.000 0.000]\n"+
		"  bitmap \"lanemarkers.png\"\n"+
		"  ranger_return 0\n"+
		"  obstacle_return 0\n"+
		" )";
		System.out.println(n);					
		for(int i = 1; i <= 100; i=i+4){
		int distance = (5 + (i-1)/4);
		String a = 
		"compactcar\n"+
		"(\n"+
		"name \"car" + i + "\"\n"+
		"pose [ 1.500 "+-distance+".000 0.000 90.000]\n"+
		"color \"yellow\"\n"+
		"gui_nose 1\n"+
		")";
		String s = 
		"compactcar\n"+
		"(\n"+
		"name \"car" + (i+1) + "\"\n"+
		"pose [ -1.500 "+distance+".000 0.000 -90.000]\n"+
		"color \"yellow\"\n"+
		"gui_nose 1\n"+
		")";
		String d = 
		"compactcar\n"+
		"(\n"+
		"name \"car" + (i+2) + "\"\n"+
		"pose [ "+distance+".000 1.500 0.000 180.000]\n"+
		"color \"yellow\"\n"+
		"gui_nose 1\n"+
		")";
		String f = 
		"compactcar\n"+
		"(\n"+
		"name \"car" + (i+3) + "\"\n"+
		"pose [ -"+distance+".000 -1.500 0.000 0.000]\n"+
		"color \"yellow\"\n"+
		"gui_nose 1\n"+
		")";
		System.out.println(a);
		System.out.println(s);
		System.out.println(d);
		System.out.println(f);
		}
	}
}

/*floorplan
compactcar
(
  name "car1"
  pose [ 1.500 -5.000 0.000 90.000]
  color "yellow"
  gui_nose 1
)
*/
