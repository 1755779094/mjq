package collection;

public class testNum {
	
	public static void main(String[] args) {
		

		int intValue = 733183670;//随意写一个数
		System.out.println("intValue：" + (intValue));//打印intValue
		System.out.println("intValue右移1位：" + (intValue >> 1));//右移1位
		System.out.println("intValue右移8位：" + (intValue >> 8));//右移8位
		//当int类型右移位数大于等于32位操作时，会先求余后再进行移位操作
		System.out.println("intValue右移32位：" + (intValue >> 32));//求余为32%32=0，相当于右移0位（不移位）
		System.out.println("intValue右移40位：" + (intValue >> 40));//求余为40%32=8，相当于右移8位
		System.out.println("intValue右移64位：" + (intValue >> 64));//求余为64%32=0，相当于右移0位（不移位）
				
		long longValue = 733183670L;
		System.out.println("longValue：" + (longValue));//打印longValue
		System.out.println("longValue右移1位：" + (longValue >> 1));//右移1位
		System.out.println("longValue右移8位：" + (longValue >> 8));//右移8位
		//当long类型右移位数大于等于64位操作时，会先求余后再进行移位操作
		System.out.println("longValue右移64位：" + (longValue >> 64));//求余为64%64=0，相当于右移0位（不移位）
		System.out.println("longValue右移72位：" + (longValue >> 72));//求余为72%64=8，相当于右移8位
		System.out.println("longValue右移128位：" + (longValue >> 128));		
	}

}
