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
        // push first element of stack1 to stack2
        stack2.push(stack1.pop());

        //compare top elements
        while(!stack1.isEmpty()){
            compare();
        }

        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

        return stack1;

    }

    public void compare(){
        if(stack2.isEmpty()){
            stack2.push(stack1.pop());
        }else{
            //if top of stack1 is less than top of stack2
            if(stack1.peek()<=stack2.peek()){
                //add top element of stack1 to variable
                int x = stack1.pop();
                // push all elements greater than
                // top of stack1 in stack2 to stack1
                while(!stack2.isEmpty()){
                    if(stack2.peek()>x){
                        stack1.push( stack2.pop());
                    }else {
                        break;
                    }
                }
                stack2.push(x);

            }//if top of stack1 is more than top of stack2
            else{
                stack2.push(stack1.pop());

            }
        }

    }

}
