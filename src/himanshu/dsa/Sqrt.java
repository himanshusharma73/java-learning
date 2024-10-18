class Sqrt{
    public static void main(String[] args) {
        int n=40;
        int p=3;
        System.out.println(sqrt(n,p));
    }

    static double sqrt(int n,int p){
        int s=0;
        int e=n;
        double root=0.00;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid<n){
                s=mid+1;
                root=mid;

            }
            else{
                e=mid-1;
                root=e;
            }
        }
        Double incr=0.1;
        for (int i = 0; i < p; i++) {
            
            while(root*root<n){
                root=root+incr; 
            }
            root-=incr;
            incr/=10;
        }
        return root;
    }
}