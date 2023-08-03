def preOrder(current):
    if current != ".":
        left, right = tree[current]
        
        print(current, end="")
        preOrder(left)
        preOrder(right)

def inOrder(current):
    if current != ".":
        left, right = tree[current]
        
        inOrder(left)
        print(current, end="")
        inOrder(right)

def postOrder(current):
    if current != ".":
        left, right = tree[current]
        
        postOrder(left)
        postOrder(right)
        print(current, end="")


N = int(input())

tree = {}
for _ in range(N):
    root, left, right = input().split()
    tree[root] = [left, right]

preOrder("A")
print()
inOrder("A")
print()
postOrder("A")
print()