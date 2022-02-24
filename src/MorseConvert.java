
public class MorseConvert {

    public String toMorse(String testdatan) {

        String morse = "";

        String[] boks = {"a", "b", "c"};
        String[] mors = {"*-*", "*--*", "*---*"};

        int position = 0;

        for(int i=0; i<3;i++) {
            if(boks[i].equals(testdatan)) {
                position = i;
            }
        }
        return mors[position];

/*
        if(testdatan.equals("E")){
            morse = "*";
        } else if(testdatan.equals("S")) {
            morse = "***";
        }

        return morse;

 */
    }

}
