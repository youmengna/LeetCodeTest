package test;

public class Solution {

	/**
	 * @param args
	 */
    public int addDigits(int num) {
    	String num1=Integer.toString(num);
    	if(num>9)
    	{
    		int sum=0;
    		for(int i=0;i<num1.length();i++)
    		{
    			int temp=Integer.parseInt(String.valueOf(num1.charAt(i)));;
    			sum=sum+temp;
    		}
    		if(sum>9)
        	{
    			return addDigits(sum);
        	}
    		else {
				return sum;
			}
    	}
    	return num;
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Solution solution=new Solution();
		int a=solution.addDigits(0);
		System.out.println(a);
	}

}
