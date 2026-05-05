class Solution:
    def isPalindrome(self, x: int) -> bool:
        orig = x
        rev = 0
        while x > 0 :
            temp = x % 10
            rev = ( 10 * rev ) + temp
            x = x // 10
        if (rev == orig) :
            return True
        else :
            return False