package src;

public class Circuits {
    private int maxCostForAllNodes;
    private int maxCostForOneNode;
    private int[][] nodesMap;
    private int connections;

    public void initialize(String[] connects, String[] costs) {
        maxCostForAllNodes = 0;
        maxCostForOneNode = 0;
        connections = connects.length;
        nodesMap = new int[connections][connections];
        for (int i = 0; i < connections; i++) {
            String[] connections = connects[i].split("\\s");
            String[] cost = costs[i].split("\\s");
            for (int j = 0; j < connections.length; j++) {
                if (connections[j].length() != 0) {
                    int k = Integer.parseInt(connections[j]);
                    nodesMap[i][k] = Integer.parseInt(cost[j]);
                }
            }
        }
    }

    public int howLong(String[] connects, String[] costs) {
        initialize(connects, costs);

        for (int i = 0; i < connections; i++) {
            maxCostForOneNode = findMaxCostForOneNodeUsingDFS(nodesMap, i);
            maxCostForAllNodes = Math
                    .max(maxCostForAllNodes, maxCostForOneNode);
        }
        return maxCostForAllNodes;
    }

    private int findMaxCostForOneNodeUsingDFS(int[][] nodesMatrix, int nodeIndex) {
        int result = 0;
        int cost = 0;
        for (int i = 0; i < nodesMatrix.length; i++) {
            if (nodesMatrix[nodeIndex][i] > 0) {
                cost = nodesMatrix[nodeIndex][i]
                        + findMaxCostForOneNodeUsingDFS(nodesMatrix, i);
                result = Math.max(result, cost);
            }
        }
        return result;
    }
}
