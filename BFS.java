class CheckBFS {

  //Breadth First Traversal of Graph g 
  public static String bfs(Graph g) {
    String result = "";

    // Write - Your - Code
    boolean visited[] = new boolean[g.vertices];

    for(int i=0;i<g.vertices;i++){
        if(!visited[i]){
          result += bfsString(g,i,visited);
        }
    }

    return result; 
  }

  public static String bfsString(Graph g,int v,boolean[] visited){

      Queue<Integer> queue = new Queue<>(g.vertices);

      int curr_node = v;
      queue.enqueue(curr_node);
      visited[curr_node] = true;

      String res = "";

      while(!queue.isEmpty()){

        curr_node = queue.dequeue();
        res =  res+String.valueOf(curr_node);

        DoublyLinkedList<Integer>.Node temp = null;
        if(g.adjacencyList[curr_node]!=null)
          temp = g.adjacencyList[curr_node].headNode;

        while(temp!=null){
          if(!visited[temp.data]){
            queue.enqueue(temp.data);
            visited[temp.data] = true;
          }
          temp = temp.nextNode;
        }


      }
      return res;
  }

}
