import java.util.Stack;
public class LabStack02 {

    public static void main(String[] args) {
        Stack<Integer> stacks = new Stack<>();
        int[] track = {1, 2, 3, 4, 5};

        for (int num : track) {
            System.out.println ("Push in track : " + num);
            stacks.push(num);
        }
        System.out.println("Train car after into dead-end track : " + stacks.toString());
        System.out.println();

        while(!stacks.isEmpty()) {
            System.out.println("Pop from track : " + stacks.peek());
            stacks.pop();
        }
        System.out.println("Train car after out of dead-end track : " + stacks.toString());
    }
}

