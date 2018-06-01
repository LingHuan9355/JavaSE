package com.imooc.test;

import java.util.Scanner;

import org.junit.Test;

import com.imooc.java.Car;
import com.imooc.java.PassengerCar;
import com.imooc.java.PickUp;
import com.imooc.java.Trunk;

/**
 * ����:�⳵ϵͳ
 * @author LH
 *
 */
public class TestJunit {

	@Test
	public void TestMain(){
		  Car [] carArry={
				     new PassengerCar("�µ�A4", 4, 500),
	                 new PassengerCar("���Դ�6", 4, 400),
	                 new PickUp("Ƥ��ѩ6", 4, 2, 450),
	                 new PassengerCar("����", 20, 800),
	                 new Trunk("�ɻ���",4, 4000 ),
	                 new Trunk("��ά��",20,1000)};
			System.out.println("==================��ӭʹ�ò����⳵ϵͳ==================");
			System.out.println("���Ƿ�Ҫ�⳵��1���ǣ�0����");
			Scanner scan=new Scanner(System.in);
			int input=scan.nextInt();
			//��Ҫ�⳵
			if(input==1){
			  int totalBusload = 0;            //�ܵ��ؿ���  
			  int totalCargocapacity=0;        //�ܵ��ػ���  
			  int totalPrice=0;                //�ܼ۸�  
			  int rentday ;                    //�⳵��
			
			  System.out.println("�����⳵�����ͼ����Ŀ�����£�");
			  System.out.println("���\t"+"����\t"+"���\t"+"����");
			  int i=1;
			  for (Car car : carArry) {
				if(car instanceof PassengerCar){
				    System.out.println(""+ i+".\t"+car.carName + "\t" +car.rentdaily +"Ԫ\t"+"���ˣ�"+car.busload+"��");
				     	i++;
				}
				if(car instanceof PickUp){
					System.out.println(""+ i+".\t"+car.carName + "\t" + car.rentdaily+"Ԫ\t"+"���ˣ�"+car.busload+"\t�ػ���"+car.cargo+"��");
						i++;
				}
				if(car instanceof Trunk){
					System.out.println(""+ i+".\t"+car.carName + "\t" +car.rentdaily +"Ԫ\t"+"�ػ���"+car.cargo+"��");
						i++;
				}
				
			}
			
			
			System.out.println("��������Ҫ��������������");
			int inputInt = scan.nextInt();
			for (int j = 0; j < inputInt ; j++) {
					System.out.println("�������" + (j+1) + "��������ţ�");
					int num=scan.nextInt();
			    
					if(carArry[num-1] instanceof PassengerCar){
						totalBusload += carArry[num-1].busload;
						totalPrice +=carArry[num-1].rentdaily;
					}
					
					if(carArry[num-1] instanceof Trunk){
						totalCargocapacity += carArry[num-1].cargo;
						totalPrice +=carArry[num-1].rentdaily;
					}
					
					if(carArry[num-1] instanceof PickUp){
						totalBusload += carArry[num-1].busload;
						totalCargocapacity +=carArry[num -1].cargo;
						totalPrice +=carArry[num-1].rentdaily;
					}
				  
				}
			System.out.println("������������");
			Scanner input2=new Scanner(System.in);
			rentday=input2.nextInt();
			totalPrice *= rentday;
			
			System.out.println("==========�����⳵===============");
			System.out.println("����˵����£�");
			System.out.println("**********************");
			System.out.println("���ؿ�����"+totalBusload+"��");
			System.out.println("**********************");
			System.out.println("���ػ���"+totalCargocapacity+"��");
			System.out.println("�⳵�ܼ۸�"+totalPrice+"Ԫ");
			System.out.println("==========�����⳵===============");
	}
	

}
}

