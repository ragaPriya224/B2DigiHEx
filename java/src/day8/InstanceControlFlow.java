package src.day8;

public class InstanceControlFlow{
int i = 10; //3 //9
{   //4
    m1();  //10
    System.out.println("first block"); //12
}

InstanceControlFlow() {  //5
    System.out.println("CONSTRUCTOR"); //15
}

public static void main(String[] args) { //1
    InstanceControlFlow i = new InstanceControlFlow();  //2
    System.out.println("main method"); //16
    InstanceControlFlow i2 = new InstanceControlFlow(); 
}
public void m1(){   //6
    System.out.println(j);  //11
}
{ //7
    System.out.println("second block"); //13
}
int j = 20;  //8  //14
}


// a. identity sttic and all those steps  [1,2]
// 1. identification of instance members from top to bottom[3-8]
// 2. execution of instance variable assignments and instance blocks from top to bottom[9-14]
// 3. constructor  execution 

//output prediction
//0
//first block
//second block
//CONSTRUCTOR
//"main method


// static flow - only once
// instancfe flow -> happen for every object