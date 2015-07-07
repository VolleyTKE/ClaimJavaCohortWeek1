import java.util.Arrays;
public class BubbleSortAge	{
	public static void main(String[] args)	{
		int age[] = new int[]{32, 25, 56, 12, 20, 22, 19, 54, 56, 22};

		for(int i = 0; i < age.length; i++)	{
			if(age[i] > age[i+1])	{
				int temp = age[i];
				age[i] = age[0+1];
				age[0+1] = temp;
			}
			
		
		}

		System.out.println("The sorted ages are: " + Arrays.toString(age));
	}
        
}

