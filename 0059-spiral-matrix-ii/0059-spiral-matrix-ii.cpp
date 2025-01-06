class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        vector<vector<int>> v(n, vector<int>(n,0));
        int cls = 0;
        int cle = n - 1;
        int rs = 0;
        int re = n - 1;
        int num = 1;
        while(cls<=cle && rs<=re){
            for(int i=cls; i<=cle; i++){
                v[rs][i] = num;
                num++;
            }
            rs++;
            for(int i=rs; i<=re; i++){
                v[i][cle] = num;
                num++;
            }
            cle--;
            if(rs<=re){
                for(int i=cle; i>=cls; i--){
                    v[re][i] = num;
                    num++;
                }
                re--;
            }
            if(cls<=cle){
                for(int i=re; i>=rs; i--){
                    v[i][cls] = num;
                    num++;
                }
                cls++;
            }
        }
        return v;
    }
};