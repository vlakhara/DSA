class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] dx = { 0, 0, 1, -1 };
        int[] dy = { 1, -1, 0, 0 };

        boolean[][] visited = new boolean[m][n];
        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.add(new Node(0, 0, 0));
        while (!queue.isEmpty()) {
            Node current = queue.poll();

            int cost = current.cost;
            int row = current.row;
            int col = current.col;

            if (visited[row][col]) {
                continue;
            }
            if (row == m - 1 && col == n - 1) {
                return cost;
            }
            visited[row][col] = true;

            for (int i = 0; i < 4; i++) {
                int newRow = row + dx[i];
                int newCol = col + dy[i];

                if (newRow >= 0 && newCol >= 0 && newRow < m && newCol < n && !visited[newRow][newCol]) {
                    int nCost = cost + ((i + 1) == grid[row][col] ? 0 : 1);
                    queue.add(new Node(nCost, newRow, newCol));
                }
            }
        }

        return -1;
    }
}

class Node implements Comparable<Node> {
    int cost;
    int row;
    int col;

    public Node(int cost, int row, int col) {
        this.cost = cost;
        this.row = row;
        this.col = col;
    }

    @Override
    public int compareTo(Node other) {
        if (this.cost != other.cost) {
            return Integer.compare(this.cost, other.cost);
        } else if (this.row != other.row) {
            return Integer.compare(this.row, other.row);
        } else {
            return Integer.compare(this.col, other.col);
        }
    }

    @Override
    public String toString() {
        return "Cost: " + cost + ", Row: " + row + ", Col: " + col;
    }
}