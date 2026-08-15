import numpy as np
x = np.array([[1,2],
             [2,3],
             [4,5],
             [6,7],
             [7,8]])
print('Original Array: ', x)
reshape = x.reshape(10)
print('Reshaped array: ', reshape)