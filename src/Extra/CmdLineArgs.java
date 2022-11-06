package Extra;

class CmdLineArgs {
    public static void main(String[] args){
        if (args.length > 0){
            System.out.println("Command line args are: ");
            for (String val: args){
                System.out.println(val);
            }
        }else{
            System.out.println("No command line args provided");
        }
    }
}
