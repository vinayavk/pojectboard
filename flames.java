import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args)
	{
		int i,j,count=0,c=1,k,m=0,n=0,l=0,len=0,length=0,x=0,y=0,z=0;
		String s1;
		String s2;
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		s2=sc.nextLine();
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		char[] ch=new char[50];
		char [] ch3=new char[50];
		char [] ch4=new char[50];
		int s,flml,num=0;
		
		
		String flm="flames";
		flml=flm.length();
		for(i=0;i<ch1.length;i++)
		{
			for(j=i+1;j<ch1.length;j++)
			{
				if(ch1[i]==ch1[j])
				{
					
					
					count++;
					for(k=0;k<count;k++)
					{
						ch[k]=ch1[i];
						
					}
					
				}
			}
		}
		for(i=0;i<ch2.length;i++)
		{
			for(j=i+1;j<ch2.length;j++)
			{
				if(ch2[i]==ch2[j])
				{
					
					c++;
					for(k=count;k<c;k++)
					{
						ch[k]=ch2[i];
					}
					
					
				}
			}
		}
		for(i=0;i<count;i++)
		{
			for(j=0;j<ch1.length;j++)
			{
				if(ch[i]==ch1[j])
				{
					ch1[j]=0;
					break;
				
				}
			}
				for(k=0;k<ch2.length;k++)
				{
				   if(ch[i]==ch2[k])
				   {
					   ch2[k]=0;
					    break;
				    }
				}
			
			
		}
		for(i=count;i<c;i++)
		{
		
				for(k=0;k<ch2.length;k++)
				{
				   if(ch[i]==ch2[k])
				   {
					   ch2[k]=0;
					    break;
				    }
				}
				for(j=0;j<ch1.length;j++)
				{
					if(ch[i]==ch1[j])
					{
						ch1[j]=0;
						break;
					}
				}
			
		}
		for(i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=0){
			  
			    m++;
			    for(k=n;k<m;k++)
			    {
			    	ch3[k]=ch1[i];
			    	n=n+1;
			    	
			    }
			}

		}
		for(i=0;i<ch2.length;i++)
		{
			if(ch2[i]!=0){
			  
			    l++;
			    for(k=len;k<l;k++)
			    {
			    	ch4[k]=ch2[i];
			    	len=len+1;
			    	
			    }
			}

		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<l;j++)
			{
				if(ch3[i]==ch4[j])
				{
					ch3[i]=0;
					ch4[j]=0;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			if(ch3[i]!=0)
			{
				
				x++;
			}
		}
		for(i=0;i<l;i++)
		{
			if(ch4[i]!=0)
			{
				
				y++;
			}
		}
	    z=x+y;
	    for(s=6;s>=1;s--)
		{
			if(z>s)
			 num=z-s;
		   
		    else
		     num=z;
		     while(num>s)
			 {
			   num=num-s;
			 }
			 flm=flm.substring(num,s)+flm.substring(0,num-1);
			 if(flm.length()==1)
			 {
			 	
			 	break;
			 }
			 
			 
		}	
		switch(flm.charAt(0))
		  {
		   case 'f': System.out.println("Relationship = Friends"); break;
		   case 'l': System.out.println("Relationship = Lovers"); break;
		   case 'a': System.out.println("Relationship = Affections"); break;
		   case 'm': System.out.println("Relationship = Married"); break;
		   case 'e': System.out.println("Relationship = Enemy"); break;
		   case 's': System.out.println("Relationship = Siblings"); break;
		  }
		
		
	
	}
}
