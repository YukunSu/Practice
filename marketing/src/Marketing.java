package src;

public class Marketing {
    private boolean[][] matrix;
    private int[] AdultsOrTeenager;
    private boolean oddNumberofNodes;
    private int competeLength;

    public void initialize(int length) {
        matrix = new boolean[length][length];
        AdultsOrTeenager = new int[length];
        oddNumberofNodes = false;
        competeLength = length;

        for (int i = 0; i < competeLength; i++)
            AdultsOrTeenager[i] = 0;

        for (int i = 0; i < competeLength; i++) {
            for (int j = 0; j < competeLength; j++)
                matrix[i][j] = false;
        }
    }

    public long howMany(String[] compete) {
        int base = 0;
        long result = 1;

        if (compete == null || compete.length == 0)
            return -1;

        initialize(compete.length);

        for (int i = 0; i < competeLength; i++) {
            if (!compete[i].equals("")) {
                // '\s' means a whitespace character: [ \t\n\x0B\f\r]
                String[] competeTarget = compete[i].split("\\s");
                for (int j = 0; j < competeTarget.length; j++) {
                    matrix[i][Integer.parseInt(competeTarget[j])] = true;
                    matrix[Integer.parseInt(competeTarget[j])][i] = true;
                }
            }
        }

        for (int i = 0; i < competeLength; i++) {
            if (AdultsOrTeenager[i] == 0) {
                base++;
                depthFirstSearch(i, 1);
            }
        }

        if (oddNumberofNodes)
            result = -1;
        else
            result = (long) Math.pow(2, base);

        return result;
    }

    public void depthFirstSearch(int productIndex, int targetValue) {
        if (AdultsOrTeenager[productIndex] != 0) {
            // odd number of nodes
            if (AdultsOrTeenager[productIndex] != targetValue)
                oddNumberofNodes = true;
            return;
        }

        // Assign a value to the node
        AdultsOrTeenager[productIndex] = targetValue;
        for (int v = 0; v < competeLength; v++) {
            // recursively call dfs
            if (matrix[productIndex][v])
                depthFirstSearch(v, 3 - targetValue);
        }
    }
}
