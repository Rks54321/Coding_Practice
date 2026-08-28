# @title Bank Customer Dataset
# Age , Employment , Marital Status, Balance, Personal Loan, Car Loan, Connection, Month of Join
import numpy as np
banking_array = np.array([[30.0, 'unemployed', 'married', 1787.0, 'no', 'no', 'cellular','oct'],

       [33.0, 'services', 'married', 4789.0, 'yes', 'yes', 'cellular','may'],

       [35.0, 'management', 'single', 1350.0, 'yes', 'no', 'cellular','apr'],

       [30.0, 'management', 'married', 1476.0, 'yes', 'yes', 'unknown','jun'],

       [59.0, 'blue-collar', 'married', 0.0, 'yes', 'no', 'unknown','may'],

       [35.0, 'management', 'single', 747.0, 'no', 'no', 'cellular','feb'],

       [36.0, 'self-employed', 'married', 307.0, 'yes', 'no', 'cellular','may'],

       [39.0, 'technician', 'married', 147.0, 'yes', 'no', 'cellular','may'],

       [41.0, 'entrepreneur', 'married', 221.0, 'yes', 'no', 'unknown','may'],

       [43.0, 'services', 'married', -88.0, 'yes', 'yes', 'cellular','apr'],

       [39.0, 'services', 'married', 9374.0, 'yes', 'no', 'unknown','may'],

       [43.0, 'admin.', 'married', 264.0, 'yes', 'no', 'cellular', 'apr'],

       [36.0, 'technician', 'married', 1109.0, 'no', 'no', 'cellular','aug'],

       [20.0, 'student', 'single', 502.0, 'no', 'no', 'cellular', 'apr'],

       [31.0, 'blue-collar', 'married', 360.0, 'yes', 'yes', 'cellular','jan'],

       [40.0, 'management', 'married', 194.0, 'no', 'yes', 'cellular','aug'],

       [56.0, 'technician', 'married', 4073.0, 'no', 'no', 'cellular','aug'],

       [37.0, 'admin.', 'single', 2317.0, 'yes', 'no', 'cellular', 'apr'],

       [25.0, 'blue-collar', 'single', -221.0, 'yes', 'no', 'unknown','may'],

       [31.0, 'services', 'married', 132.0, 'no', 'no', 'cellular','jul']], dtype=object)

# print(np.unique(banking_array[:,1]))
cust_with_personal_loan = (banking_array[:,4] == 'yes')
# print(banking_array[cust_with_personal_loan])
# print(np.count_nonzero(cust_with_personal_loan))


# Find the count of customers who has connection and has taken car loan
# car_loan = (banking_array[:,5] == 'yes')
# connection = (banking_array[:,6] == 'cellular')
# cond = (car_loan) & (connection)
# print('Count of customers who has connection and has taken car loan', np.count_nonzero(cond))


# Find the count of customers with personal loan and are married and has car loan
# cust_with_personal_loan = (banking_array[:,4] == 'yes')
# car_loan = (banking_array[:,5] == 'yes')
# married = (banking_array[:,2] == 'married')
# cond = (cust_with_personal_loan & car_loan & married)
# print('Count of customers with personal loan and are married and has car loan', np.count_nonzero(cond))


# Find the count of customers whose age is greater than 35 and less than 50 and also find the overall bank balance of these customers
# age = ((banking_array[:,0]) > 35) & ((banking_array[:,0]) < 50)
# overall_balance = ((banking_array[:,3]))
# print('Count of customers whose age is greater than 35 and less than 50 is', np.count_nonzero(age))
# #  Accessing total balance y age condition
# cond = overall_balance[age]
# print('Overall bank balance of these customers is', cond.sum())


# Find the count who are single but have more than average bank balance
# single = (banking_array[:,2] == 'single')
# balance = (banking_array[:,3])
# avg_balance = balance.mean()
#
# print('Average bank balance is: ',avg_balance)
# cond = (single) & (balance > avg_balance)
# print('Customers with balance greater than the average bank balance', np.count_nonzero(cond))

'''Company has decided to give a bonus of 5% of their account balance to those account holders where age is more than or equal
to 55 years and whose account balance is more than 2000. Calculate the sum of the total bank balance to the account holders
after crediting their bonus amount.'''
# age = (banking_array[:,0])
# balance = (banking_array[:,3])
# cond = ((age > 55) & (balance > 2000))
# print(cond)
# tot_bal = balance[cond]
# bonus = 0.05 * tot_bal
# tot_after_bonus = tot_bal + bonus
# print("Total balance before the bonus", tot_bal)
# print('Total balance after the bonus', tot_after_bonus)


'''
Company has decided if the age of the customer is less than 25 then his balance will be credited with 2000
and if it is above then credit 1000.
'''

age = banking_array[:,0]
balance = banking_array[:,3]
cond1 = (age < 25)
cond2 = (age >= 25)
tot_bal_under_25 = balance[cond1]
tot_bal_above_25 = balance[cond2]
bonus1 = 2000 + tot_bal_under_25
bonus2 = 1000 + tot_bal_above_25
print('Customer with age less than 25 and 2000 credited to their total balance', bonus1)
print('Customer with age above 25 and 1000 credited to their total balance', bonus2.sum())










