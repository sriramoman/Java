package bitmanip;

enum shiftMode{
	logic,
	arithmetic
}

public class Tutorial {
	static int repeatedShiftRight(int data,int count,shiftMode type){
		//Shift data <count> times
		for(int i=0;i<count;i++)
			if(type==shiftMode.logic)
				data>>>=1;
			else
				data>>=1;
		return data;
	}
	public static void main(String[] args) {
		System.out.println(repeatedShiftRight(-93242,40,shiftMode.logic));
		System.out.println(repeatedShiftRight(-93242,40,shiftMode.arithmetic));
//		System.out.println(-93242/Math.pow(2, 40));
		
	}

}
