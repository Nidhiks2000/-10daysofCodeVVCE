import numpy as np   //importing python library numpy

for _ in range(int(input())):
    input()
    gpa = list(map(float, input().split()))  //intialising gpa
    max_c = -2    // intialisation of maximum coefficient
    for i in range(5):
        xs = list(map(float, input().split()))  
        coefficent = np.corrcoef(gpa, xs)[0,1]   
        if coefficent> max_c:   // condition for checking if coefficient is greater than maximum cofficient 
            max_c = coefficent
            max_i = i
print(max_i+1)
