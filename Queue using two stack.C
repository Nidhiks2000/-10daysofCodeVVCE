#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

// initiasing the stack
    struct stack
{
    int data[100000];
    int top;
};
struct stack st,s1;


//function for enqueue : pushing element to stack
void enq()
{
    int item;
    scanf("%d",&item);
    st.data[++st.top]=item; // pushing the element and pointing the pointer top to the top element
}


//function for dequeue:removing the element
void deq()
{
    int del;
    while(st.top>=0)
    {
        del = st.data[st.top]; // deleting the element in input stack
        st.top--;
        s1.top++;
        s1.data[s1.top]=del;
    }
    s1.top--;
    while(s1.top>=0)
    {
        del = s1.data[s1.top];// deleting in output stack
        s1.top--;
        st.top++;
        st.data[st.top]=del;
     }
}
int main() {

//intialising the pointer top
st.top=-1;
s1.top=-1;
int t,c;
    scanf("%d",&t);
    while(t--)
    {
        scanf("%d",&c);
        switch(c)
        {
            case 1: enq();
                    break;
            case 2: deq();
                    break;
            case 3: printf("%d\n",st.data[0]);
                    break;
        }
    }
    return 0;
}


        
    

