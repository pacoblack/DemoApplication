package com.github.gang;

public class Single {
    private Single(){}

    static class Inner{
        private static Single Instance = new Single();
    }

    public static Single getInstance(){
        return Inner.Instance;
    }
}
