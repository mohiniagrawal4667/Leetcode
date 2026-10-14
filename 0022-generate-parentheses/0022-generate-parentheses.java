class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ls=new ArrayList();
                 Parenthesis(n,0,0,"",ls);
                 return ls;
        
    }

    public static void Parenthesis(int n,int open,int closed,String ans,List<String> ls){
        if(open==n && closed == n){
            ls.add(ans);
            return;
        }
        if(open>n|| closed>open){
            return;
        }
        Parenthesis(n,open+1,closed,ans+"(",ls);
        Parenthesis(n,open,closed+1,ans+")",ls);
    }
}