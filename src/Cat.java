public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speaker(Mammal name,String phrase) {
        if(phrase == "мяу!"){
            System.out.println(phrase);
        }else {
            name.listen(name, phrase);
        }
    }

    @Override
    public void listen(Mammal name,String phrase) {
        if(phrase == "кис-кис"){
            this.speaker(name,"мяу!");
        }else {
            System.out.println("Нужно говорить 'кис-кис'!");
        }
    }
}
