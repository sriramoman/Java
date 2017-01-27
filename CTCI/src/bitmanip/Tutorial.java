package bitmanip;

enum shiftMode{
	logic,
	arithmetic
}

enum significance{
	msb,
	lsb
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
	
	static boolean getBit(int data,int position){
		int mask=1<<(position-1);
		return (data & mask)!=0;
	}
	static int setBit(int data,int position){
		int mask=1<<(position-1);
		return data|mask;
	}
	static int clearBit(int data,int position,significance bit){
		int mask=0;
		if(bit==significance.lsb)	//clears <position> LSBs
			mask=~0<<position;
		else	//retains <position> MSBs
			mask=(1<<position)-1;
		return data&mask;
	}
	static int updateBit(int data,int position,int bit){
		int val=bit==1?1:0;
		int mask=~(1<<(position-1));
		return (data&mask)|(val<<(position-1));
	}
	public static void main(String[] args) {
		System.out.println(repeatedShiftRight(-93242,40,shiftMode.logic));
		System.out.println(repeatedShiftRight(-93242,40,shiftMode.arithmetic));
		System.out.println(-93242/Math.pow(2, 40));
		System.out.println(getBit(-21,1));
		System.out.println(setBit(8,2));
		System.out.println(clearBit(15,2,significance.lsb));
		System.out.println(clearBit(21,3,significance.msb));
		System.out.println(updateBit(0,4,1));
	}

}
