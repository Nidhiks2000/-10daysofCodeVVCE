#DAY 1 
#PROBLEM:LEFT ROTATION

#include<stdio.h>
int main()
{
int i,j,arr[100000],n,d;
    
// initialising the values for number of elements and no of rotation
scanf("%d\t%d",&n,&d);
    
// intialising the values for array
for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
    
 // traversing the array and finding the new index after rotation d
for(i=0;i<d;i++)
{ 
    int first=arr[0];
    for(j=0;j<n;j++)
    {
        arr[j]=arr[j+1];// assigning the element to respective position after the rotation in the particular iteration
    }
    arr[n-1]=first;// assigning the rotated element to the last index of the array during therespective iteration
}
    
//  printing the respective array
for(i=0;i<n;i++)
{
    printf("%d\t",arr[i]);
}
    return 0;
}
