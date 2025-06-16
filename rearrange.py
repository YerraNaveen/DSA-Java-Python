def rearrange_list(nums):
    i = 0
    j = len(nums) - 1
    final = []
    while i <= j:
        if i == j:
            final.append(nums[j])
        else:
            final.append(nums[j])
            final.append(nums[i])
        i+=1
        j-=1
    
    return final


print(rearrange_list([1,2,6,7,8,12,15,19,24,36,43]))