#include<stdio.h>
int main()
{
int a,sum=0;
scanf("%d",&a);
if(a%2==0)
{
sum=a/2;
}
else
{
sum=(a/2)+1;
}
printf("%d",sum);
return 0;
}

