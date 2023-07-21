#include<stdio.h>
int main()
{
int i,j,n;
scanf("%d",&n);
int a[n];
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
int k;
scanf("%d",&k);
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[i]+a[j]==k)
{
printf("%d+%d=%d\n",a[i],a[j],k);
}
}
}
return 0;
}
