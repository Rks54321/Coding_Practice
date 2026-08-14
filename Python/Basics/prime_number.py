import math
num = int(input('Enter a number: '))
if num <= 1:
    print('Number is not a Prime Number')
else:
    is_Prime = True
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            is_Prime = False
            break
    if is_Prime:
        print('Number is a Prime Number')
    else:
        print('Number is not a Prime Number')