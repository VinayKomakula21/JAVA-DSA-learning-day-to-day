import java.util.*;

class GraphDS{
    Map<Integer, ArrayList<Integer>> graph;
    GraphDS(){
        graph = new HashMap<>();
    }

    void addEdge(int source,int destination){
        graph.putIfAbsent(source,new ArrayList<Integer>());
        graph.putIfAbsent(destination,new ArrayList<Integer>());

        graph.get(source).add(destination);
        graph.get(destination).add(source);
    }

    void print(){
        for(int vertex:graph.keySet()){
            System.out.println(vertex+": "+graph.get(vertex));
        }
    }

    void BFS(int start){
        Queue<Integer> queue = new ArrayDeque<>();
        Map<Integer,Boolean> isVisited = new HashMap<>();

        for(int vertex:graph.keySet()){
            isVisited.put(vertex,false);
        }
        queue.offer(start);
        isVisited.put(start,true);
        while(!queue.isEmpty()){
            int tmp = queue.peek();
            for(int nbr:graph.get(tmp)){
                if(!isVisited.get(nbr)){
                    queue.offer(nbr);
                    isVisited.put(nbr,true);
                }
            }
            System.out.print(queue.poll()+" ");
        }
    }

    void findDistances(int start) {
        Queue<Integer> queue = new ArrayDeque<>();
        Map<Integer, Boolean> isVisited = new HashMap<>();
        Map<Integer, Integer> distance = new HashMap<>();
        for(int vertex: graph.keySet()) {
            isVisited.put(vertex, false);
            distance.put(vertex, 0);
        }

        queue.offer(start);
        isVisited.put(start, true);
        distance.put(start, 0);

        while(!queue.isEmpty()) {
            int tmp = queue.peek();
            for(int nbr: graph.get(tmp)) {
                if(!isVisited.get(nbr)){
                    distance.put(nbr, distance.get(tmp)+1);
                    queue.offer(nbr);
                    isVisited.put(nbr, true);
                }
            }
            queue.poll();
        }
        System.out.println(distance);
    }
    void dfsHelper(int current,Map<Integer,Boolean> isVisited){
        isVisited.put(current,true);
        System.out.print(current+" ");

        for(int nbr:graph.get(current)){
            if(!isVisited.get(nbr)){
                dfsHelper(nbr, isVisited);
            }
        }
    }

    void DFS(int start){
        Map<Integer, Boolean> isVisited = new HashMap<>();
        for(int vertex:graph.keySet()){
            isVisited.put(vertex,false);
        }

        dfsHelper(start,isVisited);
    }

    boolean isCyclicHelper(int start,Map<Integer,Boolean> isVisited,int parent){
        isVisited.put(start,true);

        for(int nbr:graph.get(start)){
            if(!isVisited.get(nbr)){
                isCyclicHelper(nbr, isVisited,start);
            }
            else if(nbr != parent)
                return true;
        }
        return false;
    }

    boolean isCyclic(){
        Map<Integer,Boolean> isVisited = new HashMap<>();
        for(int vertex:graph.keySet())
            isVisited.put(vertex, false);
        int start = (int)graph.keySet().toArray()[0];
        int parent = -1;
        boolean found = isCyclicHelper(start,isVisited,parent);
        if(found)
            return true;
        else
            return false;
    }
}

public class GraphDemo {
    public static void main(String[] args) {
        GraphDS g = new GraphDS();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n>0){
            int src = sc.nextInt();
            int dest = sc.nextInt();

            g.addEdge(src, dest);
            n--;
        }
        

        g.print();

        System.out.println(g.isCyclic());
    }
}