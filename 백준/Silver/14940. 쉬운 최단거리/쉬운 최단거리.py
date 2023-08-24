from collections import deque

width, height = map(int, input().split())

direction = [(1, 0), (-1, 0), (0, 1), (0, -1)]  # 상하좌우
queue = deque([])

input_arr = []
visited_arr = []
answer_arr = []

for x in range(width):
    input_row = list(map(int, input().split()))
    visited_row = []
    answer_row = []

    for y in range(height):
        if input_row[y] == 2:
            queue.append((x, y))
            visited_row.append(True)
            answer_row.append(0)
        elif input_row[y] == 0:
            visited_row.append(False)
            answer_row.append(0)
        elif input_row[y] == 1:
            visited_row.append(False)
            answer_row.append(-1)
            
    input_arr.append(input_row)
    visited_arr.append(visited_row)
    answer_arr.append(answer_row)
    
while queue:
    x, y = queue.popleft()

    for dx, dy in direction:
        nx, ny = x + dx, y + dy
        
        if 0 <= nx < width and 0 <= ny < height and not visited_arr[nx][ny] and input_arr[nx][ny] == 1:
            queue.append((nx, ny))
            visited_arr[nx][ny] = True
            answer_arr[nx][ny] = answer_arr[x][y] + 1
    
for row in answer_arr:
    print(" ".join(str(i) for i in row), end='\n')