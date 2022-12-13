package Assignment8;

import java.util.ArrayList;

class FullStackException extends Exception
{
    FullStackException()
    {
        super("The stack is full!");
    }
}

class EmptyStackException extends Exception
{
    EmptyStackException()
    {
        super("The stack is empty!");
    }
}

class Stack
{
    private int MAX_ELEMENTS;
    private Object[] stack;
    private int size = 0;

    public Stack(int maxElements) throws IllegalArgumentException
    {
        if (maxElements >= 500)
        {
            throw new IllegalArgumentException("Max size should pe less than 500.");
        }

        this.MAX_ELEMENTS = maxElements;
        this.stack = new Object[MAX_ELEMENTS];
    }

    public void push(Object o) throws FullStackException
    {
        if (size == MAX_ELEMENTS)
        {
            throw new FullStackException();
        }

        stack[size++] = o;
    }

    public Object pop() throws EmptyStackException
    {
        if  (size == 0)
        {
            throw new EmptyStackException();
        }

        return stack[--size];
    }
}

class Exceptions {
    public static void main(String[] args)
    {
        ArrayList<Object> objToAdd = new ArrayList<Object>();
        objToAdd.add("John");
        objToAdd.add(11);
        objToAdd.add(new ArrayList<Integer>());
        objToAdd.add("Ion");
        objToAdd.add(25);

        Stack s1 = new Stack(100);

        for (Object o : objToAdd)
        {
            try
            {
                s1.push(o);
                System.out.println(o);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
