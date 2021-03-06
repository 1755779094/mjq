package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	
	public static void main(String[] args) {
		
		String testS = "010 - 12345  000";
		String tel  = "15721058339";
		String email = "ww1755779094ww@qq.com";
		String ppt = "xzood";
		String cerm = "622726199001312610";
		compare(cerm);
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
