package reges.projects;

public class C02P04_MenOnStairs {

	public static final int STAIRCASE_NUM = 10;

	public static void main(String[] args) {

		for (int currentStair = STAIRCASE_NUM; currentStair > 0;currentStair--){
			drawMan(currentStair);	
		}
		drawBottomLine();
	}

	public static void drawMan(int currentStair){

		System.out.print(getPreSpace(currentStair) + "  O  ******" + getPostSpace(currentStair, true));
		System.out.println();
		System.out.print(getPreSpace(currentStair) + " /|\\ *" + getPostSpace(currentStair,false));
		System.out.println();
		System.out.print(getPreSpace(currentStair) + " / \\ *" + getPostSpace(currentStair, false));
		System.out.println();

	}

	public static String getPreSpace(int currentStair){
		String preSpace = new String();
		String spaceUnit = "     ";

		for (int space=(STAIRCASE_NUM - currentStair); space < STAIRCASE_NUM-1; space++){
			preSpace+= spaceUnit;	
		}
		return preSpace;
	}

	public static String getPostSpace(int currentStair,boolean isTop){
		String postSpace = new String();
		String spaceUnit = "     ";

		int totalPostSpace = (STAIRCASE_NUM - currentStair);

		if(isTop)
			for (int i=0; i< totalPostSpace; i++){
				postSpace+= spaceUnit;	
			}else{
				for (int i=0; i<= totalPostSpace; i++){
					postSpace+= spaceUnit;
				}
			}
		return postSpace+= "*";
	}

	public static void drawBottomLine(){
		String starUnit = "*****";
		for (int i = 0; i <= STAIRCASE_NUM;i++){
			System.out.print(starUnit);
		}
		System.out.print("**"); //Now it works!!
	}

}
