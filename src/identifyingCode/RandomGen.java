package identifyingCode;

import java.util.Random;

public class RandomGen {
	//生成四位不重复的验证码
	public static String codeGen() {
		char [] codeSequence={'A','B','C','D','E','F','G','H','I','J',
			    'K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
			    '1','2','3','4','5','6','7','8','9','0'};
		Random random =new Random();
		StringBuilder sb=new StringBuilder();//动态字符串，String字符串不能修改
											//StringBuilder线程不安全，但是速度快
											//StringBuffer线程安全但是速度慢
		int count=0;//计数产生的是四位
		while(true) {
			char c=codeSequence[random.nextInt(codeSequence.length)];//随机获得0到指定数的下标
            //假设取出来的字符在动态字符串中不存在，代表没有重复
            if (sb.indexOf(c+"")==-1) {
                sb.append(c);//追加到动态字符串中
                count++;
                if (count==4) {
                    break;
                }
            }
		}
		return sb.toString();
	}

}
