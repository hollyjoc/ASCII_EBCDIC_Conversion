package Homework2;

import java.util.*;

/**
 * Class that converts ASCII uppercase/lowercase/punctuation characters
 * to EBDIC
 * @author Holly Calloway
 * Franklin University
 * January 13, 2018
 * Homework 2 - #4
 */
public class alphanumericConversion
{
    //Static HashMap 's to store our Hexadecimal conversion data
    static HashMap<String, String> Hex = new HashMap<String, String>();
    static HashMap<String, String> ASCII_to_EBCDIC = new HashMap<String, String>();

    /*
     * Main Method
     */
    public static void main(String[] args)
    {
        userInput();
    }
    
    /**
     * Adds all characters in the ASCII table that correlate
     * to a Hexadecimal number
     * @return Hex HashMap 
     */
    public static HashMap<String, String> HexTable() 
    {
        Hex.put("!", "21");
        Hex.put("\"", "22");
        Hex.put("#", "23");
        Hex.put("$", "24");
        Hex.put("%", "25");
        Hex.put("&", "26");
        Hex.put("'", "27");
        Hex.put("(", "28");
        Hex.put(")", "29");
        Hex.put("*", "2A");
        Hex.put("+", "2B");
        Hex.put(",", "2C");
        Hex.put("-", "2D");
        Hex.put(".", "2E");
        Hex.put("/", "2F");
        Hex.put("0", "30");
        Hex.put("1", "31");
        Hex.put("2", "32");
        Hex.put("3", "33");
        Hex.put("4", "34");
        Hex.put("5", "35");
        Hex.put("6", "36");
        Hex.put("7", "37");
        Hex.put("8", "38");
        Hex.put("9", "39");
        Hex.put(":", "3A");
        Hex.put(";", "3B");
        Hex.put("<", "3C");
        Hex.put("=", "3D");
        Hex.put(">", "3E");
        Hex.put("?", "3F");
        Hex.put("@", "40");
        Hex.put("A", "41");
        Hex.put("B", "42");
        Hex.put("C", "43");
        Hex.put("D", "44");
        Hex.put("E", "45");
        Hex.put("F", "46");
        Hex.put("G", "47");
        Hex.put("H", "48");
        Hex.put("I", "49");
        Hex.put("J", "4A");
        Hex.put("K", "4B");
        Hex.put("L", "4C");
        Hex.put("M", "4D");
        Hex.put("N", "4E");
        Hex.put("O", "4F");
        Hex.put("P", "50");
        Hex.put("Q", "51");
        Hex.put("R", "52");
        Hex.put("S", "53");
        Hex.put("T", "54");
        Hex.put("U", "55");
        Hex.put("V", "56");
        Hex.put("W", "57");
        Hex.put("X", "58");
        Hex.put("Y", "59");
        Hex.put("Z", "5A");
        Hex.put("[", "5B");
        Hex.put("\\", "5C");
        Hex.put("]", "5D");
        Hex.put("^", "5E");
        Hex.put("_", "5F");
        Hex.put("`", "60");
        Hex.put("a", "61");
        Hex.put("b", "62");
        Hex.put("c", "63");
        Hex.put("d", "64");
        Hex.put("e", "65");
        Hex.put("f", "66");
        Hex.put("g", "67");
        Hex.put("h", "68");
        Hex.put("i", "69");
        Hex.put("j", "6A");
        Hex.put("k", "6B");
        Hex.put("l", "6C");
        Hex.put("m", "6D");
        Hex.put("n", "6E");
        Hex.put("o", "6F");
        Hex.put("p", "70");
        Hex.put("q", "71");
        Hex.put("r", "72");
        Hex.put("s", "73");
        Hex.put("t", "74");
        Hex.put("u", "75");
        Hex.put("v", "76");
        Hex.put("w", "77");
        Hex.put("x", "78");
        Hex.put("y", "79");
        Hex.put("z", "7A");
        Hex.put("{", "7B");
        Hex.put("|", "7C");
        Hex.put("}", "7D");
        Hex.put("~", "7E");
        
        return Hex;  
    }
    
