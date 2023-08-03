public class Elevator {
    private int currentFloor = 1;
    private final int minFloor;
    private final int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown () {
        if (currentFloor > minFloor) {
            currentFloor--;
        }
    }

    public void moveUp () {
        if (currentFloor < maxFloor) {
            currentFloor++;
        }
    }

    public void move (int floor) {
        if (floor == currentFloor) {
            return;
        } else if (floor >= minFloor && floor <= maxFloor) {
            if (floor > currentFloor) {
                for (int i = currentFloor; i < floor; i++) {
                    moveUp();
                    System.out.println(currentFloor);
                }
            } else if (floor < currentFloor) {
                for (int i = currentFloor; i > floor; i--) {
                    moveDown();
                    System.out.println(currentFloor);
                }
            }
        } else {
            System.out.println("Error");
        }
    }
}
