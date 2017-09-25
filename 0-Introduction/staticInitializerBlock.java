~~~~~~~~~~~~~~~~~~~~~~~~~~ Static initializer block
// A class can have any number of static initialization blocks,
// and they can appear anywhere in the class body. The runtime
// system guarantees that static initialization blocks are called
// in the order that they appear in the source code.

static int B, H;
static boolean flag;

static {
  Scanner scan = new Scanner(System.in);
  B = scan.nextInt();
  H = scan.nextInt();
  
  if(B <= 0 || H <= 0){  
    System.out.format("java.lang.Exception: Breadth and height must be positive");
  } else{
    flag = true;
  }
  
}