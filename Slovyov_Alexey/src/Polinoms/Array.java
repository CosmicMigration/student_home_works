package Polinoms;

public  class Array {
    private int [] massConst;
    private double[] massDoubl;

    public Array(int c0,int c1,int c2,double x1,double x2){
        massConst=new int[3] ;
        massConst[0]=c0;
        massConst[1]=c1;
        massConst[2]=c2;

        massDoubl=new double[]{x1,x2};
        massDoubl[0]=x1;
        massDoubl[1]=x2;
    }
}
