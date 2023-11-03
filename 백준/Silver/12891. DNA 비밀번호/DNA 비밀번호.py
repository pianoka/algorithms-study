S, P = map(int, input().split())
dna = input()
dna_cnt_max_list = list(map(int, input().split()))

dna_list = ('A', 'C', 'G', 'T')
dna_cnt_list = [0] * 4

def add_dna(d):
    for i in range(4):
        if d == dna_list[i]:
            dna_cnt_list[i] += 1

def del_dna(d):
    for i in range(4):
        if d == dna_list[i]:
            dna_cnt_list[i] -= 1

def check_dna():
    for i in range(4):
        if dna_cnt_list[i] < dna_cnt_max_list[i]:
            return False
    return True 

for d in dna[:P]:
    add_dna(d)

cnt = 1 if check_dna() else 0

for i in range(P, S):
    add_dna(dna[i])
    del_dna(dna[i - P])

    if check_dna():
        cnt += 1

print(cnt)