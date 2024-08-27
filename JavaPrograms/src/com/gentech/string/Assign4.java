package com.gentech.string;

public class Assign4 {

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
            builder.append(input.charAt(i));
            if (input.charAt(i) == 'Y') 
            {
                builder.append(",");
            }
        }
        return builder.toString();
    }
}

