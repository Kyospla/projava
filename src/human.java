public class human {
    protected static String name;
    protected int age;
    protected String tell;
    human(String race,int age,String habit){
        human.name=name;
        this.age=age;
        this.tell=habit;
    }
    public void printInfo(){
        System.out.printf("名前:%s 歳:%d歳\n 口癖:%s",human.name,this.age,this.tell);
    }
}
