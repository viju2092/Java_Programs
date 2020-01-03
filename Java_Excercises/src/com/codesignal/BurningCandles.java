package com.codesignal;

import java.util.*;

public class BurningCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int max = 0,sum=0,temp=0,newtemp=0,flag = 0,tot=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Program to Burn Candles");
	System.out.println("Enter the Array Size");
	int d = sc.nextInt();
	System.out.println("Enter the Array Elements");
	int candles[] = new int[d];
	ArrayList<Integer> candlestore = new ArrayList<Integer>();
	ArrayList<Integer> burnedcandles = new ArrayList<Integer>();
	for(int r=0; r<candles.length;r++)
	{
		candles[r] = sc.nextInt();
	}
	
	System.out.println("Enter the value of n");
	int n = sc.nextInt();
    for(int g=0;g<candles.length;g++)
    {
      candlestore.add(candles[g]);
    }
    System.out.println(candlestore);
	
    flag = n;
    int len1 = candlestore.size();
    int len2 = len1 - n;
   // while(flag>=1)
  //  {


	for(int i=0;i<candlestore.size();i++)
	{
	    max = candlestore.get(0);
		if(candlestore.get(i) > max)
		{
			max = candlestore.get(i);
			candlestore.remove(i);
			burnedcandles.add(max);
			if(burnedcandles.size() == n)
			{
				for(int j=0;j<burnedcandles.size();j++)
				{
				sum += burnedcandles.get(j);
				temp = sum/(n+1);
				candlestore.add(temp);
				}
			}
			if(burnedcandles.size() == 2*n)
			{
				for(int k=burnedcandles.size()-n;k<burnedcandles.size();k++)
				{
					tot += burnedcandles.get(k);
					sum += tot;
					newtemp = tot/(n+1);
					candlestore.add(newtemp);
				}
			}
			if(candlestore.isEmpty() && burnedcandles.size() == 2*n)
			{
				for(int q=burnedcandles.size()-n;q<burnedcandles.size();q++)
				{
					tot += burnedcandles.get(q);
					sum += tot;
					newtemp = tot/(n+1);
					candlestore.add(newtemp);
				}
			}
			if(candlestore.isEmpty() && burnedcandles.size() != 2*n)
			{
				System.out.println(sum);
				break;
			}
		i=0;
		}

	}
	//flag--;
   // }
	//System.out.println(max);
	//System.out.println(sum);
	}

}
