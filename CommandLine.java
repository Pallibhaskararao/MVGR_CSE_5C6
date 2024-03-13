class CommandLine {    
    public static void main(String args[])
    {
        for(int i =0;i<args.length;i++)
        {
            System.out.println("args[" + i +"] : " + args[i]);
        }
        int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    System.out.println((x+y));
    }
}
