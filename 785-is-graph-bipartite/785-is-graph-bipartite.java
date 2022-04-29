class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        Arrays.fill(color, -1);
        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) {
                color[i] = 0;
                if(!dfs(i, graph, color)) 
                    return false;
            }
        }
                
        return true;
    }
    
    private boolean dfs(int node, int[][] graph, int[] color) {
        for(int nei: graph[node]) {
            if (color[nei] == color[node])
                return false;
            if (color[nei] == -1) {
                color[nei] = 1 - color[node];
                if(!dfs(nei, graph, color)) 
                    return false;
            }
        }    
        return true;
    }
}