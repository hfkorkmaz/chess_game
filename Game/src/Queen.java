class Queen extends ChessPiece {
    /**
     * Queen Class
     */

    public Queen(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean isPossible(Location targetLocation) {
        return true;
    }
    
    @Override
    public Location[] getPath(Location targetLocation) {
        Location[] path = new Location[10];
        path[0] = this.getLocation();
        // todo
        return path;
    }
}