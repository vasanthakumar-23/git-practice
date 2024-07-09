class Animal{
       String name;
       String location;
       
}

class Demo{
    public static void main(String args[]){
          Animal Lion=new Animal();
          Animal[] Animals=new Animal[5];
          Lion.name="Alpha";
          Lion.location="africa";
          Animals[0]=Lion;
          System.out.println(Animals[0].location);
    }
}