package day44_Abstraction.Animal;

public interface Playable {
    //public and abstract is given default
    //static is also given by default, we dont need to give static keyword
     boolean isFriendly=true;



    void play(); //abstract by default
}
