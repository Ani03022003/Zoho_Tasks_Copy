public interface Playable {

    void play();
    void pause();
    void stop();

}

class Mp3Player implements Playable{
    public void play(){
        System.out.println("Mp3 song playing");
    }

    public void pause(){
        System.out.println("Mp3 song pause");
    }

    public void stop(){
        System.out.println("Mp3 song stop");
    }
}

class CDPlayer implements Playable{
    public void play(){
        System.out.println("CD player playing");
    }

    public void pause(){
        System.out.println("CD player is at pause");
    }

    public void stop(){
        System.out.println("CD player stoped");
    }
}

class StreamingPlayer implements Playable{
    public void play(){
        System.out.println("Streaming started");
    }

    public void pause(){
        System.out.println("Streaming paused");
    }

    public void stop(){
        System.out.println("Streaming stoped");
    }
}

class PlayableDemo{
    public static void main(String args[]){
        Playable mp3=new Mp3Player();
        mp3.play();
        mp3.pause();
        mp3.stop();

        Playable cd=new CDPlayer();
        cd.play();
        cd.pause();
        cd.stop();

        Playable sp=new StreamingPlayer();
        sp.play();
        sp.pause();
        sp.stop();
    }
}
