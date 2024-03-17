package com.designpatterns.structural.facade;

public class User {
    public static void main(String[] args) {
        MultimediaFacade multimediaFacade = new MultimediaFacade(new AudioPlayer(),new VideoPlayer(), new Projector());

        multimediaFacade.watchMovie("The Dark Knight", "mp4", "Dolby");
        multimediaFacade.listenSong("Shape of You");
    }
}
