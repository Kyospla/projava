public class Human {
    protected String name;
    protected int age;
    protected String tell;
    Human(String name, int age, String habit){
        this.name=name;
        this.age=age;
        this.tell=habit;
    }
    public void printInfo(){
        System.out.printf("名前:%s 歳:%d歳\n 口癖:%s", this.name,this.age,this.tell);
    }
}
