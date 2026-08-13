age = int(input('Enter your age: '))
if(age >= 18):
    print('You are eligible to vote')
else:
    print(f'You are not eligible for vote since you require {18-age} years for vote')
