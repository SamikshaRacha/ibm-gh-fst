package fst;

// Base class
class Human {
    protected static int humanCount = 0;

    public Human() {
        humanCount++;
    }

    public void walking() {
        System.out.println("Human is walking");
    }

    public void talking() {
        System.out.println("Human is talking");
    }

    public static int getHumanCount() {
        return humanCount;
    }
}

// Boy class
class Boy extends Human {
    public Boy() {
        super();
    }
}

// Girl class
class Girl extends Human {
    public Girl() {
        super();
    }
}

// Robot class (separate counter)
class Robot {
    private static int robotCount = 0;

    public Robot() {
        robotCount++;
    }

    public void walking() {
        System.out.println("Robot is walking");
    }

    public void talking() {
        System.out.println("Robot is talking");
    }

    public static int getRobotCount() {
        return robotCount;
    }
}

// Main class
public class PopulationDemo {
    public static void main(String[] args) {

        // Create 3 boys
        Boy b1 = new Boy();
        Boy b2 = new Boy();
        Boy b3 = new Boy();

        // Create 3 girls
        Girl g1 = new Girl();
        Girl g2 = new Girl();
        Girl g3 = new Girl();

        // Create 3 robots
        Robot r1 = new Robot();
        Robot r2 = new Robot();
        Robot r3 = new Robot();

        // Calling methods (example)
        b1.walking();
        g1.talking();
        r1.walking();

        // Print populations
        System.out.println("Total Humans: " + Human.getHumanCount());
        System.out.println("Total Robots: " + Robot.getRobotCount());
    }
}