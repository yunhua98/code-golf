public class P1{public static void main(String[]a){for(int i=2;i<12;++i){boolean p=true;for(int j=i-1;j>1;--j){if(i%j==0)p=false;}if(p)System.out.println(i);};for(int i=1;i<10;++i){for(int j=1;j<10;++j){int m=i*101+j*10;boolean q=true;for(int k=m-1;k>1;--k)if(m%k==0)q=false;if(q)System.out.println(m);}}}}