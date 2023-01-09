public class Task2HanoiTower {

    public static void main(String[] args) {

        int nDisks = 3;
        String stepsToSolutions = hanoi(nDisks,1,3);

        for(String steps : stepsToSolutions.split(";")){
            System.out.println(steps);
        }

    }

    public static String hanoi(int nDisks, int fromPeg, int toPeg){
        if(nDisks == 1){
            return fromPeg + " -> " + toPeg + ";";
        }
        else {
            String solution1, solution2, solution3;
            int helPeg = 6 - fromPeg - toPeg;

            solution1 = hanoi(nDisks -1,fromPeg,helPeg);
            solution2 = fromPeg + " -> " + toPeg + ";";
            solution3 = hanoi(nDisks - 1,helPeg,toPeg);

            return solution1 + solution2 +solution3;
        }
    }
}
