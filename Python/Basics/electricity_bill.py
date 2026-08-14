units = float(input('Enter your unit'))
if units > 0 and units <= 100:
    print('No charge')
elif units > 100 and units <= 200:
    print(f'Extra units used {units-100}, charge: {(units-100) * 10}')
elif units > 200:
    print(f'Extra units used {units-100}, charge: {(1000) + ((units-100) * 15)}')
else:
    print('invalid input')