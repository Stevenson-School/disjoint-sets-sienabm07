public class QuickFind implements DisjointSets {

    private int[] id;

    public QuickFind(int n){
        id = new int[n];
        for(int i = 0; i < n; i++){
            id[i] = i;
        }
    }


    public void connect(int p, int q){
        int qid = id[q];
        int pid = id[p];
        for(int i = 0; i < id.length; i++){
            if(id[i] == qid){
                id[i] = pid;
            }
        }
    }

    public boolean isConnected(int q, int p){
        return (id[q] == id[p]);
    }




}