    /**
     * Correlates every ASCII character to an EBCDIC character
     * @return ASCII_to_EBCDIC HashMap 
     */
    public static HashMap<String, String> ASCII_to_EBCDIC_Table()
    {
        ASCII_to_EBCDIC.put("21", "5A");
        ASCII_to_EBCDIC.put("22", "7F");
        ASCII_to_EBCDIC.put("23", "7B");
        ASCII_to_EBCDIC.put("24", "5B");
        ASCII_to_EBCDIC.put("25", "6C");
        ASCII_to_EBCDIC.put("26", "50");
        ASCII_to_EBCDIC.put("27", "7D");
        ASCII_to_EBCDIC.put("28", "4D");
        ASCII_to_EBCDIC.put("29", "5D");
        ASCII_to_EBCDIC.put("2A", "5C");
        ASCII_to_EBCDIC.put("2B", "4E");
        ASCII_to_EBCDIC.put("2C", "6B");
        ASCII_to_EBCDIC.put("2D", "60");
        ASCII_to_EBCDIC.put("2E", "4B");
        ASCII_to_EBCDIC.put("2F", "61");
        ASCII_to_EBCDIC.put("30", "F0");
        ASCII_to_EBCDIC.put("31", "F1");
        ASCII_to_EBCDIC.put("32", "F2");
        ASCII_to_EBCDIC.put("33", "F3");
        ASCII_to_EBCDIC.put("34", "F4");
        ASCII_to_EBCDIC.put("35", "F5");
        ASCII_to_EBCDIC.put("36", "F6");
        ASCII_to_EBCDIC.put("37", "F7");
        ASCII_to_EBCDIC.put("38", "F8");
        ASCII_to_EBCDIC.put("39", "F9");
        ASCII_to_EBCDIC.put("3A", "7A");
        ASCII_to_EBCDIC.put("3B", "5E");
        ASCII_to_EBCDIC.put("3C", "4C");
        ASCII_to_EBCDIC.put("3D", "7E");
        ASCII_to_EBCDIC.put("3E", "6E");
        ASCII_to_EBCDIC.put("3F", "6F");
        ASCII_to_EBCDIC.put("40", "7C");
        ASCII_to_EBCDIC.put("41", "C1");
        ASCII_to_EBCDIC.put("42", "C2");
        ASCII_to_EBCDIC.put("43", "C3");
        ASCII_to_EBCDIC.put("44", "C4");
        ASCII_to_EBCDIC.put("45", "C5");
        ASCII_to_EBCDIC.put("46", "C6");
        ASCII_to_EBCDIC.put("47", "C7");
        ASCII_to_EBCDIC.put("48", "C8");
        ASCII_to_EBCDIC.put("49", "C9");
        ASCII_to_EBCDIC.put("4A", "D1");
        ASCII_to_EBCDIC.put("4B", "D2");
        ASCII_to_EBCDIC.put("4C", "D3");
        ASCII_to_EBCDIC.put("4D", "D4");
        ASCII_to_EBCDIC.put("4E", "D5");
        ASCII_to_EBCDIC.put("4F", "D6");
        ASCII_to_EBCDIC.put("50", "D7");
        ASCII_to_EBCDIC.put("51", "D8");
        ASCII_to_EBCDIC.put("52", "D9");
        ASCII_to_EBCDIC.put("53", "E2");
        ASCII_to_EBCDIC.put("54", "E3");
        ASCII_to_EBCDIC.put("55", "E4");
        ASCII_to_EBCDIC.put("56", "E5");
        ASCII_to_EBCDIC.put("57", "E6");
        ASCII_to_EBCDIC.put("58", "E7");
        ASCII_to_EBCDIC.put("59", "E8");
        ASCII_to_EBCDIC.put("5A", "E9");
        ASCII_to_EBCDIC.put("5B", "BA");
        ASCII_to_EBCDIC.put("5C", "E0");
        ASCII_to_EBCDIC.put("5D", "BB");
        ASCII_to_EBCDIC.put("5E", "B0");
        ASCII_to_EBCDIC.put("5F", "6D");
        ASCII_to_EBCDIC.put("60", "79");
        ASCII_to_EBCDIC.put("61", "81");
        ASCII_to_EBCDIC.put("62", "82");
        ASCII_to_EBCDIC.put("63", "83");
        ASCII_to_EBCDIC.put("64", "84");
        ASCII_to_EBCDIC.put("65", "85");
        ASCII_to_EBCDIC.put("66", "86");
        ASCII_to_EBCDIC.put("67", "87");
        ASCII_to_EBCDIC.put("68", "88");
        ASCII_to_EBCDIC.put("69", "89");
        ASCII_to_EBCDIC.put("6A", "91");
        ASCII_to_EBCDIC.put("6B", "92");
        ASCII_to_EBCDIC.put("6C", "93");
        ASCII_to_EBCDIC.put("6D", "94");
        ASCII_to_EBCDIC.put("6E", "95");
        ASCII_to_EBCDIC.put("6F", "96");
        ASCII_to_EBCDIC.put("70", "97");
        ASCII_to_EBCDIC.put("71", "98");
        ASCII_to_EBCDIC.put("72", "99");
        ASCII_to_EBCDIC.put("73", "A2");
        ASCII_to_EBCDIC.put("74", "A3");
        ASCII_to_EBCDIC.put("75", "A4");
        ASCII_to_EBCDIC.put("76", "A5");
        ASCII_to_EBCDIC.put("77", "A6");
        ASCII_to_EBCDIC.put("78", "A7");
        ASCII_to_EBCDIC.put("79", "A8");
        ASCII_to_EBCDIC.put("7A", "A9");
        ASCII_to_EBCDIC.put("7B", "C0");
        ASCII_to_EBCDIC.put("7C", "4F");
        ASCII_to_EBCDIC.put("7D", "D0");
        ASCII_to_EBCDIC.put("7E", "A1");
        
        return ASCII_to_EBCDIC;
    }
    
