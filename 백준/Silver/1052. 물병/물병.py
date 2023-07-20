n1, n2 = map(int, input().split())
cnt = 0;

while bin(n1).count('1') > n2:
    n1 = n1 + 1
    cnt = cnt +1

print(cnt)