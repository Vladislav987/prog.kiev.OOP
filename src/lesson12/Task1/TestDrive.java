package lesson12.Task1;

public class TestDrive {
    public static void main(String[] args)  {
        String in = "D:\\IdeaProjects\\Lessons\\Proff\\prog.kiev.OOP\\src\\lesson12\\iO\\Task1\\hamlet.txt";
        String out = "D:\\IdeaProjects\\Lessons\\Proff\\prog.kiev.OOP\\src\\lesson12\\iO\\Task1\\\\hamlet-with-line-nums.txt";
        new FileLineNumerator(in,out).runLineNumeration();
    }
}

//1. To be, or not to be: that is the question:
//2. Whether 'tis nobler in the mind to suffer
//3. The slings and arrows of outrageous fortune,
//4. Or to take arms against a sea of troubles,
//5. And by opposing end them? To die: to sleep;
//6. No more; and, by a sleep to say we end
//7. The heart-ache and the thousand natural shocks
//8. That flesh is heir to, 'tis a consummation
//9. Devoutly to be wish'd. To die, to sleep;
//10. To sleep: perchance to dream: ay, there's the rub.
