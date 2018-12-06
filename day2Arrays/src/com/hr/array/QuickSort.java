package com.hr.array;

/**
 * ��������
 * @author LH
 *
 */
public class QuickSort {

	public static void quickSort(String [] strDate, int left, int right){
		String middle,tempDate;
		int i, j;
			i = left;
			j = right;
		   middle = strDate[(i+j)/2];
	   
	   do {
			    while(strDate[i].compareTo(middle) < 0 && i< right){
			    		i++; //�ҳ���߱��м�ֵ�����
			    }
			    
			    while (strDate[j].compareTo(middle) > 0 && j > left) {
			    		j--;//�ҳ��ұ߱��м�ֵС����				
				}
			    //����ߴ�������ұ�С���������滻
			    if(i <= j){
			    	tempDate = strDate[i];
			    	strDate[i] = strDate[j];
			    	strDate[j] = tempDate;
			    	i++;
			    	j--;
			    }
			    
	   } while (i <= j); //�����߽���ʱֹͣ
	   
	   if(i < right){
		   quickSort(strDate, i, right);
	   }
	   if(j > left){
		   quickSort(strDate, left, j);
	   }
	   
	}
	
	
	
	
}
