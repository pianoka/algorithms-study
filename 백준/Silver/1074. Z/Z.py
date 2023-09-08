N, r, c = map(int, input().split())
ans = 0

while N != 0:
    N -= 1
    size = (2 ** N)

    if r < size and c < size:
        ans += size * size * 0
    elif r < size and c >= size: 
        ans += size * size * 1
        c -= size
    elif r >= size and c < size: 
        ans += size * size * 2
        r -= size 
    else:
        ans += size * size * 3
        r -= size
        c -= size
    
print(ans)