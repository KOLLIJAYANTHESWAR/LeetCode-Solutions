import heapq
from typing import List
class Solution:
    def trapRainWater(self, heightMap: List[List[int]]) -> int:
        if not heightMap or not heightMap[0]:
            return 0

        m, n = len(heightMap), len(heightMap[0])
        if m < 3 or n < 3:
            return 0  # too small to trap water

        visited = [[False] * n for _ in range(m)]
        heap = []  # min-heap storing (height, row, col)

        # Add all boundary cells to heap
        for r in range(m):
            for c in (0, n - 1):
                heapq.heappush(heap, (heightMap[r][c], r, c))
                visited[r][c] = True
        for c in range(n):
            for r in (0, m - 1):
                if not visited[r][c]:
                    heapq.heappush(heap, (heightMap[r][c], r, c))
                    visited[r][c] = True

        res = 0
        directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]

        # Process cells from lowest boundary upwards
        while heap:
            h, r, c = heapq.heappop(heap)
            for dr, dc in directions:
                nr, nc = r + dr, c + dc
                if 0 <= nr < m and 0 <= nc < n and not visited[nr][nc]:
                    visited[nr][nc] = True
                    nh = heightMap[nr][nc]
                    if nh < h:
                        res += h - nh  # trapped water
                    heapq.heappush(heap, (max(h, nh), nr, nc))

        return res
