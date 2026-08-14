while True:
    option = int(input("""
  Calculator

  Option 1: Sum
  Option 2: Difference
  Option 3: Product
  Option 4: Quotient
  Option 5: Quit

  Enter your choice: 
  """))
    if option == 5:
        print('Thank you for using my Calculator')
        break
    if option > 4 and option <= 0:
        print('Invalid option, Enter a valid number')
    if option >= 1 and option <= 5:
        num1 = int(input('Enter Number 1: '))
        num2 = int(input('Enter Number 2: '))
        if option == 1:
            sum = num1 + num2
            print(f'Sum = {sum}')
        elif option == 2:
            diff = num1 - num2
            print(f'Difference = {diff}')
        elif option == 3:
            prod = num1 * num2
            print(f'Product = {prod}')
        elif option == 4:
            quot = num1 / num2
            print(f'Quotient = {quot}')


