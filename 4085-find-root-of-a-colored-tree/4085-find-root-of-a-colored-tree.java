class Solution {
    public int findColoredRoot(int[][] edges, String colors) {
        int n = colors.length();
        int[] par = new int[n],deg =  new int[n];
        int[][] helper = edges;

        for(int[] e : helper){
            int u = e[0], v = e[1];
            deg[u]++;
            deg[v]++;

            int a = "RBW".indexOf(colors.charAt(u));
            int b = "RBW".indexOf(colors.charAt(v));

            if((a+1) % 3 == b) par[v]++;
            else if((b+1) % 3 == a) par[u]++;
            else return -1;

            if(par[u] > 1 || par[v] > 1) return -1;
            
        }

        int root = -1;
        for(int i=0;i<n;i++){
            if(par[i] == 0){
                if(root != -1 || deg[i] > 2) return -1;
                root = i;
            }
        }
        return root;
    }
}