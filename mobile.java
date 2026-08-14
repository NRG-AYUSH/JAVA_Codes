

interface Playable {
    abstract void play();

    abstract void pause();

}

interface Downloadable {
    abstract void download();

}

class MusicTrack implements Playable {
    @Override
    public void play() {
        System.out.println("PLaying MP3 music......🎵🎶");
    }

    public void pause() {
        System.out.println("MUSIC PAUSED");
    }
}
class VideoFile implements Playable,Downloadable{
    public void play(){
        System.out.println("Playing 1080p Video file... 🎬");
    }
    public void pause(){
        System.out.println("PAUSEDDD VIDEO ||");
    }
public void download(){
    System.out.println("DOWNLOADING THE FILE TO STORAGE");
}
}
class mobile{
    public static void main(String args[]){
        Playable song = new MusicTrack();
        Playable video = new VideoFile();
        VideoFile r=new VideoFile();
        song.play();
        song.pause();
        video.play();
        video.pause();
        r.download();
    }
}