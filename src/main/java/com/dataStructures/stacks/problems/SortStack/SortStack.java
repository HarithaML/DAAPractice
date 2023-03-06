package com.dataStructures.stacks.problems.SortStack;

import java.util.ArrayList;

public class SortStack {
    Stack stack1;
    Stack stack2 ;
    public SortStack(Stack stack) {
        stack1 = stack;
        stack2 = new Stack();
    }

    public Stack sort(){
        stack2.push(stack1.pop());
        while(!stack1.isEmpty()){
            while(!stack1.isEmpty() && !stack2.isEmpty() && stack1.peek() > stack2.peek()){
                stack2.push(stack1.pop());
            }
            int x = stack1.pop();
            while(!stack2.isEmpty() && x< stack2.peek()){
                stack1.push(stack2.pop());
            }
            stack2.push(x);
        }
        stack1.push(stack2.pop());
        return stack1;
    }

    public Stack sort2(){
        stack2.push(stack1.pop());
        while(!stack1.isEmpty()){
            while(!stack1.isEmpty() && !stack2.isEmpty() && stack1.peek() > stack2.peek()){
                stack2.push(stack1.pop());
            }
            int x = stack1.pop();
            while(!stack2.isEmpty() && x< stack2.peek()){
                stack1.push(stack2.pop());
            }
            stack2.push(x);
        }
        stack1.push(stack2.pop());
        return stack1;
    }

}