    /*
     * Method that searches through the HexTable to find a specific key
     * @return Hex_Char = the desired output
     */
    public static String convertToHex(HashMap<String, String> Hex, String userValue)
    {   
        String Hex_Char = Hex.get(userValue); 
        return Hex_Char;
    }
    
    /*
     * Method that searches through the ASCII_to_EBCDIC_Table to find a specific key
     * @return EBCDIC_Value = the desired output
     */
    public static String convertToEBCDIC(HashMap<String, String> EBCDIC, String Hex_Char)
    {    
        String EBCDIC_Value = EBCDIC.get(Hex_Char);
        return EBCDIC_Value;
    }

    /**
     * Checks to see if input is "exit"
     * @param toExit - compares if variable is "exit"
     */
    public static void exit(String toExit)
    {
        if(toExit.equalsIgnoreCase("exit"))
        {
            System.out.println("\n********************************\n"
                + "Thank you for using my program!");
            System.exit(0);
        }
    }
    /**
     * Method that intakes userInput, error checks the data, and
     * converts it to ASCII or EBCDIC
     */
    public static void userInput()
    {
        //Public variables
        String userValue;
        int userChoice;
        Scanner input = new Scanner(System.in);
        
        System.out.println("This program is designed to convert ASCII characters"
                + " to EBDIC characters; utilizing Hexadecimal conversion between"
                + " the two tables.");

        
        //Variable to keep track of when to "exit"
        //if x = 0 , program exits
        int x = 1;
        while (!(x==0))
        {
            System.out.println("Type 'exit' <without quotations> to exit program. ");
            System.out.print("\n Please enter a capital or a lowercase letter - or a"
                    + " common punctuation character: ");
            userValue = input.nextLine();
            
            //Checks to see if input is "exit"
            //If it is - program exits
            exit(userValue);
            
            //Error checks if input is null or empty
            while(userValue.equals(null) || userValue.equals(""))
            {
                System.out.println("Please enter an approved character");
                System.out.println("Type 'exit' <without quotations> to exit program. ");
                System.out.print("\n Please enter a capital or a lowercase letter - or a"
                        + " common punctuation character: ");
                userValue = input.nextLine();
                
                //Checks to see if input is "exit"
                //If it is - program exits
                exit(userValue); 
            }   
            
            //User decides what output they want
            System.out.println("\nType '0' <without quotations> to convert to ASCII or ");
            System.out.print("Type '1' <without quotations> to convert to EBDIC: ");
            userChoice = input.nextInt();
             
            //Converts the userValue to ASCII or EBCDIC
            //Also does more error checking
            //Verifies that the userValue is an actual ASCII or EBCDIC value
          
            //0 is ASCII conversion
            if (userChoice == 0)
            {
                String ASCII = convertToHex(HexTable(), userValue);
                
                //Checks to see if value is in ASCII table
                if (ASCII == null)
                {
                    System.out.println("The character " + userValue + " doesn't have an equal"
                            + " in ASCII");
                }
                
                else
                {
                    System.out.println("The ASCII value for " + userValue + " is " +
                        ASCII + "\n");
                }
                
            }       
            
                //1 is EBCDIC conversion
            else if (userChoice == 1)
            {
               String Hex_Char = convertToHex(HexTable(), userValue);
               String EBCDIC = convertToEBCDIC(ASCII_to_EBCDIC_Table(), Hex_Char);
               
               //Checks to see if value is in EBCDIC table
               if (EBCDIC == null)
               {
                   System.out.println("The character " + userValue + " doesn't have an equal"
                           + " in EBCDIC");
               }
               
               else
               {
                   System.out.println("The EBCDIC value for " + userValue + " is " +
                    EBCDIC + "\n");          
               }
            }
            
            else 
            {
                break;
            }
            
            input.nextLine();
        }
            
        input.close();
    }
        
}


