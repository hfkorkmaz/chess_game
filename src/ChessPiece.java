public abstract class ChessPiece {
    /**
     * ChessPiece Class
     */

    protected Location location = new Location();
    protected int status;

    protected ChessPiece(int x, int y) {
        this.location.setLocation(x, y);
        this.status = 1;
    }
    
	protected boolean isPossible(Location targetLocation) {
		return true;
		// override
    }
    
    protected Location[] getPath(Location targetLocation) {
        Location[] path = new Location[8];
        path[0] = this.getLocation();
        return path;
        // override
    }

    protected void kill() {
        this.status = 0;
    }

    protected int getStatus() {
        return this.status;
    }

    protected Location getLocation() {
        return this.location;
    }

    protected void setLocation(Location location) {
        this.location = location;
    }
}
