/* purpose is to illustrate that variable is to be initialized before
 * the constructor
 * @author:  Kevin Li
 * @mail:	lizhihui-kevin@live.com
 */

public class JavaConstructorInitDemo01{

	int i;
	JavaConstructorInitDemo01(){
		i=9;
	}

	public static void main(String[] args){
		// non-static variable is not referencable by static methods
		JavaConstructorInitDemo01 jcinstance = new JavaConstructorInitDemo01(); 

		System.out.println("Value of i is: "+jcinstance.i);
	}
}
