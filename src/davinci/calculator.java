package davinci;

/**
 * Created by vmishra on 7/29/2016.
 */
public class calculator {

    public String myName(String fName, String lName){
        String religion;
        religion = decideTheReligion(lName);
        String myFullName="Your Full Name is :" +fName + " " + lName + "& I am a " + religion;

        return myFullName;
    }

    private String decideTheReligion(String surName){

        String religion="";

        switch(surName){

            case "Mishra":
            case  "Sharma":
            case "Yadav":
            {
                religion="Hindu";
                break;
            }
            case "Ali":
            case  "Mohammad":
            case "Khan":
            {
                religion="Muslim";
                break;
            }

            default:
            {
                religion="Christian";
                break;
            }

        }

        return religion;
    }

}
