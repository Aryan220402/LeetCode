#User function Template for python3

class Solution:
    def FirstNonRepeating(self, A):
        mp = {}
        i = j = 0
        s = ''
        while j < len(A):
            mp[A[j]]  = mp.get(A[j], 0) + 1
            while mp[A[i]] != 1 and i < j: i += 1
            if mp[A[j]] != 1 and i == j: s += '#'
            else: s += A[i]
            j += 1
        return s
            
            

#{ 
 # Driver Code Starts

#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		A = input()
		ob = Solution()
		ans = ob.FirstNonRepeating(A)
		print(ans)

# } Driver Code Ends