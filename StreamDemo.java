package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(6,5,8,2,1);
		Stream<Integer> data=nums.stream();
		Stream<Integer> mapdata=data.map(n->n*2);
		//mapdata.forEach(n->System.out.println(n));
		//data.forEach(n->System.out.println(n));
		//System.out.println(nums);
		//for(int n:nums) {
			//System.out.println(n*2);
		//}

	}

}
