public class Main {


    Human[] humans = new Human[3];
    Cat[] cats = new Cat[3];
    Robot[] robots = new Robot[3];


    public static void main(String[] args) {


    }


    Movie[] setArrMembers()
    {
        for (int i = 0; i < 3;i++)
        {
            humans[i] = new Human(setMaxJump(),setMaxRun());
            cats[i] = new Cat(setMaxJump(),setMaxRun());
            robots[i] = new Robot(setMaxJump(),setMaxRun());
        }

        Movie[] arrMovie = new Movie[9];

        for (int i = 0;i < 1;i++)
        {
            for (int j = 0; j < 9;j+=3)
            {
                arrMovie[j] = humans[i];
                arrMovie[i + 1] = cats[i];
                arrMovie[i + 2] = robots[i];
                i++;

            }
        }


        return  arrMovie;

    }

    void Play(Movie[] arrMovie)
    {
        for (int i = 0;i < arrMovie.length;i++)
        {
            arrMovie[i].jump();
            arrMovie[i].run();
        }
    }

    int setMaxJump()
    {
        return (int) (Math.random()*10);
    }
    int setMaxRun()
    {
        return (int) (Math.random()*10);
    }
}
