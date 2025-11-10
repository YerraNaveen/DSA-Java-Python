class Solution:
    def threeSum(self, nums):
        l = []
        for i in range(0, len(nums)-1):
            for j in range(i+1, len(nums) -1):
                for k in range(j+1, len(nums) -1):
                    if nums[i] + nums[j] + nums[k]==0:
                        l.append([nums[i], nums[j], nums[k]])


        return l
        


print(Solution().threeSum([-1,0,1,2,-1,-4]))
l = [1,2,3] # 
l2 = [[-1, 0, 1], [-1, 2, -1], [0, 1, -1]]
s = set(l2)
print(s)