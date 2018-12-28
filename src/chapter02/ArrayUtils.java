package chapter02;

import java.sql.Array;
import java.util.Arrays;
import java.util.function.DoubleToIntFunction;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import javax.management.openmbean.ArrayType;

public class ArrayUtils {
	// int 배열을 double 배열로 변환
	static double [] intToDouble( int[] source ) {
		double []target=new double[source.length];
		for(int i=0;i<source.length;i++) {
			target[i]=source[i];
		}
		return target;
		//return Arrays.stream(source).asDoubleStream().toArray();
	}
	
	// double 배열을 int 배열로 변환
	static int [] doubleToInt( double[] source ) {
		int []target=new int[source.length];
		for(int i=0;i<source.length;i++) {
			target[i]=(int)source[i];
		}
		return target;
		/*DoubleStream streams=Arrays.stream(source);
		return streams.mapToInt(new DoubleToIntFunction() {
			
			@Override
			public int applyAsInt(double value) {
				// TODO Auto-generated method stub
				return (int)value;
			}
		}).toArray();*/
		
	}
	
	// int 배열 두 개를 연결한 새로운 배열 리턴
	static int [] concat( int[] s1, int[] s2 ) {
		int []s3=new int[s1.length+s2.length];
		System.arraycopy(s1, 0, s3, 0, s1.length);
		System.arraycopy(s2, 0, s3, s1.length, s2.length);
		return s3;
	
	}

}
