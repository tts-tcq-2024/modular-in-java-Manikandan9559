package colorcoder;

import colorcoder.MajorColorConstants.MAJORCOLOR;
import colorcoder.MinorColorConstants.MINORCOLOR;

public class EventCountColorCodeManager {

    public static void main(String[] args) {
    	ColorCodePairPrinter.printNumberToPair(4, MAJORCOLOR.WHITE, MINORCOLOR.BROWN);
    	ColorCodePairPrinter.printNumberToPair(5, MAJORCOLOR.WHITE, MINORCOLOR.SLATE);
    
    	ColorCodePairPrinter.printPairToNumber(MAJORCOLOR.BLACK, MINORCOLOR.ORANGE, 12);
    	ColorCodePairPrinter.printPairToNumber(MAJORCOLOR.VIOLET, MINORCOLOR.SLATE, 25);
    	
    	ColorCodeManualPrinter.printManual();
    }
}
