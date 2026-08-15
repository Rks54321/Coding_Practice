import numpy as np
x = np.array([[[0,1],
               [2,3],
               [4,5],
               [6,7],
               [8,9]]])
print('Origiinal array: ',x)
reshaped = x.reshape(10)
print(reshaped)