package collection;

public class testNum {
	
	public static void main(String[] args) {
		

		int intValue = 733183670;//����дһ����
		System.out.println("intValue��" + (intValue));//��ӡintValue
		System.out.println("intValue����1λ��" + (intValue >> 1));//����1λ
		System.out.println("intValue����8λ��" + (intValue >> 8));//����8λ
		//��int��������λ�����ڵ���32λ����ʱ������������ٽ�����λ����
		System.out.println("intValue����32λ��" + (intValue >> 32));//����Ϊ32%32=0���൱������0λ������λ��
		System.out.println("intValue����40λ��" + (intValue >> 40));//����Ϊ40%32=8���൱������8λ
		System.out.println("intValue����64λ��" + (intValue >> 64));//����Ϊ64%32=0���൱������0λ������λ��
				
		long longValue = 733183670L;
		System.out.println("longValue��" + (longValue));//��ӡlongValue
		System.out.println("longValue����1λ��" + (longValue >> 1));//����1λ
		System.out.println("longValue����8λ��" + (longValue >> 8));//����8λ
		//��long��������λ�����ڵ���64λ����ʱ������������ٽ�����λ����
		System.out.println("longValue����64λ��" + (longValue >> 64));//����Ϊ64%64=0���൱������0λ������λ��
		System.out.println("longValue����72λ��" + (longValue >> 72));//����Ϊ72%64=8���൱������8λ
		System.out.println("longValue����128λ��" + (longValue >> 128));		
	}

}
