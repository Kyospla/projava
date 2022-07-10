public class Main {
    public static void main(String[] args) {
        Minnsan minnsan =new Minnsan("みん",28,"人間は自由意思を持てない");
        Heika heika =new Heika("陛下ちゃん",28,"メスガキを分からせたい");
        Pohajime pohajime=new Pohajime("はじめ",30,"ダイビングきもちええ");
        minnsan.printInfo();
        heika.printInfo();
        pohajime.printInfo();

        System.out.println(Human.count+"人居ます");
            }
        }
