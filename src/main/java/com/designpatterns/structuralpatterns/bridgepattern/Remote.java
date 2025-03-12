package com.designpatterns.structuralpatterns.bridgepattern;

//Common interface for all remotes

public interface Remote {
    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}
