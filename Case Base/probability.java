class probability
{
    public static void main(String[] args) 
    {
        int trow=1000000;
        int odd=0;

        for(int i=0;i<trow;i++)
        {
            double x=Math.random();
            double y=Math.random();
            if(x<=0.5)
            {
                odd++;
            }
            else if(x+y<=1.5 && y>0.5)
            {
                odd++;
            }
        }
        System.err.println("prob is "+((double)odd/trow));
    }
}