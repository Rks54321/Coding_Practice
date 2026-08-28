class Solution:
    def add_binary(self, a, b):
        i = len(a)-1
        j = len(b)-1
        carry = 0
        result = []
        while i >= 0 or j >= 0 or carry:
            bit_a = int(a[i]) if i >= 0 else 0
            bit_b = int(a[j]) if j >= 0 else 0
            total = bit_a + bit_b + carry
            result.append(str(total % 2))
            carry = total // 2
            i -= 1
            j -= 1
        return "".join(reversed(result))

def main():
    a = input().strip()
    b = input().strip()

    obj = Solution()
    res = obj.add_binary(a, b)
    print(res)
if __name__ == "__main__":
    main()