package day3;

public class GlobalStaticVariableExample1 {

	//static global variables
	static int age;
	static boolean res;
	static char grade;
	static float roi;
	public static void (String[]args) {
		System.out.println("default value of age is "+age);
		System.out.println("default value of res is "+res);
        System.out.println("default value of grade is "+grade);
        System.out.println("default value of roi is +roi);"
        //initialization of static global variable;
        int age=25;
        boolean res=true;
        char grade=A;
        float roi=6.5f;
        System.out.println("updated value of age is "+age);
        System.out.println("updated value of res is "+res);
        System.out.println("updated value of grade is "+grade);
        System.out.println("updated value of roi is "+roi);
        System.out.println("Program Ends");

}
