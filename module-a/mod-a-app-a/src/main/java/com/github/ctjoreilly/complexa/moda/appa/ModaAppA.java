package com.github.ctjoreilly.complexa.moda.appa;

import com.github.ctjoreilly.complexa.moda.liba.ModaLibA;

public class ModaAppA {

    public static void main(String[] args) {
        System.out.println("ModaAppA: " + new ModaLibA().doSomething(args.length));
    }
}
