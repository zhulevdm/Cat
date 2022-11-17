public class Person extends Mammal{
    //String name;
    public Person(String name){
        super(name);
    }

    @Override
    public void speaker(Mammal name,String phrase) {
        name.listen(name, phrase);
    }

    @Override
    public void listen(Mammal name,String phrase) {
        if(phrase == "мур-мур!"){
            System.out.println("Сейчас покормлю!");
        }else {
            System.out.println("Я тебя не понимаю!");
        }
    }

}
