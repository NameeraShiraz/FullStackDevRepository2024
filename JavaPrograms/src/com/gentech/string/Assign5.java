package com.gentech.string;

public class Assign5 {

	public static void main(String[] args) {
		String input = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        String modifiedString = addCommaAfterDay(input);
        
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + modifiedString);
    }

    public static String addCommaAfterDay(String input) {
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) 
        {
            if (i <= input.length() - 3 && input.substring(i, i + 3).equals("DAY"))
            {
                i += 2; 
            } 
            else 
            {
                builder.append(input.charAt(i));
            }
        }
        return builder.toString();
    }

}
