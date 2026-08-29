def Prime_Num(x):
    if x <= 1:
        return False

    for i  in range (2, x):
        if x % i == 0:
            return False
    return True

num = int(input('Enter a number'))

if Prime_Num(num):
    print('The number is Prime')
else:
    print('The Number is not Prime')
