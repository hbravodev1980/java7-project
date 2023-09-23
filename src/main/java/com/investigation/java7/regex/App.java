package com.investigation.java7.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Pattern pattern1 = Pattern.compile("[abc]", Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern1.matcher("A");
        System.out.println(matcher1.matches());

        Pattern pattern2 = Pattern.compile("[^abc]");
        Matcher matcher2 = pattern2.matcher("d");
        System.out.println(matcher2.matches());

        Pattern pattern3 = Pattern.compile("..m");
        Matcher matcher3 = pattern3.matcher("abm");
        System.out.println(matcher3.matches());

        Pattern pattern4 = Pattern.compile(".*harry.*", Pattern.CASE_INSENSITIVE);
        Matcher matcher4 = pattern4.matcher("Suscribete al canal de Harry");
        System.out.println("matches: " + matcher4.matches());
        System.out.println("looking at: " + matcher4.lookingAt());

        Pattern pattern5 = Pattern.compile("suscribete", Pattern.CASE_INSENSITIVE);
        Matcher matcher5 = pattern5.matcher("Suscribete al suscribete canal suscribete de Harry");
        System.out.println("matches: " + matcher5.matches());
        // Obtiene la primera coincidencia
        //System.out.println("looking at: " + matcher5.lookingAt());

        int count = 0;
        while (matcher5.find()) {
            count++;
            System.out.println("Coincidence number " + count + " start " + matcher5.start() + " end " + matcher5.end());
        }
    }
}