package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
/**
 * \ 转义字符  java \\ 代\ 正则表达式也需要转义 顾\在java 正则表达式 \\\\
 * ^开头 $结尾
 *  * 0次或多次  gc* 匹配 g 或者 gcccc  等同于 {0,}
 *  + 1次或多次  gc+ 匹配 gc 或者 gcccc  等同于 {1,}
 *  {n} n正整数 就是出现n次 {n,m}出现n-m次
 *  x|y  x次或者Y次 匹配 任选一  
 *  [xyz] 匹配xyz任意一个字符[^xyz]反向 匹配非xyz的字符
 *  \d 等效于 [0-9]任意数字  \D匹配非数字字符[^0-9]
 *  \n换行符 \r 回车符 \s 匹配任何空白字符 \S匹配任何非空字符
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
		
		//电话号码
		Pattern phone = Pattern.compile("\\d{3}\\s+-\\s+\\d{3,5}");
		//手机号码？
		Pattern tel = Pattern.compile("1(3|8|9|7)\\d\\d{8}");
		//邮箱
		Pattern email = Pattern.compile("\\w*\\d*@(163|qq|wangyi)\\.((com)+|(cn)+)");
		//身份证号
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
