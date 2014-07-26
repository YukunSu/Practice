package src;

public class RunGrafixMask {
    public static void main(String[] args){
        GrafixMask tmp = new GrafixMask();
        String[] ss = {"48 192 351 207", "48 392 351 407", "120 52 135 547", "260 52 275 547"};
        int[] temp = tmp.sortedAreas(ss);
        for (int i = 0; i < temp.length; i++) 
            System.out.println(temp[i]);
    }
}
