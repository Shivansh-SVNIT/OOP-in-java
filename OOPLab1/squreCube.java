public class squreCube
{
    public static void main(String[] args) 
    {
        System.out.printf("Numbers : ");
        for(int i=0;i<11;i++)
        {
            System.out.printf(" %d   ",i);
        }
        System.out.println("");

        System.out.printf("Squre   : ");
        for(int i=0;i<4;i++)
        {
            System.out.printf(" %d   ",i*i);
        }
        for(int i=4;i<11;i++)
        {
            System.out.printf(" %d  ",i*i);
        }
        System.out.println("");

        System.out.printf("cube    :  ");
        for(int i=0;i<3;i++)
        {
            System.out.printf("%d    ",i*i*i);
        }
        for(int i=3;i<5;i++)
        {
            System.out.printf("%d   ",i*i*i);
        }
        for(int i=5;i<11;i++)
        {
            System.out.printf("%d  ",i*i*i);
        }
    }
}