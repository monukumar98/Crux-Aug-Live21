package Lec41;

import Lec40.Stack;

public class DynaimcStack extends Stack {

	@Override
	public void push(int item) throws Exception {
		if(this.Is_Full()){
			
			int [] newarr= new int [2*this.arr.length];
			
			for (int i = 0; i < this.arr.length; i++) {
				
				newarr[i]=this.arr[i];
			}
			this.arr=newarr;		
			
		}
		super.push(item);
		
		

	}

}
