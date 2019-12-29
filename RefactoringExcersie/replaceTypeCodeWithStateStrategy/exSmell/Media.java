package exSmell;

public enum Media {
	NULL {
		@Override
		public void play() {
			// TODO Auto-generated method stub
			 System.out.println("Null: play");
		}

		@Override
		public void loop() {
			// TODO Auto-generated method stub
			System.out.println("Null: loop");
		}

		@Override
		public void stop() {
			// TODO Auto-generated method stub
			System.out.println("Null: stop");
		}
	}, VIDEO {
		@Override
		public void play() {
			// TODO Auto-generated method stub
			System.out.println("Video: play");
		}

		@Override
		public void loop() {
			// TODO Auto-generated method stub
			System.out.println("Video: loop");
		}

		@Override
		public void stop() {
			// TODO Auto-generated method stub
			 System.out.println("Video: stop");
		}
	}, MUSIC {
		@Override
		public void play() {
			// TODO Auto-generated method stub
			System.out.println("Music: play");
		}

		@Override
		public void loop() {
			// TODO Auto-generated method stub
			System.out.println("Music: loop");
		}

		@Override
		public void stop() {
			// TODO Auto-generated method stub
			System.out.println("Music: stop");
		}
	};
	
	public abstract void play();
	public abstract void loop();
	public abstract void stop();
	
}
