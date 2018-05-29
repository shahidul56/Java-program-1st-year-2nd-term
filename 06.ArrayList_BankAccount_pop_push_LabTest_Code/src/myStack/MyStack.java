package myStack;

import java.lang.reflect.Array;

	public class MyStack <T> {
		private T []arr;
		private int  totalsize;
		private int index;
		
		public MyStack (Class<T> clas, int size){
			this.arr =  (T[]) Array.newInstance(clas, size);
			this.totalsize = size;
			this.index = 0;
		}
		
		void push(T elemnt){
			if(index<totalsize){
				arr[index] = elemnt;
				index++;
			}
		}
		
   
		
		private T a;
		
		public T pop()
			{
				if(index>0) {
					index--; // java object oriented progrannn
					a = arr[index];
					arr[index] = null;
					
					return a;
					
				}
				
				else
					return null;
			}
		
		boolean isEmpty() {
			if (index == 0)
				return true;
			else {
				 return false;
			}
		}
		
		int k, m = 3;
		T ab;
		int search (T aa) {
			for ( k = 0; k < totalsize; k++ ) {
				ab = arr[k];
				if (aa == ab){
					m = k;
					break;
				}
				else; 
					m = -1;
			}
			
			return m;
		}
		
		
		
		
			
		
		
}
