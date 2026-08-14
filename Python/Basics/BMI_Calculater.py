height_m = float(input('Enter the height in meters: '))
weight_kg = float(input('Enter the weight in kilogram: '))
BMI = weight_kg / (height_m ** 2)
if BMI < 18.5:
    print(f'BMI score is {BMI} Underweight')
elif BMI >= 18.5 and BMI < 24.9:
    print(f'BMI score is {BMI} Normmal weight')
elif BMI >= 24.9 and BMI < 29.9:
    print(f'BMI score is {BMI} Overweight')
else:
    print(f'BMI score is {BMI} Obese')