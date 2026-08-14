database = {
    'user1': '12345',
    'user2': '123@abc',
    'user3': '654321'
}
username = input('Enter your username')
if username in database.keys():
    password = input('Enter your password')
    if password == database[username]:
        print('Welcome', username)
    else:
        print('Invalid password')
else:
    print('Invalid username')