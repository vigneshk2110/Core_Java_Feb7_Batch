package controlFlowStatement;

public class EnhancedSwitchCase{
    public static void main(String[] args) {
    	
        int dayOfWeek = 5;

//        switch (dayOfWeek) {
//            case 6, 7: // Monday and Sunday
//                System.out.println("Weekend!");
//                break;
//            case 1, 2, 3, 4: // Tuesday to Friday
//                System.out.println("Weekday!");
//                break;
//            case 5: // Saturday
//                System.out.println("Religious Day!");
//                break;
//            default:
//            	System.out.println("Please enter the Right Day of the week");
//             
//        }
        
        switch(dayOfWeek) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        	System.out.println("Weekday");
        	break;
        case 6:
        case 7:
        	System.out.println("Weekday");
        	break;
        default:
        	System.out.println("Please enter the Right Day of the week");
        }
    }
}