public class Chatbot {
    private String name;

    public Chatbot(){
        System.out.println("チャットボットの原型を作成します。");
    }

    public Chatbot(String name){
        this.name = name;
        System.out.println("チャットボット名" + name + "を作成します。");
    }

    public void greeting(){
        System.out.println("初めまして" + name + "です、よろしくおねがいします");
    }

    public void setName(String _name){
        if(_name.equals("差別用語")){
            System.out.println("禁止されています");
        }else{
            String name1 = this.name;
            String name2 = _name;
            System.out.println("ボット名を" + name1 + "から" + name2 +"へと変更します");
            this.name = _name;
        }
    }
    public String getter(){return this.name;}
}
