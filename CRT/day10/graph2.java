class Graph{
  int vertices; //number of vertice
  int[][] adjMatrix;
  Graph(int vertices){
    this.vertices=vertices;
    adjMatrix= new int[vertices][vertices];
  }
  void addEdge(int src,int dest){
    adjMatrix[src][dest]=1;
    adjMatrix[dest][src]=1;
  }
  void printGraph(){
    for(int i[]:adjMatrix){
      for(int j:i){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
}

public class graph2 {
  public static void main(String[] args) {
    Graph graph = new Graph(4);
    graph.addEdge(0, 1);
    graph.addEdge(0, 3);
    graph.addEdge(0, 2);
    graph.addEdge(1, 3);
    graph.addEdge(2, 3);
    graph.printGraph();
  
  }
}
