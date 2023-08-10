n , k = map(int, input().split())
numbers = [i for i in range(1, 4)]
res = []

def dfs(box):
    if sum(box) == n:
        res.append(box)
        return
    
    if len(box) > n: 
        return
    
    for i in numbers:
        dfs(box + [i])
        
dfs([])

if len(res) < k:
    print(-1)
    exit(0)
    
print('+'.join(map(str, res[k - 1])))