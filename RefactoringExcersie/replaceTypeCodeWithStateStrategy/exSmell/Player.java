package exSmell;



class Player {
	
	
    private Media _media = Media.NULL;
    public void play() {
      _media.play();
    }
    public void loop() {
        _media.loop();
    }
    public void stop() {
        _media.stop();
    }
    public void setMedia(Media media) {
        if (media == null) {
            _media = Media.NULL;
        } else {
            _media = media;
        }
    }
}
