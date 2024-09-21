package yess;

public class Cat {
    public int age = 1;
    public String name;
    public int hunger = 5;
    public int thirst = 5;
    boolean alive = true;

    public void tick() {
        int max = 5;
        int min = 1;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range);

        if (rand == 5) {
            if (hunger <= 1) {
                alive = false;
                System.out.println("Your cat starved to death!");
            } else {
                hunger--;
            }
        }

        rand = (int)(Math.random() * range);
        if (rand == 5) {
            if (thirst <= 1) {
                alive = false;
                System.out.println("Your cat dehydrated!");
            } else {
                thirst--;
            }
        }

        rand = (int)(Math.random() * range);
        if (rand == 5) {
            age++;
            System.out.println("Your cat is now " + age + " years old!");
        }
    }
}
