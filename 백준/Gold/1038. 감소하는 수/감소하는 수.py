from itertools import combinations

n = int(input())
nums = list() 

for i in range(1, 11):
    for comb in combinations(range(0, 10), i):
        comb = list(comb)
        comb.sort(reverse=True)
        nums.append(int("".join(map(str, comb))))

nums.sort()
print(nums[n] if len(nums) > n else -1)