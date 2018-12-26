package Lesson1.Dog;

public class Dogs {
    String name;

    public static void main(String[] args) {
        Dogs d1 = new Dogs();
  //      d1.Bark();
        d1.name = "Richi";

        Dogs[] myDogs = new Dogs[3];
        myDogs[0] = new Dogs();
        myDogs[1] = new Dogs();
        myDogs[2] = d1;

        myDogs[0].name = "Andry";
        myDogs[1].name = "Serg";

        int x = 0;
        while (x < myDogs.length){
            myDogs[x].Bark();
            x++;
        }

    }

    public void Bark() {
        System.out.println(name + " Say GAVVVV!");
    }
}

//Andry Say GAVVVV!
//Serg Say GAVVVV!
//Richi Say GAVVVV!