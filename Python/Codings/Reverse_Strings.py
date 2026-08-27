class Solution:
    def reverse_string(self, s):
        left = 0
        right = len(s) - 1

        while(left < right):
            temp = s[left]
            s[left] = s[right]
            s[right] = temp
            left += 1
            right -= 1
        return s

def main():
    s = list(input('Enter the String: '))
    obj = Solution()
    res= obj.reverse_string(s)
    print('Reverse String:',"".join(res))
if __name__ == "__main__":
    main()

