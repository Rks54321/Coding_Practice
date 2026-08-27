class Solution:
    def reverse_string(self, s):
        pass
def main():
    s = list(input('Enter the string: '))
    obj = Solution()
    obj.reverse_string(s)
    print('Reverse String:', "".join(s))
if __name__ == "__main__":
    main()