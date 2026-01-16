class IFELSELADDER{
	public static void main(String[] args){
		int CourseId = 3;
		if(CourseId==1){
			System.out.println("Java Course");
			System.out.println("Includes:Java,DSA,DBMS,OS");

		}else if(CourseId==2){
			System.out.println("Python Course");
                        System.out.println("Includes:Python,IOT,ML,AI");

		}else if(CourseId==3){
                        System.out.println("Bootcamp Course");
                        System.out.println("Includes:C,CPP,DSA");

		}else if(CourseId==4){
                        System.out.println("Flutter Course");
                        System.out.println("Includes:Dart,Flutter");

		}else if(CourseId==5){
                        System.out.println("Webdev Course");
                        System.out.println("Includes:HTML,CSS,JS,React");

		}else if(CourseId==6){
                        System.out.println("Backend Course");
                        System.out.println("Includes:AdvJAVA,SpringBoot");
		}else{
		System.out.println("Invalid CourseId");
		}
	}
}	

