#DAY 1 
#PROBLEM:LEFT ROTATION

#include<stdio.h>
int main()
{
int i,j,arr[100000],n,d;
scanf("%d\t%d",&n,&d);
for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
for(i=0;i<d;i++)
{ 
    int first=arr[0];
    for(j=0;j<n;j++)
    {
        arr[j]=arr[j+1];
    }
    arr[n-1]=first;
}
for(i=0;i<n;i++)
{
    printf("%d\t",arr[i]);
}
    return 0;
}
