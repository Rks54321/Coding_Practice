yoe = float(input('Enter your year of experience'))
if yoe > 5:
    salary = float(input('Enter your salary'))
    print(f'Current salary: {salary}, Bonus(50%): {salary * 0.5} Salary after Bonus: {salary + (salary * 0.5)}')
else:
    print('No Bonus since years of experience is lesser than 5')