package com.huawei.interview;

/**
 * Two fork tree
 * ����������
 * @author LH
 *
 */
public class Node {
             
	   public int value;
	   public Node left;
	   public Node right;
	   
	   public void store(int value){
			     if(value < this.value){
				    	  if(left == null){
				    		  left = new Node();
				    		  left .value = value;
				    	  }else {
				    		  left.store(value);
				    	  }
			     }else{
			    	    if(value > this.value){
			    	    	   if(right == null){
			    	    		   right = new Node();
			    	    		   right.value = value;
			    	    	   }else{
			    	    		    right.store(value);
			    	    	   }
			    	    }
			     }
	   }
	   
	   public  boolean find(int value){
		   System.out.println("happen " + this.value);
		   if(value == this.value){
			      return true;
		   }else if(value > this.value){
			      if(right == null){
			    	 return false;
			      }
			      return right.find(value);
		   }else{
			     if(left == null ){
			    	   return false;
			     }
			     return left.find(value);
		   }
	   }
	   
	   public void preList(){
		   System.out.println(this.value +  ",");
		   if(left != null ){
			    left.preList();
		   }
		   if (right != null) {
			   right.preList();
		   }
	   }
	   
	   public void middleList(){
		    if(left != null){
		    	left.preList();
		    }
		    System.out.println(this.value + ",");
		    if(right != null){
		    	right.preList();
		    }
	   }
	   
	   public void afterList(){
		   if(left != null){
			     left.preList();
		   }
		   if (right != null) {
			   right.preList();
		}
		   System.out.println(this.value + ",");
	   }

}
