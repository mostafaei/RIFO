package ch.ethz.systems.netbench.core.run;

public class MainSimulation {

    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Please specify which experiments to run!");
        }

        if (args.length != 1) {
            System.out.println("please specify only one experiment to run!");
        }

        else {
            int figureIndex = Integer.parseInt(args[0]);
            String[] dummy = new String[0];
            if (figureIndex == 7) {
                MainFigure7.main(dummy);
            }
            else if (figureIndex == 8) {
                MainFigure8.main(dummy);
            }
            else if (figureIndex == 9) {
                MainFigure9.main(dummy);
            }
            else if (figureIndex == 10) {
                MainFigure10.main(dummy);
            }
            else if (figureIndex == 12) {
                MainFigure12.main(dummy);
            }
            else if (figureIndex == 13 ) {
                MainFigure13.main(dummy);
            }
            else if (figureIndex == 14) {
                MainFigure14.main(dummy);
            }
            else if (figureIndex == 0)
            {
                MainFigure7.main(dummy);
                MainFigure8.main(dummy);
                MainFigure9.main(dummy);
                MainFigure10.main(dummy);
                MainFigure12.main(dummy);
                MainFigure13.main(dummy);
                MainFigure14.main(dummy);
            }
            else {
                System.out.println("Please specify a legitimate figure index to run: 7, 8, 9, 10, 12, 13, 14, or 0 (run all experiments).");
            }
        }
        //MainFromIntelliJ.main(args);
        //MainForQLen.main(args);
        //MainForCK.main(args);
        //MainFigure8.main(args);
    }

}
