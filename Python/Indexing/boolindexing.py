import numpy as np
arr = np.array([[32,5,23,1,43,12,34,34,345,23,23],
                [12,34,34,23,23,34,76,54,76,87,56]])
cond = arr[0] > 70
print('Values are greater than 70 are', arr[0, cond])