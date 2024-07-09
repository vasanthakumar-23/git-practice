class Sample{
    private String name;

    public void setter(String name){
          this.name=name;
    }
    public String getter(){
        return name;
    }
}

class Encapsulation{
    public static void main(String args[]){
          var obj1=new Sample();
          obj1.setter("vasanth");
          String MyName=obj1.getter();
          System.out.println(MyName);
    }
}