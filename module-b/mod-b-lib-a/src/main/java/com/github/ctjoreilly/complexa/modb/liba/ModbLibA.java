package com.github.ctjoreilly.complexa.modb.liba;

import com.github.ctjoreilly.complexa.modb.libb.ModbLibB;

public class ModbLibA {
    public String doSomething(int arg) {
        return "ModbLibA: " + new ModbLibB().doSomething(arg);
    }
}
