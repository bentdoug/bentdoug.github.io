public class ForestFires {
    private Tree[][] trees; // 2D array holding trees
    private Deque<Tree> treeDeque; // Deque holding trees that are on fire
    private int N;
    
    /**
     * Initialize a new forest fire simulation on a grid
     * @param N Number of points on the grid
     * @param fireCoords Locations of the starting coordinates of fires
     */
    public ForestFires(int N, int[][] fireCoords) {
        trees = new Tree[N][N];
        this.N = N;
        for (int i = 0; i < N; i++) {
            trees[i] = new Tree[N];
            for (int j = 0; j < N; j++) {
                trees[i][j] = new Tree(i, j);
            }
        }
        treeDeque = new Deque<>();
        for (int k = 0; k < fireCoords.length; k++) {
            int i = fireCoords[k][0];
            int j = fireCoords[k][1];
            trees[i][j].setState(Tree.ON_FIRE);
            treeDeque.addFirst(trees[i][j]);
        }
    }
    
    /**
     * Draw the entire forest with all of the trees their appropriate
     * colors
     * @param frameInterval Number of milliseconds to pause after draw
     */
    private void draw(int frameInterval) {
        StdDraw.clear();
        StdDraw.enableDoubleBuffering();
        for (int i = 0; i < trees.length; i++) {
            for (int j = 0; j < trees[i].length; j++) {
                trees[i][j].draw(trees.length);
            }
        }
        StdDraw.show();
        StdDraw.pause(frameInterval);
    }
    
    /**
     * Perform a simulation of trees setting each other on fire
     * until the entire forest has burned down
     * @param frameInterval Number of milliseconds to pause after draw
     */
    private void doSimulation(int frameInterval) {
        System.out.println("Starting with " + treeDeque.size() + " fires");
        draw(frameInterval);
        while(treeDeque.size() > 1) {
            // TODO: Fill this in
            Tree tree = treeDeque.removeFirst();
            int r = tree.geti();
            int c = tree.getj();
            for(int x = -1; x<2; x++){
                for(int y = -1; y<2; y++){
                    if(r+x<N && c+y<N && r+x>=0 && c+y>=0 && trees[r+x][c+y].getState()==0 && y!=0){
                        trees[r+x][c+y].setState(1);
                        treeDeque.addLast(trees[r+x][c+y]);
                    }
                }
            }
            /**if(trees[r-1][c-1].getState()!=2 || trees[r-1][c-1].getState()!=1){
                trees[r-1][c-1].setState(1);
                treeDeque.addLast(trees[r-1][c-1]);
            }
            if(trees[r-1][c].getState()!=2 || trees[r-1][c].getState()!=1){
                trees[r-1][c].setState(1);
                treeDeque.addLast(trees[r-1][c]);
            }
            if(trees[r-1][c+1].getState()!=2 || trees[r-1][c+1].getState()!=1){
                trees[r-1][c+1].setState(1);
                treeDeque.addLast(trees[r-1][c+1]);
            }
            if(trees[r][c+1].getState()!=2 || trees[r][c+1].getState()!=1){
                trees[r][c+1].setState(1);
                treeDeque.addLast(trees[r][c+1]);
            }
            if(trees[r][c-1].getState()!=2 || trees[r][c-1].getState()!=1){
                trees[r][c-1].setState(1);
                treeDeque.addLast(trees[r][c-1]);
            }
            if(trees[r+1][c-1].getState()!=2 || trees[r+1][c-1].getState()!=1){
                trees[r+1][c-1].setState(1);
            }
            if(trees[r+1][c].getState()!=2 || trees[r+1][c].getState()!=1){
                trees[r+1][c].setState(1);
            }
            if(trees[r+1][c+1].getState()!=2 || trees[r+1][c+1].getState()!=1){
                trees[r+1][c+1].setState(1);
            }
            
            trees[r-1][c].setState(1);
            trees[r-1][c+1].setState(1);
            trees[r][c-1].setState(1);
            trees[r][c+1].setState(1);
            trees[r+1][c-1].setState(1);
            trees[r+1][c].setState(1);
            trees[r+1][c+1].setState(1);
            * */
            
            
            
            
            
            tree.setState(2);
            draw(frameInterval);
                    
        }
        System.out.println("Finished");
    }
    
    public static void main(String[] args) {
        int[][] onFire = {{10, 10}, {25, 25}};
        ForestFires fires = new ForestFires(50, onFire);
        fires.doSimulation(5);
    }
}
