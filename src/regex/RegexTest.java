package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
/**
 * \ ת���ַ�  java \\ ��\ ������ʽҲ��Ҫת�� ��\��java ������ʽ \\\\
 * ^��ͷ $��β
 *  * 0�λ���  gc* ƥ�� g ���� gcccc  ��ͬ�� {0,}
 *  + 1�λ���  gc+ ƥ�� gc ���� gcccc  ��ͬ�� {1,}
 *  {n} n������ ���ǳ���n�� {n,m}����n-m��
 *  x|y  x�λ���Y�� ƥ�� ��ѡһ  
 *  [xyz] ƥ��xyz����һ���ַ�[^xyz]���� ƥ���xyz���ַ�
 *  \d ��Ч�� [0-9]��������  \Dƥ��������ַ�[^0-9]
 *  \n���з� \r �س��� \s ƥ���κοհ��ַ� \Sƥ���κηǿ��ַ�
 *  
 *  
 */
		
		String testS = "010 - 12345  000";
		String phone = "^1[0-9]{10}";
		String tel  = "15721058339";
		if(tel.matches(phone)) {
			System.out.println(1);
		}else {
			System.out.println(2);
		}
		if(phone.matches(tel)) {
			System.out.println(1);
		}else {
			System.out.println(2);
		}
		String email = "ww1755779094ww@qq.com";
		String ppt = "xzood";
		String cerm = "622726199001312610";
//		compare(cerm);
		testRegex();
		
		compare(cerm);
	}
	
	
	public static void testRegex() {
		String str = "{\\\"name\\\":\\\"spy\\\",\\\"id\\\":\\\"123456\\\"}";
		System.out.println(str);
		String t = str.replaceAll("\\\\", "\\\\\\\\");
		System.out.println(t);
	}
	
	public static boolean compare(String s){
		
		//�绰����
		Pattern phone = Pattern.compile("\\d{3}\\s+-\\s+\\d{3,5}");
		//�ֻ����룿
		Pattern tel = Pattern.compile("1(3|8|9|7)\\d\\d{8}");
		//����
		Pattern email = Pattern.compile("\\w*\\d*@(163|qq|wangyi)\\.((com)+|(cn)+)");
		//���֤��
		Pattern cerm = Pattern.compile("^(\\d{6})(18|19|20)?(\\d{2})(([0][1-9])|([1][0-2]))(([0][1-9])|([12][0-9])|([3][0-1]))(\\d{3})(\\d|X|x)?$");
		
		Pattern ppt = Pattern.compile("^x(z|f)ood");
		
		Matcher mt = cerm.matcher(s);
		//mt.matches();
		if(mt.find()) {
			System.out.println(mt.group());
			return true;
		}else {
//			System.out.println(mt.group());
			return false;
		}
	} 
}
