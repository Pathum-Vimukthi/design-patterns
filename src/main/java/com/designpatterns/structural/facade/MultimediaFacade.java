package com.designpatterns.structural.facade;

public class MultimediaFacade {
    private AudioPlayer audioPlayer;
    private VideoPlayer videoPlayer;
    private Projector projector;

    public MultimediaFacade(AudioPlayer audioPlayer, VideoPlayer videoPlayer, Projector projector) {
        this.audioPlayer = audioPlayer;
        this.videoPlayer = videoPlayer;
        this.projector = projector;
    }

    public AudioPlayer getAudioPlayer() {
        return audioPlayer;
    }

    public VideoPlayer getVideoPlayer() {
        return videoPlayer;
    }

    public Projector getProjector() {
        return projector;
    }

    public void watchMovie(String movie, String audioTrack, String content){
        getVideoPlayer().play(movie);
        getAudioPlayer().play(audioTrack);
        getProjector().play(content);
    }

    public void listenSong(String audioTrack){
        getAudioPlayer().play(audioTrack);
    }
}
