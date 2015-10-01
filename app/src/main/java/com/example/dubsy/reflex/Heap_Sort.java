package com.example.dubsy.reflex;/* ECE 325 - Lab 1
 * Aaron Arnason
 * 1281110
 * 
 * Implementation of Heap_Sort:
 * Create Object, call ascending sort and pass it an 
 * unsorted array. Then to see the output of the sort
 * call print_sorted_array.
 * 
 * It will build a max heap (root has largest element),
 * and it satisfies cbt (complete binary tree)
 * and the max heap property (the children of any parent
 * hold smaller than or equal to values.
 * 
 * Then it extracts/swaps the max element for some random number
 * and percolates down the tree.
 * Once sorted_values = heapsize - 1 the array has been sorted.
 * */

public class Heap_Sort {
	/* Private Variables:
	 * max_heap: contains the unsorted array in a CBT structure that 
	 * also follows the heap property.
	 * heapsize: contains the length of array.
	 * sorted_values: is the number of values sorted in the max_heap*/
	private int[] max_heap;
	private int heapsize = 0, sorted_values = 0;
	
	
	/* Function Name: ascending_sort
	 * Input: unsorted_array
	 * Function:
	 * This function builds a heap (max), then sorts
	 * the values. 
	 *
	 * Output: Nothing
	 */
	public int[] ascending_sort(int[] unsorted){
		this.build_max_heap(unsorted);
		while(this.sorted_values < this.heapsize){
			this.extract_max();
			this.percolate_down(0);
		}
		return this.max_heap;
	}
	
	
	/* Function Name: percolate_down
	 * Input: index
	 * Function:
	 * Pass this function the index of the node that needs
	 * to percolate down.
	 * It swaps out values all the way down the tree until
	 * it no longer can. Then exits out.
	 *
	 * Output: Nothing
	 */
	private void percolate_down(int index){
		while(true){
			if((index + 1) * 2 < this.heapsize - this.sorted_values){  
				if(this.max_heap[(index + 1) * 2] > this.max_heap[(index + 1) * 2 - 1] &&
						this.max_heap[(index + 1) * 2] > this.max_heap[index]){  
					this.swap((index + 1) * 2, index); 
					this.percolate_down((index + 1) * 2);
				} else if (this.max_heap[(index + 1) * 2 - 1] > this.max_heap[index]){
					this.swap((index + 1) * 2 - 1, index);
					this.percolate_down((index + 1) * 2 - 1);
				} else {
					return;
				}
			} else if((index + 1) * 2 - 1 < this.heapsize - this.sorted_values){ 
					if(this.max_heap[(index + 1) * 2 - 1] > this.max_heap[index]){  
					this.swap((index + 1) * 2 - 1, index);
					this.percolate_down((index + 1) * 2);
				} else {
					return;
				}
			} else { 
				return;
			}
		}
	}
	
	
	
	/* Function Name: extract_max
	 * Input: None
	 * Function:
	 * This function simply keeps track of the last position available,
	 * then swaps the value at root with that index.
	 *
	 * Output: Nothing
	 */
	private void extract_max(){
		this.swap(0, this.heapsize - 1 - this.sorted_values);
		this.sorted_values++;
	}
	

	/* Function Name: build_max_heap
	 * Input: unsorted_array
	 * Function:
	 * This function does two things. Firstly, takes an input array
	 * and creates a complete binary tree. And secondly, it makes sure
	 * each node is satisfying the heap property. In this case, the heap
	 * property is for each parent node, its children must be less than
	 * or equal.
	 *
	 * Output: Nothing
	 */
	private void build_max_heap(int[] unsorted_array){
		this.heapsize = unsorted_array.length;
		this.max_heap = new int[this.heapsize];
		for(int index = 0; index < this.heapsize; index++){
			this.max_heap[index] = unsorted_array[index];
			this.satisfy_heap(index);
		}
	}
	
	
	/* Function Name: satisfy_heap
	 * Input: Parent node
	 * 
	 * Function:
	 * This function checks the immediate left child and right child
	 * to make sure that the heap property is satisfied.
	 * In this case, max_heap requires that every parent must be
	 * larger than or equal to its children.
	 * 
	 * Output: Nothing
	 */
	private void satisfy_heap(int node){
		while(true){
			if(node == 0){return;}
			else if ((node % 2) == 1){
				if(this.max_heap[node] > this.max_heap[node/2]){
					this.swap(node, node/2);
				}
				node /= 2;
			}
			else {
				if(this.max_heap[node] > this.max_heap[node/2 - 1]){
					this.swap(node, node/2 - 1);
				}
				node /= 2;
				node -= 1;
			}
		}
	}
	
	
	/* Function Name: swap
	 * Input: Two integers used in array indices.
	 * 
	 * Function:
	 * The swap function modifies the private array max_heap
	 * and takes the args at index i,j and swaps the two values.
	 * For example: int [] x = {1,2}
	 * this.swap(0,1) ==> x = {2,1}
	 * 
	 * Output: Nothing
	 */
	private void swap(int i, int j){
		int temp = this.max_heap[i];
		this.max_heap[i] = this.max_heap[j];
		this.max_heap[j] = temp;
	}

	
	/* Function Name: print_sorted_array()
	 * Input: None
	 * Function:
	 * This simply prints the values that are stored in max_heap
	 * 
	 * Output: Nothing
	 */
	public void print_sorted_array() {
		int count = 0;
		for(int value : this.max_heap) {
			System.out.print("I: " + count + "  Val: " + value);
			if(count == 0){
				System.out.println(" =>      Root");
			} else if(count % 2 == 0) {
				System.out.println(" =>      Right");
			} else {
				System.out.println(" =>      Left");
			}
			count++;
		}
		System.out.println("");
	}
	
	
	/* Function Name: main
	 * Input: args (array of strings)
	 * Function:
	 * This is the starting point of the program, there are a couple
	 * of int arrays that need sorting. 
	 * The next few lines is object instantiation, and calling a couple
	 * methods on that object.
	 * 
	 * Output: Nothing
	 */
	public static void main(String[] args) {
		int[] array = {1,3,6,2,9,6,8,16,33,15,28,30,11,12};
		//int[] array = {4,1,7,5,8,0};
		int[] array1 = {41,67,34,0,69,24,78,58,62,64,5,45,81,27,61};
		Heap_Sort myheap = new Heap_Sort();
		myheap.ascending_sort(array1);
		System.out.println(" ");
		myheap.print_sorted_array();
	}
}